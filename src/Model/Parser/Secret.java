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
	
	public Secret (Message m, Ws w) {
		this.m = m;
		this.w = w;
	}

	@Override
	public String toString() {
		return m.toString() + " secret between " + w.toString();
	}
}
