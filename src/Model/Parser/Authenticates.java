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

public class Authenticates extends Goals{

	private String weakly;
	private Message w, w2,m;
	
	public Authenticates (Message w, Message w2, Message m ,String weakly) {
		this.weakly = weakly;
		this.w = w;
		this.w2 = w2;
		this.m = m;
	}

	@Override
	public String toString() {
		return w.toString() + " " + weakly + " authenticates " + w2.toString() + " on " + m.toString();
	}
}
