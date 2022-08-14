package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.instruction.Instruction;

import java.util.List;

/**
 * This class is an implementation of interface {@link Parser}.
 *
 * @author Francesco Chiocchi
 */
public class LogoParser implements Parser{

    List<Instruction> instructions;

    /**
     * Create a parser with th
     *
     * @param instructions in the file
     */
    public LogoParser(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public List<Instruction> parse(String instructions) {
        return null;
    }
}
