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

public class Dot extends Extra {

	private Variable v1,v2;
	
	public Dot (Variable v1, Variable v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public String toString() {
		return this.v1.toString() + "." + v2.toString();
	}

}
