package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.LogoBaseListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * @author Francesco Chiocchi
 */
public class ReadInstructions {

    private Panel panel;

    public ReadInstructions(Panel panel) {
        this.panel = panel;
    }

    CharStream c(String instructions) throws IOException {
        CharStream input = CharStreams.fromString(instructions);
        return input;
    }

    public void parse(String instruction) throws IOException {
        CommandsLexer lexer = new CommandsLexer(c(instruction));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CommandsParser parser = new CommandsParser(tokens);
        ParseTree tree = parser.sequenceInstruction();
        ParseTreeWalker walker = new ParseTreeWalker();
        LogoBaseListener logoBaseListener = new LogoBaseListener(panel);
        walker.walk(logoBaseListener, tree);
    }
}
