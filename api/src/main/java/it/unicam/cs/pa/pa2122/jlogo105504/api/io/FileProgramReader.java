package it.unicam.cs.pa.pa2122.jlogo105504.api.io;

import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsLexer;
import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsParser;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;

import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.LogoBaseListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;

/**
 * This class is an implementation of the interface {@link IFileProgramReader}.
 *
 * @author Francesco Chiocchi
 */
public class FileProgramReader implements IFileProgramReader {

    public FileProgramReader() {
    }

    public void readFile(File file, Panel panel) {
        try {
            CommandsLexer lexer = new CommandsLexer(CharStreams.fromPath(file.toPath()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CommandsParser parser = new CommandsParser(tokens);
            ParseTree tree = parser.sequenceInstruction();
            ParseTreeWalker walker = new ParseTreeWalker();
            LogoBaseListener logoBaseListener = new LogoBaseListener(panel);
            walker.walk(logoBaseListener, tree);
        } catch (IOException e) {
            System.out.println("Error while reading the file!!");
        }
    }
}
