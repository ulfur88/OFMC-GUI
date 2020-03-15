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

public class NormMore extends OneVar {

	private Message norm;
	
	public NormMore (AST norm) {
		this.norm = (Message) norm;
	}
	
	@Override
	public String toString() {
		return "_" + this.norm.toString();
	}

	@Override
	public AST getV1() {
		return this.norm;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		norm.substitude(oldVar, newVar);
	}

}
