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


public class AList extends TwoVarStepProvider{
	
	private Message fst, snd;

	public AList (AST first, AST second) {
		this.fst = (Message) first;
		this.snd = (Message) second;
	}

	@Override
	public String toString() {
		return this.fst.toString() + "," + this.snd.toString();
	}

	@Override
	public Message getV1() {
		return fst;
	}

	@Override
	public Message getV2() {
		return snd;
	}

	@Override
	public Integer getStepNo() {
		if (fst instanceof StepProvider) return ((Variable)fst).getStepNo();
		else return ((TwoVarStepProvider)fst).getStepNo();
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		fst.substitude(oldVar, newVar);
		snd.substitude(oldVar, newVar);
	}
	
}
