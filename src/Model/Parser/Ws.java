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


public class Ws extends TwoVar{

	private Message w, ws;
	private boolean comma;
	
	
	public Ws(AST w, AST ws, boolean b) {
		this.w = (Message) w;
		this.ws = (Message) ws;
		this.comma = b;
	}
	
	@Override
	public String toString() {
		if (comma) return w.toString() + "," + ws.toString();
		else return w.toString();
	}

	@Override
	public Message getV1() {
		return w;
	}

	@Override
	public Message getV2() {
		return ws;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		w.substitude(oldVar, newVar);
		ws.substitude(oldVar, newVar);
	} 
}
