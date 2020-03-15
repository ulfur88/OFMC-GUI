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
// Generated from tparser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tparserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tparserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tparserParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(tparserParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funVer}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunVer(tparserParser.FunVerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funSum}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunSum(tparserParser.FunSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funVer2}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunVer2(tparserParser.FunVer2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code funCom}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCom(tparserParser.FunComContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funPost}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunPost(tparserParser.FunPostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funIk}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunIk(tparserParser.FunIkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCon}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCon(tparserParser.FunConContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funWhere}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunWhere(tparserParser.FunWhereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funHistory}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunHistory(tparserParser.FunHistoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funOp}
	 * labeled alternative in {@link tparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunOp(tparserParser.FunOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opMore}
	 * labeled alternative in {@link tparserParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMore(tparserParser.OpMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opLast}
	 * labeled alternative in {@link tparserParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLast(tparserParser.OpLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code histMore}
	 * labeled alternative in {@link tparserParser#history}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistMore(tparserParser.HistMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code histLast}
	 * labeled alternative in {@link tparserParser#history}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistLast(tparserParser.HistLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wheMore}
	 * labeled alternative in {@link tparserParser#whe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWheMore(tparserParser.WheMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whePar}
	 * labeled alternative in {@link tparserParser#whe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhePar(tparserParser.WheParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wheLast}
	 * labeled alternative in {@link tparserParser#whe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWheLast(tparserParser.WheLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symT}
	 * labeled alternative in {@link tparserParser#wheSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymT(tparserParser.SymTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symF}
	 * labeled alternative in {@link tparserParser#wheSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymF(tparserParser.SymFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symV}
	 * labeled alternative in {@link tparserParser#wheSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymV(tparserParser.SymVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symS}
	 * labeled alternative in {@link tparserParser#wheSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymS(tparserParser.SymSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symE}
	 * labeled alternative in {@link tparserParser#wheSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymE(tparserParser.SymEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symA}
	 * labeled alternative in {@link tparserParser#wheSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymA(tparserParser.SymAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symO}
	 * labeled alternative in {@link tparserParser#wheSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymO(tparserParser.SymOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conMore}
	 * labeled alternative in {@link tparserParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConMore(tparserParser.ConMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conLast}
	 * labeled alternative in {@link tparserParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConLast(tparserParser.ConLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ikMore}
	 * labeled alternative in {@link tparserParser#ikst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIkMore(tparserParser.IkMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ikLast}
	 * labeled alternative in {@link tparserParser#ikst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIkLast(tparserParser.IkLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postM}
	 * labeled alternative in {@link tparserParser#postp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostM(tparserParser.PostMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comMore}
	 * labeled alternative in {@link tparserParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComMore(tparserParser.ComMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comLast}
	 * labeled alternative in {@link tparserParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComLast(tparserParser.ComLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noState}
	 * labeled alternative in {@link tparserParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoState(tparserParser.NoStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameV}
	 * labeled alternative in {@link tparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameV(tparserParser.NameVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameF}
	 * labeled alternative in {@link tparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameF(tparserParser.NameFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameN}
	 * labeled alternative in {@link tparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameN(tparserParser.NameNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameDot}
	 * labeled alternative in {@link tparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameDot(tparserParser.NameDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code traceMore}
	 * labeled alternative in {@link tparserParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceMore(tparserParser.TraceMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code traceLast}
	 * labeled alternative in {@link tparserParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceLast(tparserParser.TraceLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aAct}
	 * labeled alternative in {@link tparserParser#act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAAct(tparserParser.AActContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromTo}
	 * labeled alternative in {@link tparserParser#w2w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTo(tparserParser.FromToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regular}
	 * labeled alternative in {@link tparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular(tparserParser.RegularContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link tparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(tparserParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowstar}
	 * labeled alternative in {@link tparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowstar(tparserParser.ArrowstarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stararrowstar}
	 * labeled alternative in {@link tparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStararrowstar(tparserParser.StararrowstarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wVar}
	 * labeled alternative in {@link tparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWVar(tparserParser.WVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wNum}
	 * labeled alternative in {@link tparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWNum(tparserParser.WNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wComma}
	 * labeled alternative in {@link tparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWComma(tparserParser.WCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lkakse}
	 * labeled alternative in {@link tparserParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLkakse(tparserParser.LkakseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mnocomma}
	 * labeled alternative in {@link tparserParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnocomma(tparserParser.MnocommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mcomma}
	 * labeled alternative in {@link tparserParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMcomma(tparserParser.McommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normfunction}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormfunction(tparserParser.NormfunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normnoenc}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormnoenc(tparserParser.NormnoencContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normenc}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormenc(tparserParser.NormencContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normvariable}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormvariable(tparserParser.NormvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normnum}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormnum(tparserParser.NormnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normMore}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormMore(tparserParser.NormMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normUnder}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormUnder(tparserParser.NormUnderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normparenth}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormparenth(tparserParser.NormparenthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normcmes}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormcmes(tparserParser.NormcmesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normmes}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormmes(tparserParser.NormmesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normcsq}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormcsq(tparserParser.NormcsqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normsq}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormsq(tparserParser.NormsqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normempty}
	 * labeled alternative in {@link tparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormempty(tparserParser.NormemptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code limore}
	 * labeled alternative in {@link tparserParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimore(tparserParser.LimoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lisingle}
	 * labeled alternative in {@link tparserParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisingle(tparserParser.LisingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fVer}
	 * labeled alternative in {@link tparserParser#ver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFVer(tparserParser.FVerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texMore}
	 * labeled alternative in {@link tparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexMore(tparserParser.TexMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texN}
	 * labeled alternative in {@link tparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexN(tparserParser.TexNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texU}
	 * labeled alternative in {@link tparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexU(tparserParser.TexUContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texF}
	 * labeled alternative in {@link tparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexF(tparserParser.TexFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texV}
	 * labeled alternative in {@link tparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexV(tparserParser.TexVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texA}
	 * labeled alternative in {@link tparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexA(tparserParser.TexAContext ctx);
}