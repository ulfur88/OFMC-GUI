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

public class Goal extends GoalsWithLists{

	private List<Goals> goals;
	
	public Goal (Goals g1, Goals rest) {
		this.goals = new ArrayList<Goals>();
		this.goals.add(g1);
		this.goals.addAll(((GoalsWithLists) rest).getList());
	}
	
	public Goal (Goals goal) {
		this.goals = new ArrayList<Goals>();
		this.goals.add(goal);
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public List<Goals> getList() {
		return this.goals;
	}
}
