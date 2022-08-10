package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class in an implementation of the inteface {@link Cursor}, and represent a specific
 * cursor in the panel.
 * @author Francesco Chiocchi
 */
public class SimpleCursor implements Cursor{

    Position home;
    Position currentPosition;
    Panel panel;
    //Direction direction;
    //Plot plot;

    /**
     * Create a simple cursor and initialize the position.
     */
    public SimpleCursor(Panel panel) {
        home = new Point(panel.getWidth() / 2, panel.getHeight() / 2);
        home = currentPosition;

    }

    @Override
    public Position getPosition() {
        return currentPosition;
    }

    @Override
    public void setPosition(Position position) {
        this.currentPosition = position;
    }
}
