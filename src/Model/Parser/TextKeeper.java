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

public class TextKeeper extends Keepers {

	private AST t, fun, t2;
	
	public TextKeeper(AST t, AST t2, AST fun) {
		this.t = t;
		this.fun = fun;
		this.t2 = t2;
	}

	@Override
	public String toString() {
		if(t.toString().equals("where")) return fun.toString() + "\n";
		if(t2 != null) return this.t.toString() + ":\n" + t2.toString() + " "+ fun.toString() + "\n";
		return this.t.toString() + ":\n" + fun.toString() + "\n";
	}
}
