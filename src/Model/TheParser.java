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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import Model.Parser.AST;
import Model.Parser.Actions;
import Model.Parser.AnalysisParser;
import Model.Parser.FromTo;
import Model.Parser.Keeper;
import Model.Parser.Keepers;
import Model.Parser.KeepersWithLists;
import Model.Parser.Message;
import Model.Parser.ModifiableKeepers;
import Model.Parser.Option;
import Model.Parser.Options;
import Model.Parser.ProtocolParser;
import Model.Parser.TraceParser;
import Model.Parser.TwoVar;
import Model.Parser.Variable;
import Model.Parser.Wcomma;

public class TheParser {

	private Keepers protocol, analysis, trace;
	private KeepersWithLists traceKeeper, ak;
	private Options options;
	private String type;
	private HashMap<String, Variable> codenames, codenamesTrace;
	public boolean syntaxError;

	public TheParser (String type) {
		this.type = type;
		this.codenames = new HashMap<String, Variable>();
		this.codenamesTrace = new HashMap<String, Variable>();
		this.syntaxError = false;
	}

	public void setType (String type) {
		this.type = type;
	}

	public void parse (String text)  {
		try {
			switch (type) {
			case "p":
				ProtocolParser pp = new ProtocolParser();
				protocol = (Keepers)pp.run(text);
				modify();
				break;
			case "a":
				AnalysisParser ap = new AnalysisParser();
				analysis = (Keepers) ap.run(text);
				if(attackFound()) modifyAgents();
				break;
			case "t":
				TraceParser tp = new TraceParser();
				trace = (Keepers) tp.run(text);
				break;
			default:
				break;
			}
			syntaxError = false;
		} catch (Exception e) {
			this.syntaxError = true;
		}
	}

	// Modifies the protocol
	public void modify() {
		ak = (KeepersWithLists) ((Keeper)protocol).getType("Actions");
		ModifiableKeepers kk = (ModifiableKeepers) ((Keeper)protocol).getType("Knowledge");
		kk.modify(ak.getList().size());
	}

	// Modifies the "x" values in output of ofmc if they stand for agents 
	public void modifyAgents() {
		traceKeeper = (KeepersWithLists) ((Keeper)analysis).getType("Trace");
		List<FromTo> protocolSteps = new ArrayList<FromTo>();
		List<Message> messages = new ArrayList<Message>();
		for (AST a : ak.getList()) {
			protocolSteps.add((FromTo)((Actions)a).getAgents());
			messages.add(((Actions)a).getMsg());
		}
		List<AST> trace = traceKeeper.getList();
//		for (AST f : trace) {
//			if(f.toString().contains("step")) agentCheck(protocolSteps.get(((Actions) f).getStepNo() - 1), (FromTo)((Actions)f).getAgents(), codenames);
//		}
//		substitudeAst(codenames, trace);
		
		
		for (AST a : trace) {
			if(a.toString().contains("step")) {
				extraAgents(((Actions)a).getMsg(), messages.get(((Actions)a).getStepNo() -1),0, codenames);
				Pattern p = Pattern.compile("x[0-9]+");
				if(p.matcher(a.toString()).find()) {
					agentCheck(protocolSteps.get(((Actions) a).getStepNo() - 1), (FromTo)((Actions)a).getAgents(), codenames);
				}
			}
		}
		substitudeAst(codenames, trace);
		
		
	}

	// Modifies the "x" values in output of ofmc if they stand for agents 
	public void modifyTracer() {
		options = (Options) ((Keeper)trace).getType("Options");
		List<FromTo> protocolSteps = new ArrayList<FromTo>();
		List<Message> messages = new ArrayList<Message>();
		for (AST a : ak.getList()) {
			protocolSteps.add((FromTo)((Actions)a).getAgents());
			messages.add(((Actions)a).getMsg());
		}

		try {
			List<Option> trace = options.getList();
			for (Option f : trace) {
				for (Actions a : f.getList())
					if(a.toString().contains("step")) agentCheck(protocolSteps.get(a.getStepNo() - 1), (FromTo)a.getAgents(), codenamesTrace);
			}
			substitudeAct(codenamesTrace, trace);
			for (Option f : trace) {
				for (Actions a : f.getList()) {
					if(a.toString().contains("step")) extraAgents(a.getMsg(), messages.get(a.getStepNo() -1),0, codenamesTrace);
				}
			}
			substitudeAct(codenamesTrace, trace);
		} catch (Exception ignore){}

	}
	
