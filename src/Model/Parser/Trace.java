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

public class Trace extends TracingAB {
	
	private List<Actions> trace;
	
	public Trace (Action a, Trace rest) {
		this.trace = new ArrayList<Actions>();
		this.trace.add(a);
		this.trace.addAll(rest.getList());
	}
	
	public Trace (Action a) {
		this.trace = new ArrayList<Actions>();
		this.trace.add(a);
	}

	@Override
	public List<Actions> getList() {
		return this.trace;
	}

	@Override
	public String toString() {
		String re = "";
		for(Actions t : trace) {
			re = re + t.toString() + "\n";
		}
		return re;
	}
}
