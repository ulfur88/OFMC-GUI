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

public abstract class KnowledgeAb extends AST{

	public abstract void register(KnowledgeAb a);

	public abstract void combine(List<KnowledgeAb> visit);

	public abstract List<KnowledgeAb> getList();
	
	public abstract void addSteps(int i);
}
