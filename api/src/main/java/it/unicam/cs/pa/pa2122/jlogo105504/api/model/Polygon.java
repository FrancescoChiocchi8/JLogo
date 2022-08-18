package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.List;

/**
 * This class is used to represent a generic Polygon that have at least one shape in the list.
 *
 * @author Francesco Chiocchi
 */
public class Polygon extends Shape{

    private final List<Shape> listShapes;
    private Color color;

    /**
     * Create a new Polygon that has at least one shape in the list, because if in the future,
     * this class will introduce the possibility of generating different types of segments,
     * such as edges or curves, only one segment will be enough to compose the closed area.
     *
     * @param listShapes the list that must contain at least one shape
     */
    public Polygon(List<Shape> listShapes) {
        checkIfIsAPolygon(listShapes);
        this.listShapes = listShapes;
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
    public List<Shape> getListOfShape() {
        return listShapes;
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

    /**
     * A polygon is composed by at least three shape if we are considering the case of the lines.
     *
     * @param shapes a list of the line that composed a polygon
     * @return true if it is a polygon, false otherwise
     */
    private void checkIfIsAPolygon(List<Shape> shapes) {
        if(!shapes.isEmpty()){
            Line firstLine = (Line) shapes.get(0);

        }
        else throw new IllegalArgumentException("Error! The list is empty.");
    }

}
