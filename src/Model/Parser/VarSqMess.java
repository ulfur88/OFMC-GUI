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


public class VarSqMess extends TwoVar {
	
	private Variable var;
	private Message message;
	

	public VarSqMess(Variable text, AST msg) {
		this.var = text;
		this.message = (Message) msg;
	} 

	@Override
	public String toString() {
		return "[" + var.toString() + ": " + this.message.toString() + "]";
	}

	@Override
	public Message getV1() {
		return var;
	}

	@Override
	public Message getV2() {
		return message;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		this.var.substitude(oldVar, newVar);
		this.message.substitude(oldVar, newVar);
	} 

}
