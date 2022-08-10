package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class in an implementation of the interface {@link Cursor}, and represent a specific
 * cursor in the panel.
 * @author Francesco Chiocchi
 */
public class SimpleCursor implements Cursor{

    Position currentPosition;
    int direction;
    boolean plot;
    int sizeLine;
    Color currentLineColor;

    /**
     * Create a simple cursor and initialize the position, set of plot to default
     * value true, and set of the size of the line to value 1.
     */
    public SimpleCursor() {
        direction = 0;
        plot = true;
        sizeLine = 1;
        currentLineColor = new RGBColor(0,0,0);
    }

    @Override
    public Position getPosition() {
        return currentPosition;
    }

    @Override
    public void setPosition(Position position) {
        this.currentPosition = position;
    }

    @Override
    public boolean getPlot() {
        return plot;
    }

    @Override
    public void setPlot(boolean plot) {
        this.plot = plot;
    }

    @Override
    public int getDirection() {
        return direction;
    }

    @Override
    public void setDirection(int direction) {
        checkCursorDirection(direction);
        this.direction = direction;
    }

    @Override
    public Color getCurrentLineColor() {
        return currentLineColor;
    }

    @Override
    public void setCurrentLineColor(Color color) {
        this.currentLineColor = color;
    }
}
