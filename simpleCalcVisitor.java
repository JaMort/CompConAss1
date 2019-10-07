// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cassign}
	 * labeled alternative in {@link simpleCalcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCassign(simpleCalcParser.CassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cexpr}
	 * labeled alternative in {@link simpleCalcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexpr(simpleCalcParser.CexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(simpleCalcParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANDif}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANDif(simpleCalcParser.ANDifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORif}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORif(simpleCalcParser.ORifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANDifelse}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANDifelse(simpleCalcParser.ANDifelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORifelse}
	 * labeled alternative in {@link simpleCalcParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORifelse(simpleCalcParser.ORifelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Notequals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequals(simpleCalcParser.NotequalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(simpleCalcParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEquals(simpleCalcParser.GreaterEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lesser}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser(simpleCalcParser.LesserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserEquals(simpleCalcParser.LesserEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(simpleCalcParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketCond}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketCond(simpleCalcParser.BracketCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
}