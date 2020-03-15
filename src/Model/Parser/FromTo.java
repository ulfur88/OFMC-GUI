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


public class FromTo extends TwoVar {
	
	private Message agent1, agent2, arrow;

	public FromTo(AST ag1, AST arr, AST ag2) {
		this.agent1 = (Message) ag1;
		this.arrow = (Message) arr;
		this.agent2 = (Message) ag2;
	}

	@Override
	public String toString() {
		return agent1.toString() + arrow.toString() + agent2.toString();
	}

	@Override
	public Message getV1() {
		return agent1;
	}

	@Override
	public Message getV2() {
		return agent2;
	}

	@Override
	public void substitude(String oldVar, Variable newVar) {
		agent1.substitude(oldVar, newVar);
		agent2.substitude(oldVar, newVar);
	}

}
