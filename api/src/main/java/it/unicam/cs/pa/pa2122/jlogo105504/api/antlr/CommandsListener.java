// Generated from C:/Users/fchio/JLogo/api/src/main/java/it/unicam/cs/pa/pa2122/jlogo105504/api/grammar\Commands.g4 by ANTLR 4.10.1

package it.unicam.cs.pa.pa2122.jlogo105504.api.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandsParser}.
 */
public interface CommandsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandsParser#sequenceInstruction}.
	 * @param ctx the parse tree
	 */
	void enterSequenceInstruction(CommandsParser.SequenceInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#sequenceInstruction}.
	 * @param ctx the parse tree
	 */
	void exitSequenceInstruction(CommandsParser.SequenceInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CommandsParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CommandsParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#forward}.
	 * @param ctx the parse tree
	 */
	void enterForward(CommandsParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#forward}.
	 * @param ctx the parse tree
	 */
	void exitForward(CommandsParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#backward}.
	 * @param ctx the parse tree
	 */
	void enterBackward(CommandsParser.BackwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#backward}.
	 * @param ctx the parse tree
	 */
	void exitBackward(CommandsParser.BackwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(CommandsParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(CommandsParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(CommandsParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(CommandsParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#clearScreen}.
	 * @param ctx the parse tree
	 */
	void enterClearScreen(CommandsParser.ClearScreenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#clearScreen}.
	 * @param ctx the parse tree
	 */
	void exitClearScreen(CommandsParser.ClearScreenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(CommandsParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(CommandsParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#penUp}.
	 * @param ctx the parse tree
	 */
	void enterPenUp(CommandsParser.PenUpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#penUp}.
	 * @param ctx the parse tree
	 */
	void exitPenUp(CommandsParser.PenUpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#penDown}.
	 * @param ctx the parse tree
	 */
	void enterPenDown(CommandsParser.PenDownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#penDown}.
	 * @param ctx the parse tree
	 */
	void exitPenDown(CommandsParser.PenDownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#setPenColor}.
	 * @param ctx the parse tree
	 */
	void enterSetPenColor(CommandsParser.SetPenColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#setPenColor}.
	 * @param ctx the parse tree
	 */
	void exitSetPenColor(CommandsParser.SetPenColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#setFillColor}.
	 * @param ctx the parse tree
	 */
	void enterSetFillColor(CommandsParser.SetFillColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#setFillColor}.
	 * @param ctx the parse tree
	 */
	void exitSetFillColor(CommandsParser.SetFillColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#setScreenColor}.
	 * @param ctx the parse tree
	 */
	void enterSetScreenColor(CommandsParser.SetScreenColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#setScreenColor}.
	 * @param ctx the parse tree
	 */
	void exitSetScreenColor(CommandsParser.SetScreenColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#setPenSize}.
	 * @param ctx the parse tree
	 */
	void enterSetPenSize(CommandsParser.SetPenSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#setPenSize}.
	 * @param ctx the parse tree
	 */
	void exitSetPenSize(CommandsParser.SetPenSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(CommandsParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(CommandsParser.RepeatContext ctx);
}