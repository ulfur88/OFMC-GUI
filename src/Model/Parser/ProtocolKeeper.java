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

public class ProtocolKeeper extends Keepers{
	private Name kept;
	private Variable title;
	
	public ProtocolKeeper(Variable title, Name toKeep) {
		this.title = title;
		this.kept = toKeep;
	}
	
	@Override
	public String toString() {
		return title.toString() + ": " + kept.toString() + "\n\n";
	}
}
