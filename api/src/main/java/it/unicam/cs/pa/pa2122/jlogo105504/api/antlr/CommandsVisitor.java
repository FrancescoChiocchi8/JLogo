// Generated from C:/Users/fchio/JLogo/api/src/main/java/it/unicam/cs/pa/pa2122/jlogo105504/api/grammar\Commands.g4 by ANTLR 4.10.1

package it.unicam.cs.pa.pa2122.jlogo105504.api.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommandsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommandsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommandsParser#sequenceInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceInstruction(CommandsParser.SequenceInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(CommandsParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#forward}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(CommandsParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#backward}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackward(CommandsParser.BackwardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(CommandsParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(CommandsParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#clearScreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearScreen(CommandsParser.ClearScreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(CommandsParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#penUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenUp(CommandsParser.PenUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#penDown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenDown(CommandsParser.PenDownContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#setPenColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPenColor(CommandsParser.SetPenColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#setFillColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetFillColor(CommandsParser.SetFillColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#setScreenColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetScreenColor(CommandsParser.SetScreenColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#setPenSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPenSize(CommandsParser.SetPenSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(CommandsParser.RepeatContext ctx);
}