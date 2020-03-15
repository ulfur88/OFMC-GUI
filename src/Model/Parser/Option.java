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
import java.util.List;

public class Option extends OptionsSingleABsub {

	private Variable option;
	private List<Actions> actions;


	public Option (Variable option, List<Actions> actions) {
		this.option = option;
		this.actions = actions;
	}

	@Override
	public List<Actions> getList() {
		return this.actions;
	}

	@Override
	public String toString() {
		String re = "";
		for (Actions a : actions) re = re + a.toString() + "\n";
		return re;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		for(Actions a : actions) a.substitude(oldVar, newVar);
	}
}
