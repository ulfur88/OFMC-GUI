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


public class Function extends TwoVar{
	private Variable funName;
	private Message msg;
	
	
	public Function(Variable name, AST msg) {
		this.funName = name;
		this.msg = (Message) msg;
	}

	@Override
	public String toString() {
		return this.funName.toString() + "(" + msg.toString() + ")";
	}

	@Override
	public Message getV1() {
		return funName;
	}

	@Override
	public Message getV2() {
		return msg;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		msg.substitude(oldVar, newVar);
	}
}
