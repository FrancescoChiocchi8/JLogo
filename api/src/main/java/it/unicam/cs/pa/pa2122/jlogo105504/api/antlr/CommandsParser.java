// Generated from C:/Users/fchio/JLogo/api/src/main/java/it/unicam/cs/pa/pa2122/jlogo105504/api/grammar\Commands.g4 by ANTLR 4.10.1

package it.unicam.cs.pa.pa2122.jlogo105504.api.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORWARD=1, BACKWARD=2, LEFT=3, RIGHT=4, CLEARSCREEN=5, HOME=6, PENUP=7, 
		PENDOWN=8, SETPENCOLOR=9, SETFILLCOLOR=10, SETSCREENCOLOR=11, SETPENSIZE=12, 
		REPEAT=13, NUMBER=14, EXIT=15, NEWLINE=16, WS=17, COMMENT=18;
	public static final int
		RULE_logo = 0, RULE_sequenceInstruction = 1, RULE_instruction = 2, RULE_forward = 3, 
		RULE_backward = 4, RULE_left = 5, RULE_right = 6, RULE_clearScreen = 7, 
		RULE_home = 8, RULE_penUp = 9, RULE_penDown = 10, RULE_setPenColor = 11, 
		RULE_setFillColor = 12, RULE_setScreenColor = 13, RULE_setPenSize = 14, 
		RULE_repeat = 15, RULE_sequenceInstructionRepeat = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"logo", "sequenceInstruction", "instruction", "forward", "backward", 
			"left", "right", "clearScreen", "home", "penUp", "penDown", "setPenColor", 
			"setFillColor", "setScreenColor", "setPenSize", "repeat", "sequenceInstructionRepeat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FORWARD", "BACKWARD", "LEFT", "RIGHT", "CLEARSCREEN", "HOME", 
			"PENUP", "PENDOWN", "SETPENCOLOR", "SETFILLCOLOR", "SETSCREENCOLOR", 
			"SETPENSIZE", "REPEAT", "NUMBER", "EXIT", "NEWLINE", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Commands.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LogoContext extends ParserRuleContext {
		public SequenceInstructionContext sequenceInstruction() {
			return getRuleContext(SequenceInstructionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CommandsParser.EOF, 0); }
		public LogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterLogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitLogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitLogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogoContext logo() throws RecognitionException {
		LogoContext _localctx = new LogoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			sequenceInstruction();
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceInstructionContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public SequenceInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterSequenceInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitSequenceInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitSequenceInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceInstructionContext sequenceInstruction() throws RecognitionException {
		SequenceInstructionContext _localctx = new SequenceInstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequenceInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				instruction();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORWARD) | (1L << BACKWARD) | (1L << LEFT) | (1L << RIGHT) | (1L << CLEARSCREEN) | (1L << HOME) | (1L << PENUP) | (1L << PENDOWN) | (1L << SETPENCOLOR) | (1L << SETFILLCOLOR) | (1L << SETSCREENCOLOR) | (1L << SETPENSIZE) | (1L << REPEAT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public ForwardContext forward() {
			return getRuleContext(ForwardContext.class,0);
		}
		public BackwardContext backward() {
			return getRuleContext(BackwardContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public ClearScreenContext clearScreen() {
			return getRuleContext(ClearScreenContext.class,0);
		}
		public HomeContext home() {
			return getRuleContext(HomeContext.class,0);
		}
		public PenUpContext penUp() {
			return getRuleContext(PenUpContext.class,0);
		}
		public PenDownContext penDown() {
			return getRuleContext(PenDownContext.class,0);
		}
		public SetPenColorContext setPenColor() {
			return getRuleContext(SetPenColorContext.class,0);
		}
		public SetFillColorContext setFillColor() {
			return getRuleContext(SetFillColorContext.class,0);
		}
		public SetScreenColorContext setScreenColor() {
			return getRuleContext(SetScreenColorContext.class,0);
		}
		public SetPenSizeContext setPenSize() {
			return getRuleContext(SetPenSizeContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORWARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				forward();
				}
				break;
			case BACKWARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				backward();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				right();
				}
				break;
			case CLEARSCREEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				clearScreen();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				home();
				}
				break;
			case PENUP:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				penUp();
				}
				break;
			case PENDOWN:
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				penDown();
				}
				break;
			case SETPENCOLOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(50);
				setPenColor();
				}
				break;
			case SETFILLCOLOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(51);
				setFillColor();
				}
				break;
			case SETSCREENCOLOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(52);
				setScreenColor();
				}
				break;
			case SETPENSIZE:
				enterOuterAlt(_localctx, 12);
				{
				setState(53);
				setPenSize();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 13);
				{
				setState(54);
				repeat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForwardContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(CommandsParser.FORWARD, 0); }
		public TerminalNode NUMBER() { return getToken(CommandsParser.NUMBER, 0); }
		public ForwardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardContext forward() throws RecognitionException {
		ForwardContext _localctx = new ForwardContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(FORWARD);
			setState(58);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BackwardContext extends ParserRuleContext {
		public TerminalNode BACKWARD() { return getToken(CommandsParser.BACKWARD, 0); }
		public TerminalNode NUMBER() { return getToken(CommandsParser.NUMBER, 0); }
		public BackwardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backward; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterBackward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitBackward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitBackward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackwardContext backward() throws RecognitionException {
		BackwardContext _localctx = new BackwardContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_backward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(BACKWARD);
			setState(61);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(CommandsParser.LEFT, 0); }
		public TerminalNode NUMBER() { return getToken(CommandsParser.NUMBER, 0); }
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(LEFT);
			setState(64);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(CommandsParser.RIGHT, 0); }
		public TerminalNode NUMBER() { return getToken(CommandsParser.NUMBER, 0); }
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(RIGHT);
			setState(67);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClearScreenContext extends ParserRuleContext {
		public TerminalNode CLEARSCREEN() { return getToken(CommandsParser.CLEARSCREEN, 0); }
		public ClearScreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearScreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterClearScreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitClearScreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitClearScreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearScreenContext clearScreen() throws RecognitionException {
		ClearScreenContext _localctx = new ClearScreenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clearScreen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CLEARSCREEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HomeContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(CommandsParser.HOME, 0); }
		public HomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterHome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitHome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitHome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeContext home() throws RecognitionException {
		HomeContext _localctx = new HomeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(HOME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PenUpContext extends ParserRuleContext {
		public TerminalNode PENUP() { return getToken(CommandsParser.PENUP, 0); }
		public PenUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penUp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterPenUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitPenUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitPenUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenUpContext penUp() throws RecognitionException {
		PenUpContext _localctx = new PenUpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_penUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PENUP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PenDownContext extends ParserRuleContext {
		public TerminalNode PENDOWN() { return getToken(CommandsParser.PENDOWN, 0); }
		public PenDownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penDown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterPenDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitPenDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitPenDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenDownContext penDown() throws RecognitionException {
		PenDownContext _localctx = new PenDownContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_penDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PENDOWN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPenColorContext extends ParserRuleContext {
		public TerminalNode SETPENCOLOR() { return getToken(CommandsParser.SETPENCOLOR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(CommandsParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CommandsParser.NUMBER, i);
		}
		public SetPenColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPenColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterSetPenColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitSetPenColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitSetPenColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetPenColorContext setPenColor() throws RecognitionException {
		SetPenColorContext _localctx = new SetPenColorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setPenColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SETPENCOLOR);
			setState(78);
			match(NUMBER);
			setState(79);
			match(NUMBER);
			setState(80);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetFillColorContext extends ParserRuleContext {
		public TerminalNode SETFILLCOLOR() { return getToken(CommandsParser.SETFILLCOLOR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(CommandsParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CommandsParser.NUMBER, i);
		}
		public SetFillColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFillColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterSetFillColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitSetFillColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitSetFillColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetFillColorContext setFillColor() throws RecognitionException {
		SetFillColorContext _localctx = new SetFillColorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setFillColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(SETFILLCOLOR);
			setState(83);
			match(NUMBER);
			setState(84);
			match(NUMBER);
			setState(85);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetScreenColorContext extends ParserRuleContext {
		public TerminalNode SETSCREENCOLOR() { return getToken(CommandsParser.SETSCREENCOLOR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(CommandsParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CommandsParser.NUMBER, i);
		}
		public SetScreenColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setScreenColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterSetScreenColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitSetScreenColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitSetScreenColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetScreenColorContext setScreenColor() throws RecognitionException {
		SetScreenColorContext _localctx = new SetScreenColorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_setScreenColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SETSCREENCOLOR);
			setState(88);
			match(NUMBER);
			setState(89);
			match(NUMBER);
			setState(90);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPenSizeContext extends ParserRuleContext {
		public TerminalNode SETPENSIZE() { return getToken(CommandsParser.SETPENSIZE, 0); }
		public TerminalNode NUMBER() { return getToken(CommandsParser.NUMBER, 0); }
		public SetPenSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPenSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterSetPenSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitSetPenSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitSetPenSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetPenSizeContext setPenSize() throws RecognitionException {
		SetPenSizeContext _localctx = new SetPenSizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_setPenSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SETPENSIZE);
			setState(93);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(CommandsParser.REPEAT, 0); }
		public TerminalNode NUMBER() { return getToken(CommandsParser.NUMBER, 0); }
		public TerminalNode EXIT() { return getToken(CommandsParser.EXIT, 0); }
		public SequenceInstructionRepeatContext sequenceInstructionRepeat() {
			return getRuleContext(SequenceInstructionRepeatContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(REPEAT);
			setState(96);
			match(NUMBER);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORWARD) | (1L << BACKWARD) | (1L << LEFT) | (1L << RIGHT) | (1L << CLEARSCREEN) | (1L << HOME) | (1L << PENUP) | (1L << PENDOWN) | (1L << SETPENCOLOR) | (1L << SETFILLCOLOR) | (1L << SETSCREENCOLOR) | (1L << SETPENSIZE) | (1L << REPEAT))) != 0)) {
				{
				setState(97);
				sequenceInstructionRepeat();
				}
			}

			setState(100);
			match(EXIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceInstructionRepeatContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public SequenceInstructionRepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceInstructionRepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterSequenceInstructionRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitSequenceInstructionRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitSequenceInstructionRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceInstructionRepeatContext sequenceInstructionRepeat() throws RecognitionException {
		SequenceInstructionRepeatContext _localctx = new SequenceInstructionRepeatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sequenceInstructionRepeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				instruction();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORWARD) | (1L << BACKWARD) | (1L << LEFT) | (1L << RIGHT) | (1L << CLEARSCREEN) | (1L << HOME) | (1L << PENUP) | (1L << PENDOWN) | (1L << SETPENCOLOR) | (1L << SETFILLCOLOR) | (1L << SETSCREENCOLOR) | (1L << SETPENSIZE) | (1L << REPEAT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012l\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0004\u0001\'\b\u0001\u000b\u0001\f\u0001(\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000fc\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"h\b\u0010\u000b\u0010\f\u0010i\u0001\u0010\u0000\u0000\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0000i\u0000\"\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000"+
		"\u0000\u00047\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b"+
		"<\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fB\u0001\u0000\u0000"+
		"\u0000\u000eE\u0001\u0000\u0000\u0000\u0010G\u0001\u0000\u0000\u0000\u0012"+
		"I\u0001\u0000\u0000\u0000\u0014K\u0001\u0000\u0000\u0000\u0016M\u0001"+
		"\u0000\u0000\u0000\u0018R\u0001\u0000\u0000\u0000\u001aW\u0001\u0000\u0000"+
		"\u0000\u001c\\\u0001\u0000\u0000\u0000\u001e_\u0001\u0000\u0000\u0000"+
		" g\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u0000\u0000"+
		"\u0001$\u0001\u0001\u0000\u0000\u0000%\'\u0003\u0004\u0002\u0000&%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*8\u0003\u0006"+
		"\u0003\u0000+8\u0003\b\u0004\u0000,8\u0003\n\u0005\u0000-8\u0003\f\u0006"+
		"\u0000.8\u0003\u000e\u0007\u0000/8\u0003\u0010\b\u000008\u0003\u0012\t"+
		"\u000018\u0003\u0014\n\u000028\u0003\u0016\u000b\u000038\u0003\u0018\f"+
		"\u000048\u0003\u001a\r\u000058\u0003\u001c\u000e\u000068\u0003\u001e\u000f"+
		"\u00007*\u0001\u0000\u0000\u00007+\u0001\u0000\u0000\u00007,\u0001\u0000"+
		"\u0000\u00007-\u0001\u0000\u0000\u00007.\u0001\u0000\u0000\u00007/\u0001"+
		"\u0000\u0000\u000070\u0001\u0000\u0000\u000071\u0001\u0000\u0000\u0000"+
		"72\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000074\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0005\u0001"+
		"\u0000\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0005\u000e\u0000\u0000"+
		";\u0007\u0001\u0000\u0000\u0000<=\u0005\u0002\u0000\u0000=>\u0005\u000e"+
		"\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0003\u0000\u0000@A\u0005"+
		"\u000e\u0000\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005\u0004\u0000"+
		"\u0000CD\u0005\u000e\u0000\u0000D\r\u0001\u0000\u0000\u0000EF\u0005\u0005"+
		"\u0000\u0000F\u000f\u0001\u0000\u0000\u0000GH\u0005\u0006\u0000\u0000"+
		"H\u0011\u0001\u0000\u0000\u0000IJ\u0005\u0007\u0000\u0000J\u0013\u0001"+
		"\u0000\u0000\u0000KL\u0005\b\u0000\u0000L\u0015\u0001\u0000\u0000\u0000"+
		"MN\u0005\t\u0000\u0000NO\u0005\u000e\u0000\u0000OP\u0005\u000e\u0000\u0000"+
		"PQ\u0005\u000e\u0000\u0000Q\u0017\u0001\u0000\u0000\u0000RS\u0005\n\u0000"+
		"\u0000ST\u0005\u000e\u0000\u0000TU\u0005\u000e\u0000\u0000UV\u0005\u000e"+
		"\u0000\u0000V\u0019\u0001\u0000\u0000\u0000WX\u0005\u000b\u0000\u0000"+
		"XY\u0005\u000e\u0000\u0000YZ\u0005\u000e\u0000\u0000Z[\u0005\u000e\u0000"+
		"\u0000[\u001b\u0001\u0000\u0000\u0000\\]\u0005\f\u0000\u0000]^\u0005\u000e"+
		"\u0000\u0000^\u001d\u0001\u0000\u0000\u0000_`\u0005\r\u0000\u0000`b\u0005"+
		"\u000e\u0000\u0000ac\u0003 \u0010\u0000ba\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\u000f\u0000\u0000"+
		"e\u001f\u0001\u0000\u0000\u0000fh\u0003\u0004\u0002\u0000gf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000j!\u0001\u0000\u0000\u0000\u0004(7bi";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}