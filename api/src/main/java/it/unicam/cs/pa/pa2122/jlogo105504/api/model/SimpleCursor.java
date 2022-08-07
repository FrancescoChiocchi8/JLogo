package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class in an implementation of the inteface {@link Cursor}, and represent a specific
 * cursor in the panel.
 * @author Francesco Chiocchi
 */
public class SimpleCursor implements Cursor{

    Position currentPosition;

    @Override
    public Position getPosition() {
        return currentPosition;
    }

    @Override
    public void setPosition(Position position) {
        this.currentPosition = position;
    }
}
