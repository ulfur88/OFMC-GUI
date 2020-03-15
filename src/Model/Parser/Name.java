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

public class Name extends Protocol{

	private Variable name;

	public Name (Variable n) {
		this.name = n;
	}

	@Override
	public String toString() {
		return this.name.toString();
	}
}
