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

public class WheColl extends WheSym {
	
	private List<AST> whe;
	
	public WheColl(WhePar w, Variable a, WheColl rest) {
		 this.whe = new ArrayList<AST>();
		 this.whe.add(w);
		 this.whe.add(a);
		 this.whe.addAll(rest.getList());
	}
	
	public WheColl(WhePar w) {
		 this.whe = new ArrayList<AST>();
		 this.whe.add(w);
	}
	
	public WheColl(Variable v) {
		this.whe = new ArrayList<AST>();
		this.whe.add(v);
	}

	@Override
	public List<AST> getList() {
		return whe;
	}

	@Override
	public String toString() {
		String re = "where ";
		for (AST w : whe) re = re + w.toString();
		return re;
	}

}
