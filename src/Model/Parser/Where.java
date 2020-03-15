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

public class Where extends KnowledgeAb{
	private AST where;
	private List<KnowledgeAb> all;
	
	public Where (AST w) {
		this.where = w;
		this.all = new ArrayList<KnowledgeAb>();
		all.add(this);
	}

	@Override
	public String toString() {
		return "where " + where.toString();
	}

	@Override
	public void register(KnowledgeAb a) {
	}

	@Override
	public void combine(List<KnowledgeAb> visit) {
		this.all.addAll(visit);
	}

	@Override
	public List<KnowledgeAb> getList() {
		return this.all;
	}

	@Override
	public void addSteps(int i) {
	}

	
}
