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

public class KnowledgeKeeper extends ModifiableKeepers {
	
	private Variable title;
	private List<KnowledgeAb> knowledge;
	
	public KnowledgeKeeper(Variable title, KnowledgeAb t) {
		this.title = title;
		this.knowledge = t.getList();
	}

	@Override
	public String toString() {
		String m = title.toString() + ":\n";
		for (KnowledgeAb t : knowledge) m = m + t.toString() + "\n";
		m = m + "\n";
		return m;
	}

	@Override
	public List<AST> getList() {
		List<AST> re = new ArrayList<AST>();
		for(KnowledgeAb a : knowledge) re.add(a);
		return re;
	}

	@Override
	public void modify(int i) {
		for(KnowledgeAb k : knowledge) k.addSteps(i);
	}
}
