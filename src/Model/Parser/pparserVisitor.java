package Model.Parser;
// Generated from pparser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pparserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pparserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pparserParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(pparserParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funProtocol}
	 * labeled alternative in {@link pparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunProtocol(pparserParser.FunProtocolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funTypes}
	 * labeled alternative in {@link pparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunTypes(pparserParser.FunTypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funKnowledge}
	 * labeled alternative in {@link pparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunKnowledge(pparserParser.FunKnowledgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funActions}
	 * labeled alternative in {@link pparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunActions(pparserParser.FunActionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funGoals}
	 * labeled alternative in {@link pparserParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunGoals(pparserParser.FunGoalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funBrainWhere}
	 * labeled alternative in {@link pparserParser#iknow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunBrainWhere(pparserParser.FunBrainWhereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funBrain}
	 * labeled alternative in {@link pparserParser#iknow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunBrain(pparserParser.FunBrainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brainWithSemi}
	 * labeled alternative in {@link pparserParser#brain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrainWithSemi(pparserParser.BrainWithSemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brainOptSemi}
	 * labeled alternative in {@link pparserParser#brain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrainOptSemi(pparserParser.BrainOptSemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notlastAct}
	 * labeled alternative in {@link pparserParser#act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotlastAct(pparserParser.NotlastActContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastAct}
	 * labeled alternative in {@link pparserParser#act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastAct(pparserParser.LastActContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funFromTo}
	 * labeled alternative in {@link pparserParser#w2w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunFromTo(pparserParser.FunFromToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regular}
	 * labeled alternative in {@link pparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular(pparserParser.RegularContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link pparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(pparserParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowstar}
	 * labeled alternative in {@link pparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowstar(pparserParser.ArrowstarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stararrowstar}
	 * labeled alternative in {@link pparserParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStararrowstar(pparserParser.StararrowstarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normal}
	 * labeled alternative in {@link pparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal(pparserParser.NormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code square}
	 * labeled alternative in {@link pparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(pparserParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code squaremess}
	 * labeled alternative in {@link pparserParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquaremess(pparserParser.SquaremessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wscomma}
	 * labeled alternative in {@link pparserParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWscomma(pparserParser.WscommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wsnocomma}
	 * labeled alternative in {@link pparserParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsnocomma(pparserParser.WsnocommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code waisingle}
	 * labeled alternative in {@link pparserParser#wai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaisingle(pparserParser.WaisingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code waimore}
	 * labeled alternative in {@link pparserParser#wai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaimore(pparserParser.WaimoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mnocomma}
	 * labeled alternative in {@link pparserParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnocomma(pparserParser.MnocommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mcomma}
	 * labeled alternative in {@link pparserParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMcomma(pparserParser.McommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normfunction}
	 * labeled alternative in {@link pparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormfunction(pparserParser.NormfunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normnoenc}
	 * labeled alternative in {@link pparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormnoenc(pparserParser.NormnoencContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normenc}
	 * labeled alternative in {@link pparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormenc(pparserParser.NormencContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normvariable}
	 * labeled alternative in {@link pparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormvariable(pparserParser.NormvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normparenth}
	 * labeled alternative in {@link pparserParser#norm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormparenth(pparserParser.NormparenthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code limore}
	 * labeled alternative in {@link pparserParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimore(pparserParser.LimoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lisingle}
	 * labeled alternative in {@link pparserParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisingle(pparserParser.LisingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goalsmore}
	 * labeled alternative in {@link pparserParser#goals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoalsmore(pparserParser.GoalsmoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goalssingle}
	 * labeled alternative in {@link pparserParser#goals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoalssingle(pparserParser.GoalssingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code secretbetween}
	 * labeled alternative in {@link pparserParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecretbetween(pparserParser.SecretbetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code weaklyauthent}
	 * labeled alternative in {@link pparserParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeaklyauthent(pparserParser.WeaklyauthentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code authent}
	 * labeled alternative in {@link pparserParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthent(pparserParser.AuthentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowmsg}
	 * labeled alternative in {@link pparserParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowmsg(pparserParser.ArrowmsgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typesoptsemi}
	 * labeled alternative in {@link pparserParser#whattype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesoptsemi(pparserParser.TypesoptsemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typesemi}
	 * labeled alternative in {@link pparserParser#whattype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesemi(pparserParser.TypesemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code csepsingle}
	 * labeled alternative in {@link pparserParser#csep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsepsingle(pparserParser.CsepsingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code csepmore}
	 * labeled alternative in {@link pparserParser#csep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsepmore(pparserParser.CsepmoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ag}
	 * labeled alternative in {@link pparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAg(pparserParser.AgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nu}
	 * labeled alternative in {@link pparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNu(pparserParser.NuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link pparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(pparserParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pk}
	 * labeled alternative in {@link pparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPk(pparserParser.PkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symk}
	 * labeled alternative in {@link pparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymk(pparserParser.SymkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link pparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(pparserParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unt}
	 * labeled alternative in {@link pparserParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnt(pparserParser.UntContext ctx);
}