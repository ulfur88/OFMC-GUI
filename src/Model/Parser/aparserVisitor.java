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
// Generated from aparser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link aparserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface aparserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link aparserParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(aparserParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funVer}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunVer(aparserParser.FunVerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funIn}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunIn(aparserParser.FunInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funSum}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunSum(aparserParser.FunSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funGoal}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunGoal(aparserParser.FunGoalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDet}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDet(aparserParser.FunDetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funBack}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunBack(aparserParser.FunBackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funStat}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunStat(aparserParser.FunStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funTrace}
	 * labeled alternative in {@link aparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunTrace(aparserParser.FunTraceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameV}
	 * labeled alternative in {@link aparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameV(aparserParser.NameVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameF}
	 * labeled alternative in {@link aparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameF(aparserParser.NameFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameN}
	 * labeled alternative in {@link aparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameN(aparserParser.NameNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameDot}
	 * labeled alternative in {@link aparserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameDot(aparserParser.NameDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code traceMore}
	 * labeled alternative in {@link aparserParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceMore(aparserParser.TraceMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code traceLast}
	 * labeled alternative in {@link aparserParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceLast(aparserParser.TraceLastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aAct}
	 * labeled alternative in {@link aparserParser#act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAAct(aparserParser.AActContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromTo}
	 * labeled alternative in {@link aparserParser#w2w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTo(aparserParser.FromToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regular}
	 * labeled alternative in {@link aparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular(aparserParser.RegularContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link aparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(aparserParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowstar}
	 * labeled alternative in {@link aparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowstar(aparserParser.ArrowstarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stararrowstar}
	 * labeled alternative in {@link aparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStararrowstar(aparserParser.StararrowstarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wVar}
	 * labeled alternative in {@link aparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWVar(aparserParser.WVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wNum}
	 * labeled alternative in {@link aparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWNum(aparserParser.WNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wComma}
	 * labeled alternative in {@link aparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWComma(aparserParser.WCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mnocomma}
	 * labeled alternative in {@link aparserParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnocomma(aparserParser.MnocommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mcomma}
	 * labeled alternative in {@link aparserParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMcomma(aparserParser.McommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normfunction}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormfunction(aparserParser.NormfunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normnoenc}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormnoenc(aparserParser.NormnoencContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normenc}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormenc(aparserParser.NormencContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normvariable}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormvariable(aparserParser.NormvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normnum}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormnum(aparserParser.NormnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normMore}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormMore(aparserParser.NormMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normUnder}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormUnder(aparserParser.NormUnderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normparenth}
	 * labeled alternative in {@link aparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormparenth(aparserParser.NormparenthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code limore}
	 * labeled alternative in {@link aparserParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimore(aparserParser.LimoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lisingle}
	 * labeled alternative in {@link aparserParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisingle(aparserParser.LisingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statBoth}
	 * labeled alternative in {@link aparserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBoth(aparserParser.StatBothContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statStat}
	 * labeled alternative in {@link aparserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatStat(aparserParser.StatStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statNeither}
	 * labeled alternative in {@link aparserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatNeither(aparserParser.StatNeitherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statCol}
	 * labeled alternative in {@link aparserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatCol(aparserParser.StatColContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typesT}
	 * labeled alternative in {@link aparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesT(aparserParser.TypesTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typesP}
	 * labeled alternative in {@link aparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesP(aparserParser.TypesPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typesV}
	 * labeled alternative in {@link aparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesV(aparserParser.TypesVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typesD}
	 * labeled alternative in {@link aparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesD(aparserParser.TypesDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fVer}
	 * labeled alternative in {@link aparserParser#ver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFVer(aparserParser.FVerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texMore}
	 * labeled alternative in {@link aparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexMore(aparserParser.TexMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texN}
	 * labeled alternative in {@link aparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexN(aparserParser.TexNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texU}
	 * labeled alternative in {@link aparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexU(aparserParser.TexUContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texF}
	 * labeled alternative in {@link aparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexF(aparserParser.TexFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texV}
	 * labeled alternative in {@link aparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexV(aparserParser.TexVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code texA}
	 * labeled alternative in {@link aparserParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexA(aparserParser.TexAContext ctx);
}