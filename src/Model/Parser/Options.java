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
import java.util.ArrayList;
import java.util.List;

public class Options extends OptionsABsub {
	
	private List<Option> options;
	
	public Options(Option option) {
		this.options = new ArrayList<Option>();
		this.options.add(option);
	}
	
	public Options(Option option, Options rest) {
		this.options = new ArrayList<Option>();
		this.options.add(option);
		this.options.addAll(rest.getList());
	}

	@Override
	public List<Option> getList() {
		return options;
	}

	@Override
	public String toString() {
		String re = "";
		for (Option o : options) re = re + o.toString() + "\n";
		return re;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		for(Option a : options) a.substitude(oldVar, newVar);
	}
}
