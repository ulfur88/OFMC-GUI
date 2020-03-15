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

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Parser.Option;

public class Tracer {
	private String userDir, OS;
	private List<String> configs, theTrace;
	private List<String> stepsTakenList;
	private File traceFile, anbfile;
	private String stepsTaken;
	private boolean traceDone;
	private TheParser parser;


	public Tracer (TheParser parser) {
		userDir = System.getProperty("user.dir");
		theTrace = new ArrayList<String>();
		traceFile = new File(userDir+"//tracing.txt");
		stepsTaken = "";
		stepsTakenList = new ArrayList<String>();
		anbfile = new File(userDir+"//temp.AnB");
		traceDone = false;
		this.OS = System.getProperty("os.name");
		this.parser = parser;
	}

	public void runTrace() {
		try {
			//Modify the protocol before the protocol is supplied to ofmc
			buildModifiedProtocol(parser.getParsedProtocol());

			String s = "";
			Process p;
			if (this.OS.startsWith("Windows")) {
				s = "cmd.exe /C start /wait /MIN ofmc -o " + "\"" + userDir + "\\tracing.txt\" " + configs.get(0) + " \"" + anbfile.getAbsolutePath().replaceAll("\\\\","\\\\\\\\") + "\"" + " --trace" + stepsTaken;
				p = Runtime.getRuntime().exec(s , null, new File( configs.get(1) ));
				p.waitFor();
			}
			else if (this.OS.startsWith("Mac")) {
				s = configs.get(1) +"/ofmc -o "  + userDir + "/tracing.txt " + configs.get(0) + " " + anbfile.getAbsolutePath() + " --trace" + stepsTaken;
				p = Runtime.getRuntime().exec(s);
				p.waitFor();
			}
			else if (this.OS.startsWith("Linux")) {
				s = configs.get(1) +"/ofmc -o "  + userDir + "/tracing.txt " + configs.get(0) + " " + anbfile.getAbsolutePath() + " --trace" + stepsTaken;
				p = Runtime.getRuntime().exec(s);
				p.waitFor();
			}

			read();
			if (!(theTrace.size()>0)); // error msg
			traceFile.deleteOnExit();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	//read output from ofmc
	private void read() {
		theTrace = new ArrayList<String>();
		try {
			Scanner s = new Scanner(traceFile);
			while (s.hasNext()) theTrace.add(s.nextLine());
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String output = "";
		for (String a : theTrace) output = output + a + "\n";
		parser.setType("t");
		parser.parse(output);
		parser.modifyTracer();
	}

	public void modifyProtocol(String s) {
		parser.parse(s);
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
	
	// add the step taken in trace to the list of steps taken
	public void addToStepsTaken(int i, String step) {
		this.stepsTaken = stepsTaken + " " + i;
		stepsTakenList.add(step);
	}

	public void removeStepTaken() {
		stepsTaken = stepsTaken.substring(0,stepsTaken.lastIndexOf(" "));
		stepsTakenList.remove(stepsTakenList.size() - 1);
	}


	public void setConfigs(List<String> configs) {
		this.configs = configs;
	}

	public boolean getTraceDone() {
		return this.traceDone;
	}

	public List<Option> getOptions() {
		return parser.getOptions();
	}

	public List<String> getHistory() {
		return stepsTakenList;
	}
}
