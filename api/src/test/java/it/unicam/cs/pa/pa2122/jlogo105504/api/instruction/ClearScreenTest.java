package it.unicam.cs.pa.pa2122.jlogo105504.api.instruction;

import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsLexer;
import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsParser;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.LogoBaseListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * This class is used to check the instruction CLEARSCREEN.
 * @author Francesco Chiocchi
 */
public class ClearScreenTest {

    Panel panel = new SimplePanel(500,400);

    void getFile(File file, Panel panel) throws IOException {
        /*CommandsLexer lexer = new CommandsLexer(CharStreams.fromFileName(file));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CommandsParser parser = new CommandsParser(tokens);
        ParseTree tree = parser.sequenceInstruction();
        ParseTreeWalker walker = new ParseTreeWalker();
        LogoBaseListener logoBaseListener = new LogoBaseListener(panel);
        walker.walk(logoBaseListener, tree);*/
    }

    @Test
    void testClearScreenInstruction() {
    }
}
