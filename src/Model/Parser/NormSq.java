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

public class NormSq extends OneVar {
	
	private Message m;
	private boolean b;
	
	public NormSq(AST m, boolean b) {
		this.m = (Message) m;
		this.b = b;
	}

	@Override
	public String toString() {
		if (b) return ",[" + m.toString() + "]";
		else return "[" + m.toString() + "]";
	}

	@Override
	public Message getV1() {
		return this.m;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		m.substitude(oldVar, newVar);
	}

}
