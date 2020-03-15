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

public class UnderSep extends TwoVar {

	private Message v1,v2;
	
	public UnderSep (AST v1, AST v2) {
		this.v1 = (Message) v1;
		this.v2 = (Message) v2;
	}
	
	@Override
	public String toString() {
		return this.v1.toString() + "_" + this.v2.toString();
	}

	@Override
	public Message getV1() {
		return v1;
	}

	@Override
	public Message getV2() {
		return v2;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		v1.substitude(oldVar, newVar);
		v2.substitude(oldVar, newVar);		
	}

}
