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


public class SymEnc extends TwoVar{
	
	private Message msg, norm;
	
	public SymEnc (AST msg, AST norm) {
		this.msg = (Message) msg;
		this.norm = (Message) norm;
	}

	@Override
	public String toString() {
		return "{|" + msg.toString() + "|}" + norm.toString();
	}

	@Override
	public Message getV1() {
		return msg;
	}

	@Override
	public Message getV2() {
		return norm;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		msg.substitude(oldVar, newVar);
		norm.substitude(oldVar, newVar);
	} 
}