	// Substitudes "x" values for their value according to the protocol
	public void substitudeAct(HashMap<String, Variable> hm , List<Option> list) {
		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Variable> pair = (Map.Entry)it.next();

			for (AST t : list) ((Option)t).substitude(pair.getKey(), pair.getValue());

			it.remove(); // avoids a ConcurrentModificationException
		}
	}

	public void extraAgents(Message a, Message pro, int i, HashMap<String, Variable> hm) {
		if( !(a instanceof TwoVar)) return;
		Message left = ((TwoVar)a).getV1();
		Message right = ((TwoVar)a).getV2();
		if(right instanceof Variable && right.toString().contains("x")) {
			Variable v = compare(pro,i);
			if(v != null && !hm.containsKey(right.toString())) {
//				hm.put(right.toString(), v);
				boolean alreadyExists = false;
				Iterator it = hm.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			        if (pair.getValue().toString().equals(v.toString())) {
			        	alreadyExists = true;
			        }
//			        it.remove(); // avoids a ConcurrentModificationException
//			        break;
			    }
				if (!alreadyExists) hm.put(right.toString(), v);
				else {
					int count = 2;
					Variable check = new Variable("" + v.toString() + count);
					while (hm.containsValue(check)) {
						count++;
						check = new Variable("" + v.toString() + count);
					}
					hm.put(right.toString(), check);
				}
			}
		}
		i++;
		extraAgents(left, pro, i, hm);
	}
	
	public Variable compare(Message pro, int i) {
		Message msg = pro;
		Message right = ((TwoVar)pro).getV2();
		int j = 0;
		while (j!=i) {
			msg = ((TwoVar)msg).getV1();
			j++;
		}
		if(msg instanceof Variable) right = msg;
		else right = ((TwoVar)msg).getV2();
		if(right instanceof Variable) return (Variable) right;		
		return null;
	}

	public void agentCheck(FromTo org, FromTo action, HashMap<String, Variable> hm) {
		Wcomma wc;
		Variable agent, session;
		String key;

		if (action.getV1() instanceof Wcomma) {
			wc = (Wcomma) action.getV1();
			agent = (Variable)org.getV1();
		} else {
			wc = (Wcomma) action.getV2();
			agent = (Variable)org.getV2();
		}
		key = wc.getV1().toString();
		session = (Variable)wc.getV2();
		if(!hm.containsKey(key)) {
			boolean alreadyExists = false;
			Iterator it = hm.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        if (pair.getValue().toString().equals(agent.toString())) {
		        	alreadyExists = true;
		        }
//		        it.remove(); // avoids a ConcurrentModificationException
//		        break;
		    }
			if (!alreadyExists) hm.put(key, agent);
			else {
				int count = 2;
				Variable check = new Variable("" + agent.toString() + count);
				while (hm.containsValue(check)) {
					count++;
					check = new Variable("" + agent.toString() + count);
				}
				hm.put(key, check);
			}
		}
	}
	
	public void substitudeAst(HashMap<String, Variable> hm , List<AST> list) {
		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Variable> pair = (Map.Entry)it.next();

			for (AST t : list) ((Actions)t).substitude(pair.getKey(), pair.getValue());

			it.remove(); // avoids a ConcurrentModificationException
		}
	}

	public boolean attackFound() {
		KeepersWithLists sum = (KeepersWithLists) ((Keeper)analysis).getType("Summary");
		for(AST a : sum.getList()) if (a.toString().contains("NO_ATTACK")) return false;
		return true;
	}

	public String getParsedProtocol() {
		return protocol.toString();
	}

	public List<AST> getActions() {
		return ak.getList();
	}

	public List<AST> getAttackTrace() {
		return this.traceKeeper.getList();
	}

	public List<Option> getOptions() {
		Options op = (Options) ((Keeper)trace).getType("Options");
		return op.getList();
	}

	public String getAgents() {
		KeepersWithLists t = (KeepersWithLists) ((Keeper)protocol).getType("Types");
		return findAgents(t.getList());
	}

	public String findAgents(List<AST> t) {
		for (AST a : t) {
			if (a.toString().contains("Agent")) return a.toString().replaceAll("Agent ", "");
		}
		return "";
	}
}




