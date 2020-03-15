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

public class HistoryKeeper extends KeepersWithLists {

	private Variable title;
	private List<Actions> action;
	
	public HistoryKeeper (Variable title, History t) {
		this.title = title;
		this.action = t.getList();
	}

	@Override
	public String toString() {
		String m = "";
		for (Actions t : action) m = m + t.toString() + "\n";
		return m;
	}
	
	@Override
	public List<AST> getList() {
		List<AST> re = new ArrayList<AST>();
		for(Actions a : action) re.add(a);
		return re;
	}

}
