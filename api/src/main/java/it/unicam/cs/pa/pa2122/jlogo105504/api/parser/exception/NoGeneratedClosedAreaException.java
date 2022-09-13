package it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception;

/**
 * @author Francesco Chiocchi
 */
public class NoGeneratedClosedAreaException extends RuntimeException{
    public NoGeneratedClosedAreaException() {
        super("There is no polygon generated.");
    }
}
