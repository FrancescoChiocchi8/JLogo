package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class is an implementation of the interface {@link Shape}.
 *
 * @author Francesco Chiocchi
 */
public class Line implements Shape {

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
    public Line(Position start, Position end, Color color, int size) {
        this.start = start;
        this.end = end;
        this.color = color;
        checkSizeShape(size);
        this.size = size;
    }

    /**
     * Get the line's start position.
     *
     * @return the line's start position.
     */
    public Position getStart() {
        return start;
    }

    /**
     * Get the shape's end position.
     *
     * @return the shape's end position.
     */
    public Position getEnd() {
        return end;
    }

    /**
     * Get the size of the line.
     *
     * @return the size of the line
     */
    public int getSize() {
        return size;
    }

    @Override
    public Color getColor() {
        return color;
    }

}
