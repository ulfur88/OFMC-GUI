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

public class Secret extends Goals {
	
	private Message m;
	private Ws w;
	private boolean guessable;
	
	public Secret (Message m, Ws w) {
		this.m = m;
		this.w = w;
		this.guessable = false;
	}

	public Secret(Message m, Ws w, boolean b) {
		this.m = m;
		this.w = w;
		this.guessable = true;
	}

	@Override
	public String toString() {
		if (!guessable) return m.toString() + " secret between " + w.toString();
		else return m.toString() + " guessable secret between " + w.toString();
	}
}
