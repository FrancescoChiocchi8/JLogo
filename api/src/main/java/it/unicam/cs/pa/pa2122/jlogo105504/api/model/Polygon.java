package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.List;

/**
 * This class is used to represent a generic Polygon that have at least one shape in the list.
 *
 * @author Francesco Chiocchi
 */
public class Polygon extends Shape{

    private final List<Line> listLine;
    private Color color;

    /**
     * Create a new Polygon that has at least one shape in the list, because if in the future,
     * this class will introduce the possibility of generating different types of segments,
     * such as edges or curves, only one segment will be enough to compose the closed area.
     *
     * @param listLine the list that must contain at least one shape
     */
    public Polygon(List<Line> listLine) {
        this.listLine = listLine;
        this.color = new RGBColor(255,255,255);
    }

    @Override
    public Color getColor() {
        return color;
    }

    /**
     * This method is used to color this polygon.
     *
     * @param color the new color of the polygon
     */
    public void setFillColor(Color color){this.color = color;}

    @Override
    public List<Line> getListLine() {
        return listLine;
    }

    @Override
    public Position getStart() {
        throw new UnsupportedOperationException("It is a complex shape");
    }

    @Override
    public Position getEnd() {
        throw new UnsupportedOperationException("It is a complex shape");
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("It is a complex shape");
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "listLine=" + listLine +
                ", color=" + color +
                '}';
    }
}
