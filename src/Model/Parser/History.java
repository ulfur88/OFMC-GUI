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

public class History extends TracingAB {
	
	private List<Actions> history;
	
	public History (Action action, History hist) {
		this.history = new ArrayList<Actions>();
		history.add(action);
		history.addAll(hist.getList());
	}
	
	public History (Action action) {
		this.history = new ArrayList<Actions>();
		history.add(action);
	}

	@Override
	public List<Actions> getList() {
		return this.history;
	}

	@Override
	public String toString() {
		String re = "";
		for (Actions h : history) re = re + h.toString() + "\n";
		return re;
	}
}
