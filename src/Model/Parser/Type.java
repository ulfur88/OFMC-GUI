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

public class Type extends Types{

	private Variable type;
	private Message cs;
	private List<Types> types;
	
	public Type(AST type, AST cs) {
		this.type = (Variable) type;
		this.cs = (Message) cs;
		this.types = new ArrayList<Types>();
		this.types.add(this);
	}
	
	public Type(AST type, AST cs,Types t) {
		this.types = new ArrayList<Types>();
		this.types.add(new Type(type,cs));
		this.types.addAll(t.getList());
	}
	
	@Override
	public String toString() {
		return this.type.toString() + " " + this.cs.toString() + ";";
	}

	@Override
	public List<Types> getList() {
		return this.types;
	}
}
