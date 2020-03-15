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

public class GoalsKeeper extends KeepersWithLists {
	
	private Variable title;
	private List<Goals> goals;
	
	public GoalsKeeper(Variable title, Goals t) {
		this.title = title;
		this.goals = ((GoalsWithLists) t).getList();
	}

	@Override
	public String toString() {
		String m = title.toString() + ":\n";
		for (Goals t : goals) m = m + t.toString() + "\n";
		return m;
	}

	@Override
	public List<AST> getList() {
		List<AST> re = new ArrayList<AST>();
		for(Goals a : goals) re.add(a);
		return re;
	}

}
