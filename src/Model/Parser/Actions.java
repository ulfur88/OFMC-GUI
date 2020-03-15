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
import java.util.List;

public abstract class Actions extends AST {

	public abstract List<Actions> getList();
	
	public abstract void addStep(int i);

	public abstract FromTo getAgents();
	
	public abstract Message getMsg();
	
	public abstract Integer getStepNo();

	public abstract void substitude(String oldVar, Variable newVar);

}
