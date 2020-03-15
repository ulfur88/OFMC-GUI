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

public class ArrowGoal extends Goals{

	Message w2w,m;
	
	public ArrowGoal (Message w2w, Message m) {
		this.w2w = w2w;
		this.m = m;
	}

	@Override
	public String toString() {
		return this.w2w.toString() + " : " + this.m.toString();
	}	
}
