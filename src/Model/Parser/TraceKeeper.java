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

public class TraceKeeper extends KeepersWithLists {

	private Trace trace;
	private Variable title;
	
	public TraceKeeper(Variable title, Trace trace) {
		this.title = title;
		this.trace = trace;
	}

	@Override
	public String toString() {
		return this.title.toString() + ":\n" + this.trace.toString();
	}

	@Override
	public List<AST> getList() {
		List<AST> re = new ArrayList<AST>();
		for(Actions a : this.trace.getList()) re.add(a);
		return re;
	}
}
