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

public class AnalysisParser {
	
	public AnalysisParser () {}
	
	public AST run(String t) throws Exception {
		// Translate the input string into stream of characters
		CharStream inputStream = CharStreams.fromString(t);

		// Create a lexer for the CharStream
		aparserLexer lex = new aparserLexer(inputStream);

		// Use the lexer to generate the token stream
		CommonTokenStream tokens = new CommonTokenStream(lex);


		// Create a parser for the given token stream and start it

		try {

			// Instantiate an evaluator
			Evaluator evaluator = new Evaluator();

			aparserParser parser = new aparserParser(tokens);
			parser.setErrorHandler(new BailErrorStrategy());
			return evaluator.visit(parser.start());


		} catch (Exception e){

		}
		return null;
	}
	
	class Evaluator extends aparserBaseVisitor<AST> {
		Evaluator() {
		}

		@Override
		public AST visitStart (aparserParser.StartContext ctx) {
			Keeper keep = new Keeper();

			for (int i = 0; i<ctx.begin().size(); i++) {
				keep.keep(this.visit(ctx.begin(i)));
			}
			
			return keep;
		}
		
		@Override
		public AST visitFunVer (aparserParser.FunVerContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}
		
		@Override
		public AST visitFunIn (aparserParser.FunInContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}

		@Override
		public AST visitFunSum (aparserParser.FunSumContext ctx) {
			return new SummaryKeeper(new Variable(ctx.t.getText()), visit(ctx.fun));
		}
		
		@Override
		public AST visitFunGoal (aparserParser.FunGoalContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}
		
