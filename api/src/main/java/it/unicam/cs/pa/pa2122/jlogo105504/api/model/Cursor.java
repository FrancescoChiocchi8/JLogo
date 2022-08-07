package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface represents a generic cursor.
 * @author Francesco Chiocchi
 */
public interface Cursor {

    /**
     * Get the current position of the cursor.
     * @return the current position of the cursor
     */
    Position getPosition();

    /**
     * Set of the position of the cursor.
     * @param position of the cursor
     */
    void setPosition(Position position);

}
