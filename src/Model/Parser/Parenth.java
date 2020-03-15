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

public class Parenth extends OneVar {

	private Message m;
	
	public Parenth (AST message) {
		this.m = (Message) message;
	}
	
	@Override
	public AST getV1() {
		return m;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		m.substitude(oldVar, newVar);
	}

	@Override
	public String toString() {
		return "(" + m.toString() + ")";
	}

}
