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

public class TypesKeeper extends KeepersWithLists {
	
	private Variable title;
	private List<Types> types;
	
	public TypesKeeper(Variable title, Types t) {
		this.title = title;
		this.types = t.getList();
	}

	@Override
	public String toString() {
		String m = title.toString() + ":\n";
		for (Types t : types) m = m + t.toString() + "\n";
		m = m + "\n";
		return m;
	}

	@Override
	public List<AST> getList() {
		List<AST> re = new ArrayList<AST>();
		for(Types a : types) re.add(a);
		return re;
	}
}
