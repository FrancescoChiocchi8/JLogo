package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class in an implementation of the interface {@link Cursor}, and represent a specific
 * cursor in the panel.
 *
 * @author Francesco Chiocchi
 */
public class SimpleCursor implements Cursor {

    private Position currentPosition;
    private int direction;
    private boolean plot;
    private int sizeLine;
    private Color currentShapeColor;
    private Color currentFillColor;

    /**
     * Create a simple cursor and initialize the position, set of plot to default
     * value true, and set of the size of the line to value 1.
     */
    public SimpleCursor() {
        direction = 0;
        plot = true;
        sizeLine = 1;
        currentShapeColor = new RGBColor(0, 0, 0);
        currentFillColor = new RGBColor(255, 255, 255);
    }

    @Override
    public Position getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void setCurrentPosition(Position position) {
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
        this.direction = getDirection() + direction;
        this.direction = this.direction % 360;
    }

    @Override
    public int getSizeLine() {
        return sizeLine;
    }

    @Override
    public void setSizeLine(int sizeLine) {
        checkSetSizeLine(sizeLine);
        this.sizeLine = sizeLine;
    }

    @Override
    public Color getCurrentShapeColor() {
        return currentShapeColor;
    }

    @Override
    public void setCurrentShapeColor(Color color) {
        this.currentShapeColor = color;
    }

    @Override
    public Color getCurrentFillColor() {
        return currentFillColor;
    }

    @Override
    public void setCurrentFillColor(Color color) {
        this.currentFillColor = color;
    }

    @Override
    public String toString() {
        return "SimpleCursor{" +
                "currentPosition=" + currentPosition +
                ", direction=" + direction +
                ", plot=" + plot +
                ", sizeLine=" + sizeLine +
                ", currentLineColor=" + currentShapeColor +
                '}';
    }
}
