package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class is an implementation of the interface {@link Line}.
 *
 * @author Francesco Chiocchi
 */
public class LineClass implements Line{

    private final Position start;
    private final Position end;
    private final Color color;
    private final int size;

    /**
     * Create a line with the position specified and initialize the color of the line to black(0, 0, 0).
     *
     * @param start of the line
     * @param end of the line
     */
    public LineClass(Position start, Position end, Color color, int size) {
        this.start = start;
        this.end = end;
        this.color = color;
        checkSizeLine(size);
        this.size = size;
    }

    @Override
    public Position getStart() {
        return start;
    }

    @Override
    public Position getEnd() {
        return end;
    }

    @Override
    public Color getLineColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }

}
