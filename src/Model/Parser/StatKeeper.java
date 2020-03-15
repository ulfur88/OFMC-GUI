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

public class StatKeeper extends Keepers {
	private AST title; 
	private Stats stats;
	
	public StatKeeper (AST title, Stats stats) {
		this.title = title;
		this.stats = stats;
	}

	@Override
	public String toString() {
		String r = title.toString() + ":\n";
		for(Stats s : stats.getList()) r = r + s.toString() + "\n";
		return r;
	}
}
