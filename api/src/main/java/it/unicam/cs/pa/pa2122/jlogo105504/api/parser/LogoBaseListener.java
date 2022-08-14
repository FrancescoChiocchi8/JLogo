package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsBaseListener;
import it.unicam.cs.pa.pa2122.jlogo105504.api.antlr.CommandsParser;
import java.util.Arrays;
import java.util.List;

/**
 * This class extends the class {@link CommandsBaseListener}, and has the responsibility
 * to...
 *
 * @author Francesco Chiocchi
 */
public class LogoBaseListener extends CommandsBaseListener {

    @Override public void enterSequenceInstruction(CommandsParser.SequenceInstructionContext ctx) {
        List<CommandsParser.InstructionContext> instructions = ctx.instruction();
        for(CommandsParser.InstructionContext i : instructions ){
            System.out.println(i);
        }
    }

}