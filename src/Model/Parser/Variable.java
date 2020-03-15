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


public class Variable extends StepProvider {
	private String var;
	
	public Variable (String text) {
		this.var = text;
	}

	@Override
	public String toString() {
		return this.var;
	}

	@Override
	public Variable getV1() {
		return this;
	}

	@Override
	public Integer getStepNo() {
		String i = var.replaceAll("step", "");
		int re = Integer.parseInt(i);
		return re;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		if (this.var.equals(oldVar)) this.var = newVar.toString();
	}
	
	
}
