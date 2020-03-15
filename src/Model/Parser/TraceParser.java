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

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TraceParser {
	
	public AST run(String input) throws Exception {

		// Translate the input string into stream of characters
		CharStream inputStream = CharStreams.fromString(input);

		// Create a lexer for the CharStream
		tparserLexer lex = new tparserLexer(inputStream);

		// Use the lexer to generate the token stream
		CommonTokenStream tokens = new CommonTokenStream(lex);


		// Create a parser for the given token stream and start it

		try {

			// Instantiate an evaluator
			Evaluator evaluator = new Evaluator();

			tparserParser parser = new tparserParser(tokens);
			parser.setErrorHandler(new BailErrorStrategy());
			return evaluator.visit(parser.start());

		} catch (Exception e){
		}
		return null;
	}


	class Evaluator extends tparserBaseVisitor<AST> {
		Evaluator() {

		}

		@Override
		public AST visitStart (tparserParser.StartContext ctx) {
			Keeper keep = new Keeper();

			for (int i = 0; i<ctx.begin().size(); i++) {
				keep.keep(this.visit(ctx.begin(i)));
			}
			
			return keep;
		}
		
		@Override
		public AST visitFunVer (tparserParser.FunVerContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}

		@Override
		public AST visitFunSum (tparserParser.FunSumContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.sum));
		}
		
		@Override
		public AST visitFunVer2 (tparserParser.FunVer2Context ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), new Variable(ctx.t2.getText()), visit(ctx.fun));
		}
		
		@Override
		public AST visitFunCom (tparserParser.FunComContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText() + ":  state"), null, visit(ctx.fun));
		}

		@Override
		public AST visitFunPost (tparserParser.FunPostContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}

		@Override
		public AST visitFunIk (tparserParser.FunIkContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}

		@Override
		public AST visitFunCon (tparserParser.FunConContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}

		@Override
		public AST visitFunWhere (tparserParser.FunWhereContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}

		@Override
		public AST visitFunHistory (tparserParser.FunHistoryContext ctx) {
			return new HistoryKeeper(new Variable(""), (History)visit(ctx.fun));
		}

		@Override
		public AST visitFunOp (tparserParser.FunOpContext ctx) {
			return visit(ctx.fun);
		}
		
		@Override
		public AST visitOpMore (tparserParser.OpMoreContext ctx) {
			List<Actions> acts = new ArrayList<Actions>();
			for (int i = 0; i<ctx.act().size(); i++) acts.add((Actions) visit(ctx.act(i)));
			return new Options((Option)new Option(new Variable(ctx.n.getText()), acts), (Options) visit(ctx.fun2));
		}

		@Override
		public AST visitOpLast (tparserParser.OpLastContext ctx) {
			List<Actions> acts = new ArrayList<Actions>();
			for (int i = 0; i<ctx.act().size(); i++) acts.add((Actions) visit(ctx.act(i)));
			return new Options(new Option(new Variable(ctx.n.getText()), acts));
		}
		
		@Override
		public AST visitHistMore (tparserParser.HistMoreContext ctx) {
			return new History((Action)visit(ctx.fun), (History)visit(ctx.fun2));
		}

		@Override
		public AST visitHistLast (tparserParser.HistLastContext ctx) {
			return new History((Action)visit(ctx.fun));
		}
		
		@Override
		public AST visitWheMore (tparserParser.WheMoreContext ctx) {
			List<Variable> list = new ArrayList<Variable>();
			for(int i=0; i<ctx.wheSym().size(); i++) list.add((Variable) visit(ctx.wheSym(i)));
			return new WheColl(new WhePar(list), (Variable)visit(ctx.fun2), (WheColl)visit(ctx.fun3));
		}

		@Override
		public AST visitWhePar (tparserParser.WheParContext ctx) {
			List<Variable> list = new ArrayList<Variable>();
			for(int i=0; i<ctx.wheSym().size(); i++) list.add((Variable) visit(ctx.wheSym(i)));
			return new WheColl(new WhePar(list));
		}

		@Override
		public AST visitWheLast (tparserParser.WheLastContext ctx) {
			return new WheColl((Variable)visit(ctx.fun));
		}
		
		@Override
		public AST visitSymT (tparserParser.SymTContext ctx) { 
			return new Variable("True");
		}

		@Override
		public AST visitSymF (tparserParser.SymFContext ctx) {
			return new Variable("False");
		}

		@Override
		public AST visitSymV (tparserParser.SymVContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitSymS (tparserParser.SymSContext ctx) { 
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitSymE (tparserParser.SymEContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitSymA (tparserParser.SymAContext ctx) {
			return new Variable(" and ");
		}

		@Override
		public AST visitSymO (tparserParser.SymOContext ctx) {
			return new Variable(" or ");
		}
		
		@Override
		public AST visitConMore (tparserParser.ConMoreContext ctx) {
			return new Constraints(visit(ctx.mes), visit(ctx.fun));
		}

		@Override
		public AST visitConLast (tparserParser.ConLastContext ctx) {
			return new Constraints(visit(ctx.mes), null);
		}

		@Override
		public AST visitIkMore (tparserParser.IkMoreContext ctx) {
			return new Constraints(visit(ctx.mes), visit(ctx.fun));
		}

		@Override
		public AST visitIkLast (tparserParser.IkLastContext ctx) {
			return new Constraints(visit(ctx.mes), null);
		}

		@Override
		public AST visitPostM (tparserParser.PostMContext ctx) {
			if (ctx.mes == null ) return new Variable("");
			return new Constraints(visit(ctx.mes), null);
		}

		@Override
		public AST visitComMore (tparserParser.ComMoreContext ctx) {
			return new States(visit(ctx.mes), visit(ctx.fun));
		}

		@Override
		public AST visitComLast (tparserParser.ComLastContext ctx) {
			return new States(visit(ctx.mes), null);
		}

		@Override
		public AST visitNameDot (tparserParser.NameDotContext ctx) {
			return new Dot((Variable)visit(ctx.fun1), (Variable)visit(ctx.fun2));
		}

		@Override
		public AST visitNameV (tparserParser.NameVContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitNameN (tparserParser.NameNContext ctx) {
			return new Variable(ctx.n.getText());
		}

		@Override
		public AST visitNameF (tparserParser.NameFContext ctx) {
			return new Variable(ctx.v.getText());
		}
		
		@Override
		public AST visitAAct (tparserParser.AActContext ctx) {
			return new Action(visit(ctx.mes), visit(ctx.fun), 1);
		}
		
		@Override
		public AST visitFromTo (tparserParser.FromToContext ctx) {
			return new FromTo(visit(ctx.from), visit(ctx.arrow), visit(ctx.to));
		}

		@Override
		public AST visitRegular (tparserParser.RegularContext ctx) {
			return new Variable("->");
		}
		
		@Override
		public AST visitStar (tparserParser.StarContext ctx) {
			return new Variable("*->");
		}
		
		@Override
		public AST visitArrowstar (tparserParser.ArrowstarContext ctx) {
			return new Variable("->*");
		}
		
		@Override
		public AST visitStararrowstar (tparserParser.StararrowstarContext ctx) {
			return new Variable("*->*");
		}
		
		@Override
		public AST visitWVar (tparserParser.WVarContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitWNum (tparserParser.WNumContext ctx) {
			return new Variable(ctx.n.getText());
		}
		
		@Override
		public AST visitWComma (tparserParser.WCommaContext ctx) {
			return new Wcomma(visit(ctx.fun1), visit(ctx.fun2));
		}

		@Override
		public AST visitMcomma (tparserParser.McommaContext ctx) {			
			return new AList(visit(ctx.mes1), visit(ctx.mes2));
		}
		
		@Override
		public AST visitMnocomma (tparserParser.MnocommaContext ctx) {
			return visit(ctx.n);
		}

		@Override
		public AST visitNormfunction (tparserParser.NormfunctionContext ctx) {
			return new Function(new Variable(ctx.v.getText()), visit(ctx.l));
		}
		
		@Override
		public AST visitNormnoenc (tparserParser.NormnoencContext ctx) {
			return new NoEnc(visit(ctx.mes), visit(ctx.n));
		}
		
		@Override
		public AST visitNormenc (tparserParser.NormencContext ctx) {
			return new SymEnc(visit(ctx.mes), visit(ctx.n));
		}
		
		@Override
		public AST visitNormvariable (tparserParser.NormvariableContext ctx) {
			return new Variable(ctx.getText());
		}
		
		@Override
		public AST visitNormnum (tparserParser.NormnumContext ctx) {
			return new Variable(ctx.getText());
		}
		
		@Override
		public AST visitNormMore (tparserParser.NormMoreContext ctx) {
			return new NormMore(visit(ctx.n));
		}

		@Override
		public AST visitNormUnder (tparserParser.NormUnderContext ctx) {
			return new Variable("_");
		}
		
		@Override
		public AST visitNormparenth (tparserParser.NormparenthContext ctx) {
			return new Parenth(visit(ctx.mes));
		}
		
		@Override
		public AST visitNormcmes (tparserParser.NormcmesContext ctx) {
			return new NormSq(visit(ctx.mes), true);
		}

		@Override
		public AST visitNormmes (tparserParser.NormmesContext ctx) {
			return new NormSq(visit(ctx.mes), false);
		}

		@Override
		public AST visitNormcsq (tparserParser.NormcsqContext ctx) {
			return new NormSq(new Variable(""), true);
		}

		@Override
		public AST visitNormsq (tparserParser.NormsqContext ctx) {
			return new NormSq(new Variable(""), false);
		}
		
		@Override
		public AST visitNormempty (tparserParser.NormemptyContext ctx) {
			return new Variable("{}");
		}
		
		@Override
		public AST visitLimore(tparserParser.LimoreContext ctx) {
			return new AList(visit(ctx.no), visit(ctx.l));
		}
		
		@Override
		public AST visitLisingle(tparserParser.LisingleContext ctx) {
			return visit(ctx.no);
		}
		
		@Override
		public AST visitFVer (tparserParser.FVerContext ctx) {
			return new Variable(ctx.n.getText());
		}

		@Override
		public AST visitTexU (tparserParser.TexUContext ctx) {
			return new UnderSep((Variable)visit(ctx.fun), (Variable)visit(ctx.fun2));
		}

		@Override
		public AST visitTexA (tparserParser.TexAContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexN (tparserParser.TexNContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexF (tparserParser.TexFContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexMore (tparserParser.TexMoreContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexV (tparserParser.TexVContext ctx) {
			return new Variable(ctx.v.getText());
		}
	}
}
