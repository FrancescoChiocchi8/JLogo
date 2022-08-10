package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface represents a generic line.
 *
 * @author Francesco Chiocchi
 */
public interface Line {

    /**
     * Get the line's start position.
     * @return the line's start position.
     */
    Position getStart();

    /**
     * Get the line's end position.
     * @return the line's end position.
     */
    Position getEnd();

    /**
     * Get the color of the line.
     * @return the color of the line
     */
    Color getLineColor();

}
