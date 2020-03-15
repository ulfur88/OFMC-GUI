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

public class Action extends Actions {

	private Message agents, message;
	private List<Actions> actions;
	private String step;
	
	public Action (AST msg, AST ags, int i) {
		this.agents = (Message) ags;
		this.message = (Message) msg;
		this.actions = new ArrayList<Actions>();
		this.actions.add(this);
		this.step = "";
	}
	
	public Action (Action act, Action a) {
		this.actions = new ArrayList<Actions>();
		this.actions.add(act);
		this.actions.addAll(a.getList());
	}

	@Override
	public String toString() {
		return this.agents.toString() + ": " + this.step + this.message.toString();
	}

	@Override
	public List<Actions> getList() {
		return this.actions;
	}

	@Override
	public void addStep(int i) {
		this.step = "step" + i + ",";
	}

	@Override
	public FromTo getAgents() {
		return (FromTo) this.agents;
	}

	@Override
	public Integer getStepNo() {
		return ((TwoVarStepProvider)message).getStepNo();
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		agents.substitude(oldVar, newVar);
		message.substitude(oldVar, newVar);
	}

	@Override
	public Message getMsg() {
		return this.message;
	}
	
}
