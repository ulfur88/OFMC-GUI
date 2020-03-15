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


public class NotEQ extends ThreeVar{
	
	private Message m1,m2,wa;
	private boolean comma;

	public NotEQ(AST m1, AST m2, AST wa, boolean b) {
		this.m1 = (Message) m1;
		this.m2 = (Message) m2;
		this.wa = (Message) wa;
		this.comma = b;
	}

	@Override
	public String toString() {
		if (comma) return this.m1.toString() + "!=" + this.m2.toString() + "," + wa.toString();
		else return this.m1.toString() + "!=" + this.m2.toString();
	}

	@Override
	public Message getV1() {
		return this.m1;
	}

	@Override
	public Message getV2() {
		return this.m2;
	}
	
	@Override
	public Message getV3() {
		return this.wa;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		m1.substitude(oldVar, newVar);
		m2.substitude(oldVar, newVar);
		if (wa!=null) wa.substitude(oldVar, newVar);
	}

}
