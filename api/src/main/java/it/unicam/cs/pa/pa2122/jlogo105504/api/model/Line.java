package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.Objects;

/**
 * This class is an implementation of the interface {@link BasicShape}.
 *
 * @author Francesco Chiocchi
 */
public class Line extends BasicShape {

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

    @Override
    public Position getStart() {
        return start;
    }

    @Override
    public Position getEnd() {
        return end;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Color getColor() {
        return color;
    }

    /**
     * This private method is used to check the size of a shape when a new shape will
     * be updated.
     *
     * @param size of the shape to be checked
     */
    private void checkSizeShape(int size) {
        if(size < 0)
            throw new IllegalArgumentException("Incorrect dimensions for the size of the line!");
    }

    /**
     * A line is equals to other if and only if its start and end points are the same.
     *
     * @param o the other object to be confronted
     * @return true if the two lines are equals, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (size != line.size) return false;
        if (!Objects.equals(start, line.start)) return false;
        if (!Objects.equals(end, line.end)) return false;
        return Objects.equals(color, line.color);
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "LINE <" +
                start.getX() + "> <" +
                start.getY() + "> <" +
                end.getX() + "> <" +
                end.getY() + "> <" +
                color.red() + "> <" +
                color.green() + "> <" +
                color.blue() + "> <" +
                size + ">\n";
    }

}