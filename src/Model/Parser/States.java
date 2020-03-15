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

public class States extends Extra {

	private AST m,rest;
	
	public States(AST m , AST rest) {
		this.m = m;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		if(this.rest != null) return "state_" + m.toString() + "\n" + rest.toString();
		 return "state_" + m.toString() + "\n";
	}

}
