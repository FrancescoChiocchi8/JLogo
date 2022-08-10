package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface represents a generic line.
 *
 * @author Francesco Chiocchi
 */
public interface Line {

    /**
     * Get the line's start position.
     *
     * @return the line's start position.
     */
    Position getStart();

    /**
     * Get the line's end position.
     *
     * @return the line's end position.
     */
    Position getEnd();

    /**
     * Get the color of the line.
     *
     * @return the color of the line
     */
    Color getLineColor();

    /**
     * Get the size of the line.
     *
     * @return the size of the line
     */
    int getSize();

    /**
     * This default method is used to check the size of a line when a new line will
     * be updated.
     *
     * @param size of the line to be checked
     * @return true if the line is greater than 0, false otherwise.
     */
    default boolean checkSizeLine(int size) {
        if(size >= 0)
            return true;
        else
            throw new IllegalArgumentException("Incorrect dimensions for the size of the line!");
    }
}
