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

public class Constraints extends Extra {

	private AST m1, rest;
	
	public Constraints(AST m1, AST rest) {
		this.m1 = m1;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		if (this.rest != null) return m1.toString() + rest.toString();
		return m1.toString();
	}

}
