/*
 * BSD License
 *
 * Open Source Fixedpoint Model-Checker Graphical User Interface version 2019
 *
 * (C) Copyright �lfur J�hann Edvardsson 2019
 * (C) Copyright Veronica Julie Lodskov Hoffmann 2019
 *
 * All Rights Reserved.
 *
*/

package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Parser.AST;

public class AnalyseProtocol {
	private String userDir,OS, errormsg;
	private List<String> originalAnalysis, configs;
	private File analysis, anbfile, errorAnB;
	private TheParser pp;
	

	public AnalyseProtocol() {
		userDir = System.getProperty("user.dir");
		analysis = new File(userDir+"//analysis.txt");
		anbfile = new File(userDir+"//temp.AnB");
		errorAnB = new File(userDir+"//error.AnB");
		originalAnalysis = new ArrayList<String>();
		this.OS = System.getProperty("os.name");
		this.pp = new TheParser("p");
		this.errormsg = "";
	}

	public List<AST> getActions() {
		return pp.getActions();
	}

	public String getAgents() {
		return pp.getAgents();
	}

	// Runs OFMC through cmd / terminal with supplied arguments
	public void run(String content) {
		try {
			buildModifiedProtocol(pp.getParsedProtocol());
			String s = "";
			Process p;
			if (this.OS.startsWith("Windows")) {
				s ="C:\\Windows\\system32\\cmd.exe /C start /wait /MIN ofmc -o " + "\"" + userDir + "\\analysis.txt\" " + configs.get(0) + " \"" + anbfile.getAbsolutePath().replaceAll("\\\\","\\\\\\\\") + "\"";
				p = Runtime.getRuntime().exec(s , null, new File( configs.get(1) ));
				p.waitFor();
			}
			else if (this.OS.startsWith("Mac")) {
				if (!configs.get(2).equals("")) p = new ProcessBuilder(configs.get(1) + "/./ofmc", "-o", userDir + "/analysis.txt", "--numSess",configs.get(0), "--depth", configs.get(2), anbfile.getAbsolutePath()).start();
				else p = new ProcessBuilder(configs.get(1) + "/./ofmc", "-o", userDir + "/analysis.txt", "--numSess",configs.get(0), anbfile.getAbsolutePath()).start();
				p.waitFor();

			}
			else if (this.OS.startsWith("Linux")) {
				if (!configs.get(2).equals("")) p = new ProcessBuilder(configs.get(1) + "/./ofmc", "-o", userDir + "/analysis.txt", "--numSess",configs.get(0), "--depth", configs.get(2), anbfile.getAbsolutePath()).start();
				else p = new ProcessBuilder(configs.get(1) + "/./ofmc", "-o", userDir + "/analysis.txt", "--numSess",configs.get(0), anbfile.getAbsolutePath()).start();
				p.waitFor();
			}

			if(!read()) {
				pp.syntaxError = true;
				throw new Exception();
			}
			analysis.deleteOnExit();
		} catch (Exception e) {
			
			if (pp.syntaxError) {
				try {
					PrintWriter writer;
					writer = new PrintWriter(errorAnB);
					writer.println(content);
					writer.close();
					errorAnB.deleteOnExit();
					errormsg = "";
					
					String s = "";
					Process p;
					if (this.OS.startsWith("Windows")) {
						ProcessBuilder pb = new ProcessBuilder();
						pb.command("cmd.exe", "/c", "ofmc " + configs.get(0) + " \"" + errorAnB.getAbsolutePath().replaceAll("\\\\","\\\\\\\\") + "\"");
						Process pro = pb.start();
						BufferedReader r = new BufferedReader(new InputStreamReader(pro.getErrorStream()));

			            String line;
			            while ((line = r.readLine()) != null) {
			                errormsg = errormsg + line;
			            }
			            pro.waitFor();
					}
					else if (this.OS.startsWith("Mac")) {
						if (!configs.get(2).equals("")) p = new ProcessBuilder(configs.get(1) + "/./ofmc", "--numSess",configs.get(0), "--depth", configs.get(2), errorAnB.getAbsolutePath()).start();
						else p = new ProcessBuilder(configs.get(1) + "/./ofmc",  "--numSess",configs.get(0), anbfile.getAbsolutePath()).start();
						
						BufferedReader r = new BufferedReader(new InputStreamReader(p.getErrorStream()));

			            String line;
			            while ((line = r.readLine()) != null) {
			                errormsg = errormsg + line;
			            }
			            p.waitFor();
					}
					else if (this.OS.startsWith("Linux")) {
						if (!configs.get(2).equals("")) p = new ProcessBuilder(configs.get(1) + "/./ofmc", "--numSess",configs.get(0), "--depth", configs.get(2), errorAnB.getAbsolutePath()).start();
						else p = new ProcessBuilder(configs.get(1) + "/./ofmc", "--numSess",configs.get(0), anbfile.getAbsolutePath()).start();
						
						BufferedReader r = new BufferedReader(new InputStreamReader(p.getErrorStream()));

			            String line;
			            while ((line = r.readLine()) != null) {
			                errormsg = errormsg + line;
			            }
			            p.waitFor();
					}
					
				} catch (Exception ex) {

				}
			}
		} 
	}

	// read output of ofmc and send to the parser
	private boolean read() {
		originalAnalysis = new ArrayList<String>();
		try {
			Scanner s = new Scanner(analysis);
			while (s.hasNext()) originalAnalysis.add(s.nextLine());
			s.close();
		} catch (Exception e) {

		}
		String output = "";
		for (String a : originalAnalysis) output = output + a + "\n";
		if (output.equals("")) return false;
		pp.setType("a");
		pp.parse(output);
		return true;

	}
	
	public String geterrormsg() {
		return this.errormsg;
	}

	public void modifyProtocol(String s) {
		pp.parse(s);
	}

	public String getAnalysis(){
		String analysis = "";
		for (String line : originalAnalysis) {
			analysis = analysis + line + "\n";
		}
		return analysis;
	}

	public void buildModifiedProtocol(String content) {
		try {
			PrintWriter writer;
			writer = new PrintWriter(anbfile);
			writer.println(content);
			writer.close();
			anbfile.deleteOnExit();
		} catch (IOException ex) {

		}
	}

	public List<AST> getSimpleAnalysis() {
		if (!getAttackFound()) return new ArrayList<AST>();
		return pp.getAttackTrace();
	}

	public boolean getAttackFound() {
		return this.pp.attackFound();
	}

	public void setConfigs(List<String> configs) {
		this.configs = configs;
	}
	
	public boolean getSyntaxError() {
		return pp.syntaxError;
	}

}
