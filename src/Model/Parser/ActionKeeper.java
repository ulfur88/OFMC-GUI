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

public class ActionKeeper extends ModifiableKeepers {
	
	private Variable title;
	private List<Actions> action;
	
	public ActionKeeper(Variable title, Actions t) {
		this.title = title;
		this.action = t.getList();
		modify(1);
	}

	@Override
	public String toString() {
		String m = title.toString() + ":\n";
		for (Actions t : action) m = m + t.toString() + "\n";
		m = m + "\n";
		return m;
	}

	@Override
	public List<AST> getList() {
		List<AST> re = new ArrayList<AST>();
		for(Actions a : action) re.add(a);
		return re;
	}

	@Override
	public void modify(int i) {
		for(AST a : action) {
			Actions mod = (Actions) a;
			mod.addStep(i);
			i++;
		}
	}

}
