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


public class VarSquare extends OneVar{

	private Variable var;
	
	public VarSquare(Variable text) {
		this.var = text;
	}
	
	@Override
	public String toString() {
		return "[" + this.var.toString() + "]";
	}

	@Override
	public Message getV1() {
		return var;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		this.var.substitude(oldVar, newVar);
	}

}
