package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

/**
 * @author Francesco Chiocchi
 */
public class UnknownInstructionException extends Throwable {

    public UnknownInstructionException(String errorMessage) {
        super("Unknown Instruction for the LOGO Application: " + errorMessage);
    }
}
