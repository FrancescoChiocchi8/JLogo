package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.instruction.Instruction;

import java.util.List;

/**
 * This interface take in input a list of instructions as a String and has the responsibility of
 * identify the commands in the file.
 * @author Francesco Chiocchi
 */
public interface Parser {

    /**
     * This method is used to execute the parser from a String that contains all instructions
     * specified in the file.
     *
     * @param instructions contained in the file
     * @return a list of all instructions contained in the file
     */
    List<Instruction> parse(String instructions);
}
