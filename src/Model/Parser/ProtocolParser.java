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


import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class ProtocolParser {
	

	public ProtocolParser() {}
	
	public AST run(String t) throws Exception {
		// Translate the input string into stream of characters
		CharStream inputStream = CharStreams.fromString(t);

		// Create a lexer for the CharStream
		pparserLexer lex = new pparserLexer(inputStream);

		// Use the lexer to generate the token stream
		CommonTokenStream tokens = new CommonTokenStream(lex);

		// Create a parser for the given token stream and start it

		try {

			// Instantiate an evaluator
			Evaluator evaluator = new Evaluator();

			pparserParser parser = new pparserParser(tokens);
			parser.setErrorHandler(new BailErrorStrategy());
			return evaluator.visit(parser.start());

		} catch (Exception e){
			System.out.println("");
		}
		return null;
	}

	
	class Evaluator extends pparserBaseVisitor<AST> {
		Evaluator() {}

		@Override
		public AST visitStart (pparserParser.StartContext ctx) {
			Keeper keep = new Keeper();

			for (int i = 0; i<ctx.begin().size(); i++) {
				keep.keep(this.visit(ctx.begin(i)));
			}
			return keep;
		}

		@Override
		public AST visitFunProtocol(pparserParser.FunProtocolContext ctx) {
			return new ProtocolKeeper(new Variable(ctx.title.getText()), new Name(new Variable(ctx.n.getText())));
		}
		
		@Override
		public AST visitFunTypes(pparserParser.FunTypesContext ctx) {
			return new TypesKeeper(new Variable(ctx.title.getText()),(Types)visit(ctx.fun));
		}

		@Override
		public AST visitFunKnowledge(pparserParser.FunKnowledgeContext ctx) {
			return new KnowledgeKeeper(new Variable(ctx.title.getText()),(KnowledgeAb)visit(ctx.fun));
		}
		
		@Override
		public AST visitFunActions(pparserParser.FunActionsContext ctx) {
			return new ActionKeeper(new Variable(ctx.title.getText()),(Actions)visit(ctx.fun));
		}
		
		@Override
		public AST visitFunGoals(pparserParser.FunGoalsContext ctx) {
			return new GoalsKeeper(new Variable(ctx.title.getText()),(Goals)visit(ctx.fun));
		}
		
		@Override
		public AST visitFunBrainWhere (pparserParser.FunBrainWhereContext ctx) {
			KnowledgeAb m = (KnowledgeAb) visit(ctx.b);
			m.register(new Where(visit(ctx.wa)));
			return m;
		}
		
		@Override
		public AST visitFunBrain (pparserParser.FunBrainContext ctx) {
			return visit(ctx.b);
		}
		
		@Override 
		public AST visitBrainWithSemi(pparserParser.BrainWithSemiContext ctx) {
			Knowledge all = new Knowledge(ctx.ag.getText(), visit(ctx.knows));
			all.combine(((KnowledgeAb)visit(ctx.fun)).getList());
			return all;
		}
		
		@Override
		public AST visitBrainOptSemi(pparserParser.BrainOptSemiContext ctx) {
			return new Knowledge(ctx.ag.getText(), visit(ctx.knows));
		}
		
		@Override
		public AST visitNotlastAct (pparserParser.NotlastActContext ctx) {
			return new Action(new Action(visit(ctx.mes), visit(ctx.fun),1), (Action)visit(ctx.fun2));
		}
		
		@Override
		public AST visitLastAct (pparserParser.LastActContext ctx) {
			return new Action(visit(ctx.mes),visit(ctx.fun),1);
		}
		
		@Override
		public AST visitFunFromTo (pparserParser.FunFromToContext ctx) {
			return new FromTo(visit(ctx.from), visit(ctx.arrow), visit(ctx.to));
		}
		
		@Override
		public AST visitRegular (pparserParser.RegularContext ctx) {
			return new Variable("->");
		}
		
		@Override
		public AST visitStar (pparserParser.StarContext ctx) {
			return new Variable("*->");
		}
		
		@Override
		public AST visitArrowstar (pparserParser.ArrowstarContext ctx) {
			return new Variable("->*");
		}
		
		@Override
		public AST visitStararrowstar (pparserParser.StararrowstarContext ctx) {
			return new Variable("*->*");
		}
		
		@Override
		public AST visitNormal (pparserParser.NormalContext ctx) {
			return new Variable(ctx.v.getText());
		}
		
		@Override
		public AST visitSquare (pparserParser.SquareContext ctx) {
			return new VarSquare(new Variable(ctx.v.getText()));
		}
		
		@Override
		public AST visitSquaremess (pparserParser.SquaremessContext ctx) {
			return new VarSqMess(new Variable(ctx.v.getText()), visit(ctx.mes));
		}
		
		@Override
		public AST visitWscomma (pparserParser.WscommaContext ctx) {
			return new Ws(visit(ctx.w1), visit(ctx.ws1), true);
		}
		
		@Override
		public AST visitWsnocomma (pparserParser.WsnocommaContext ctx) {
			return new Ws(visit(ctx.w1), null, false);
		}
		
		@Override
		public AST visitWaisingle (pparserParser.WaisingleContext ctx) {
			return new NotEQ(visit(ctx.mes1), visit(ctx.mes2), null, false);
		}
		
		@Override
		public AST visitWaimore (pparserParser.WaimoreContext ctx) {
			return new NotEQ(visit(ctx.mes1), visit(ctx.mes2), visit(ctx.wa), true);
		}
		
		@Override
		public AST visitMcomma (pparserParser.McommaContext ctx) {			
			return new AList(visit(ctx.mes1), visit(ctx.mes2));
		}
		
		@Override
		public AST visitMnocomma (pparserParser.MnocommaContext ctx) {
			return visit(ctx.n);
		}
		
		@Override
		public AST visitNormfunction (pparserParser.NormfunctionContext ctx) {
			return new Function(new Variable(ctx.v.getText()), visit(ctx.l));
		}
		
		@Override
		public AST visitNormnoenc (pparserParser.NormnoencContext ctx) {
			return new NoEnc(visit(ctx.mes), visit(ctx.n));
		}
		
		@Override
		public AST visitNormenc (pparserParser.NormencContext ctx) {
			return new SymEnc(visit(ctx.mes), visit(ctx.n));
		}
		
		@Override
		public AST visitNormvariable (pparserParser.NormvariableContext ctx) {
			return new Variable(ctx.v.getText());
		}
		
		@Override
		public AST visitNormparenth (pparserParser.NormparenthContext ctx) {
			return new Function(new Variable(""), visit(ctx.mes));
		}
		
		@Override
		public AST visitLimore(pparserParser.LimoreContext ctx) {
			return new AList(visit(ctx.no), visit(ctx.l));
		}
		
		@Override
		public AST visitLisingle(pparserParser.LisingleContext ctx) {
			return visit(ctx.no);
		}
		
		@Override
		public AST visitGoalsmore (pparserParser.GoalsmoreContext ctx) {
			return new Goal((Goals)visit(ctx.fun1), (Goals)visit(ctx.fun2));
		}
		
		@Override
		public AST visitGoalssingle (pparserParser.GoalssingleContext ctx) {
			return new Goal((Goals)visit(ctx.fun));
		}
		
		@Override
		public AST visitGuessablesecretbetween(pparserParser.GuessablesecretbetweenContext ctx) {
			return new Secret((Message) visit(ctx.mes), (Ws) visit(ctx.fun), true);
		}
		
		@Override
		public AST visitSecretbetween (pparserParser.SecretbetweenContext ctx) {
			return new Secret((Message) visit(ctx.mes), (Ws) visit(ctx.fun));
		}
		
		@Override
		public AST visitWeaklyauthent (pparserParser.WeaklyauthentContext ctx) {
			return new Authenticates((Message) visit(ctx.fun1), (Message)visit(ctx.fun2), (Message)visit(ctx.mes), "weakly");
		}
		
		@Override
		public AST visitAuthent (pparserParser.AuthentContext ctx) {
			return new Authenticates((Message) visit(ctx.fun1), (Message)visit(ctx.fun2), (Message)visit(ctx.mes), "");
		}
		
		@Override
		public AST visitArrowmsg (pparserParser.ArrowmsgContext ctx) {
			return new ArrowGoal((Message)visit(ctx.fun), (Message)visit(ctx.mes));
		}

		@Override
		public AST visitTypesoptsemi(pparserParser.TypesoptsemiContext ctx) {
			return new Type((Variable)visit(ctx.type), visit(ctx.cs));
		}

		@Override
		public AST visitTypesemi(pparserParser.TypesemiContext ctx) {
			return new Type(visit(ctx.type), visit(ctx.cs), (Types)visit(ctx.fun));
		}
		
		@Override
		public AST visitCsepsingle(pparserParser.CsepsingleContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitCsepmore(pparserParser.CsepmoreContext ctx) {
			return new AList(new Variable(ctx.v.getText()), visit(ctx.fun));
		}

		@Override
		public AST visitAg(pparserParser.AgContext ctx) {
			return new Variable(ctx.t.getText());
		}

		@Override
		public AST visitNu(pparserParser.NuContext ctx) {
			return new Variable(ctx.t.getText());
		}

		@Override
		public AST visitSeq(pparserParser.SeqContext ctx) {
			return new Variable(ctx.t.getText());
		}

		@Override
		public AST visitPk(pparserParser.PkContext ctx) {
			return new Variable(ctx.t.getText());
		}

		@Override
		public AST visitSymk(pparserParser.SymkContext ctx) {
			return new Variable(ctx.t.getText());
		}

		@Override
		public AST visitFunc(pparserParser.FuncContext ctx) {
			return new Variable(ctx.t.getText());
		}

		@Override
		public AST visitUnt(pparserParser.UntContext ctx) {
			return new Variable(ctx.t.getText());
		}
	}
}
	

