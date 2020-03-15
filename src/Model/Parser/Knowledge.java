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

package Model.Parser;
import java.util.ArrayList;
import java.util.List;

public class Knowledge extends KnowledgeAb{
	
	private AST knows;
	private Variable agent;
	private List<KnowledgeAb> all;
	private String steps;
	
	public Knowledge(String agent, AST m) {
		this.all = new ArrayList<KnowledgeAb>();
		all.add(new Knowledge(m, agent));
	}
	
	public Knowledge (AST m, String ag) {
		this.knows = m;
		this.agent = new Variable(ag);
		steps = "";
	}

	@Override
	public String toString() {
		return agent.toString() + ": " + knows.toString() + steps + ";";
	}
	
	public void register(KnowledgeAb a) {
		this.all.add(a);
	}

	@Override
	public void combine(List<KnowledgeAb> visit) {
		all.addAll(visit);
	}

	@Override
	public List<KnowledgeAb> getList() {
		return this.all;
	}

	@Override
	public void addSteps(int i) {
		for(int a = 1; a<=i; a++) {
			steps = steps + ",step" + a;
		}
	}

	

}
