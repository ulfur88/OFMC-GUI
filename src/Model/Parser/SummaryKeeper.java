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

public class SummaryKeeper extends KeepersWithLists {

private AST t, fun;
	
	public SummaryKeeper(AST t, AST fun) {
		this.t = t;
		this.fun = fun;
	}

	@Override
	public String toString() {
		return this.t.toString() + ":\n" + fun.toString() + "\n";
	}

	@Override
	public List<AST> getList() {
		List<AST> list = new ArrayList<AST>();
		list.add(fun);
		return list;
	}

}
