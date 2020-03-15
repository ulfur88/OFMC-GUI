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

public class Stat extends Stats {
	
	private Variable type, num, var;
	private boolean colon;
	private List<Stats> stats;

	public Stat(Variable type, Variable num, Variable var, boolean b) {
		this.type = type;
		this.num = num;
		this.var = var;
		this.colon = b;
		this.stats = new ArrayList<Stats>();
		this.stats.add(this);
	}
	
	public Stat(Variable type, Variable num, Variable var, boolean b, Stat stat) {
		this.stats = new ArrayList<Stats>();
		this.stats.add(new Stat(type, num, var, b));
		this.stats.addAll(stat.getList());
	}
	
	@Override
	public String toString() {
		if (colon) return this.type.toString() + ": " + this.num.toString() + " " + this.var.toString();
		else return this.type.toString() + " " + this.num.toString() + " " + this.var.toString();
	}

	@Override
	public List<Stats> getList() {
		return this.stats;
	}

}
