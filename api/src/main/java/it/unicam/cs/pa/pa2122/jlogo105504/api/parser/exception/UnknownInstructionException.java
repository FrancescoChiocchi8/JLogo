package it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception;

/**
 * Thrown to indicate that a file has an illegal instruction.
 *
 * @author Francesco Chiocchi
 */
public class UnknownInstructionException extends RuntimeException {

    public UnknownInstructionException(String instruction) {
        super("Unknown Instruction for the LOGO Application: " + instruction);
    }
}