		@Override
		public AST visitFunDet (aparserParser.FunDetContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), null, visit(ctx.fun));
		}
		
		@Override
		public AST visitFunBack (aparserParser.FunBackContext ctx) {
			return new TextKeeper(new Variable(ctx.t.getText()), new Variable(ctx.t2.getText()), visit(ctx.fun));
		}
		
		@Override
		public AST visitFunStat (aparserParser.FunStatContext ctx) {
			return new StatKeeper(new Variable(ctx.t.getText()), (Stats)visit(ctx.fun));
		}
		
		@Override
		public AST visitFunTrace (aparserParser.FunTraceContext ctx) {
			return new TraceKeeper(new Variable(ctx.t.getText()), (Trace) visit(ctx.fun));
		}
		
		@Override
		public AST visitNameDot (aparserParser.NameDotContext ctx) {
			return new Dot((Variable)visit(ctx.fun1), (Variable)visit(ctx.fun2));
		}

		@Override
		public AST visitNameV (aparserParser.NameVContext ctx) {
			return new Variable(ctx.var.getText());
		}

		@Override
		public AST visitNameN (aparserParser.NameNContext ctx) {
			return new Variable(ctx.n.getText());
		}

		@Override
		public AST visitNameF (aparserParser.NameFContext ctx) {
			return new Variable(ctx.getText());
		}
		
		@Override
		public AST visitTraceMore (aparserParser.TraceMoreContext ctx) {
			return new Trace((Action)visit(ctx.fun), (Trace)visit(ctx.fun2));
		}

		@Override
		public AST visitTraceLast (aparserParser.TraceLastContext ctx) {
			return new Trace((Action)visit(ctx.fun));
		}
		
		@Override
		public AST visitAAct (aparserParser.AActContext ctx) {
			return new Action(visit(ctx.mes), visit(ctx.fun), 1);
		}
		
		@Override
		public AST visitFromTo (aparserParser.FromToContext ctx) {
			return new FromTo(visit(ctx.from), visit(ctx.arrow), visit(ctx.to));
		}

		@Override
		public AST visitRegular (aparserParser.RegularContext ctx) {
			return new Variable("->");
		}
		
		@Override
		public AST visitStar (aparserParser.StarContext ctx) {
			return new Variable("*->");
		}
		
		@Override
		public AST visitArrowstar (aparserParser.ArrowstarContext ctx) {
			return new Variable("->*");
		}
		
		@Override
		public AST visitStararrowstar (aparserParser.StararrowstarContext ctx) {
			return new Variable("*->*");
		}
		
		@Override
		public AST visitWVar (aparserParser.WVarContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitWNum (aparserParser.WNumContext ctx) {
			return new Variable(ctx.n.getText());
		}
		
		@Override
		public AST visitWComma (aparserParser.WCommaContext ctx) {
			return new Wcomma(visit(ctx.fun1), visit(ctx.fun2));
		}

		@Override
		public AST visitMcomma (aparserParser.McommaContext ctx) {			
			return new AList(visit(ctx.mes1), visit(ctx.mes2));
		}
		
		@Override
		public AST visitMnocomma (aparserParser.MnocommaContext ctx) {
			return visit(ctx.n);
		}

		@Override
		public AST visitNormfunction (aparserParser.NormfunctionContext ctx) {
			return new Function(new Variable(ctx.v.getText()), visit(ctx.l));
		}
		
		@Override
		public AST visitNormnoenc (aparserParser.NormnoencContext ctx) {
			return new NoEnc(visit(ctx.mes), visit(ctx.n));
		}
		
		@Override
		public AST visitNormenc (aparserParser.NormencContext ctx) {
			return new SymEnc(visit(ctx.mes), visit(ctx.n));
		}
		
		@Override
		public AST visitNormvariable (aparserParser.NormvariableContext ctx) {
			return new Variable(ctx.v.getText());
		}
		
		@Override
		public AST visitNormnum (aparserParser.NormnumContext ctx) {
			return new Variable(ctx.n.getText());
		}
		
		@Override
		public AST visitNormMore (aparserParser.NormMoreContext ctx) {
			return new NormMore(visit(ctx.n));
		}

		@Override
		public AST visitNormUnder (aparserParser.NormUnderContext ctx) {
			return new Variable("_");
		}
		
		@Override
		public AST visitNormparenth (aparserParser.NormparenthContext ctx) {
			return new Function(new Variable(""), visit(ctx.mes));
		}
		
		@Override
		public AST visitLimore(aparserParser.LimoreContext ctx) {
			return new AList(visit(ctx.no), visit(ctx.l));
		}
		
		@Override
		public AST visitLisingle(aparserParser.LisingleContext ctx) {
			return visit(ctx.no);
		}
		
		@Override
		public AST visitStatBoth (aparserParser.StatBothContext ctx) {
			return new Stat((Variable)visit(ctx.fun), new Variable(ctx.n.getText()), new Variable(ctx.v.getText()), true, (Stat)visit(ctx.fun2));
		}
		
		@Override
		public AST visitStatStat (aparserParser.StatStatContext ctx) {
			return new Stat((Variable)visit(ctx.fun), new Variable(ctx.n.getText()), new Variable(ctx.v.getText()), false, (Stat)visit(ctx.fun2));
		}
		
		@Override
		public AST visitStatNeither (aparserParser.StatNeitherContext ctx) {
			return new Stat((Variable)visit(ctx.fun), new Variable(ctx.n.getText()), new Variable(ctx.v.getText()), false);
		}
		
		@Override
		public AST visitStatCol (aparserParser.StatColContext ctx) {
			return new Stat((Variable)visit(ctx.fun), new Variable(ctx.n.getText()), new Variable(ctx.v.getText()), true);
		}
		
		@Override
		public AST visitTypesT (aparserParser.TypesTContext ctx) {
			return new Variable("TIME");
		}
		
		@Override
		public AST visitTypesP (aparserParser.TypesPContext ctx) {
			return new Variable("parseTime");
		}
		
		@Override
		public AST visitTypesV (aparserParser.TypesVContext ctx) {
			return new Variable("visitedNodes");
		}
		
		@Override
		public AST visitTypesD (aparserParser.TypesDContext ctx) {
			return new Variable("depth");
		}
		
		@Override
		public AST visitFVer (aparserParser.FVerContext ctx) {
			return new Variable(ctx.n.getText());
		}

		@Override
		public AST visitTexU (aparserParser.TexUContext ctx) {
			return new UnderSep(visit(ctx.fun), visit(ctx.fun2));
		}

		@Override
		public AST visitTexA (aparserParser.TexAContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexN (aparserParser.TexNContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexF (aparserParser.TexFContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexMore (aparserParser.TexMoreContext ctx) {
			return new Variable(ctx.v.getText());
		}

		@Override
		public AST visitTexV (aparserParser.TexVContext ctx) {
			return new Variable(ctx.v.getText());
		}
	}

}
