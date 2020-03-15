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

public class Wcomma extends TwoVar {
	
	private Variable w1,w2;
	
	public Wcomma(AST w1, AST w2) {
		this.w1 = (Variable) w1;
		this.w2 = (Variable) w2;
	}

	@Override
	public String toString() {
		return "(" + w1.toString() + "," + w2.toString() + ")";
	}

	@Override
	public Message getV1() {
		return this.w1;
	}

	@Override
	public Message getV2() {
		return this.w2;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		w1.substitude(oldVar, newVar);
	}

}
