// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cassign}
	 * labeled alternative in {@link simpleCalcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCassign(simpleCalcParser.CassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cassign}
	 * labeled alternative in {@link simpleCalcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCassign(simpleCalcParser.CassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cexpr}
	 * labeled alternative in {@link simpleCalcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(simpleCalcParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cexpr}
	 * labeled alternative in {@link simpleCalcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(simpleCalcParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(simpleCalcParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(simpleCalcParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link simpleCalcParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile(simpleCalcParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link simpleCalcParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile(simpleCalcParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simpleif}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterSimpleif(simpleCalcParser.SimpleifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simpleif}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitSimpleif(simpleCalcParser.SimpleifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ifelse}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(simpleCalcParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ifelse}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(simpleCalcParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCond(simpleCalcParser.OrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCond(simpleCalcParser.OrCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCond}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCond(simpleCalcParser.AndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCond}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCond(simpleCalcParser.AndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lesser}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLesser(simpleCalcParser.LesserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lesser}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLesser(simpleCalcParser.LesserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEquals(simpleCalcParser.GreaterEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEquals(simpleCalcParser.GreaterEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNegation(simpleCalcParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNegation(simpleCalcParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Notequals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotequals(simpleCalcParser.NotequalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Notequals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotequals(simpleCalcParser.NotequalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LesserEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLesserEquals(simpleCalcParser.LesserEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LesserEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLesserEquals(simpleCalcParser.LesserEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketCond}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBracketCond(simpleCalcParser.BracketCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketCond}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBracketCond(simpleCalcParser.BracketCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreater(simpleCalcParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreater(simpleCalcParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleCalcParser.ConstantContext ctx);
}