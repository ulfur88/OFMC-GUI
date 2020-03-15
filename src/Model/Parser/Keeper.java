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

public class Keeper extends KeeperOfAll{

	private List<AST> msgs;
	
	public Keeper() {
		msgs = new ArrayList<AST>();
	}
	
	public void keep(AST m) {
		msgs.add(m);
	}

	@Override
	public String toString() {
		String re = "";
		for (AST a : msgs) re = re + a.toString();
		return re;
	}

	@Override
	public AST getType(String c) {
		switch (c) {
		case "Actions":
			for (AST m : msgs) if (m instanceof ActionKeeper) return m;
			break;
		case "Knowledge":
			for (AST m : msgs) if (m instanceof KnowledgeKeeper) return m;
			break;
		case "Trace":
			for (AST m : msgs) if (m instanceof TraceKeeper) return m;
			break;
		case "Summary":
			for (AST m : msgs) if (m instanceof SummaryKeeper) return m;
			break;
		case "Options":
			for (AST m : msgs) if (m instanceof Options) return m;
			break;
		case "Types":
			for (AST m : msgs) if (m instanceof TypesKeeper) return m;
			break;
		default:
			break;
		}
		return null;
	}
	
}
