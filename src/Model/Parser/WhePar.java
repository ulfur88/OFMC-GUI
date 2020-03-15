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

public class WhePar extends WheSym{
	
	private List<Variable> sym;
	
	 public WhePar(List<Variable> sym) {
		 this.sym = sym;
	}

	@Override
	public List<AST> getList() {
		List<AST> re = new ArrayList<AST>();
		for(Variable v : sym) re.add(v);
		return re;
	}

	@Override
	public String toString() {
		String re = "";
		for (Variable w : sym) re = re + w.toString();
		return "(" + re + ")";
	}
}
