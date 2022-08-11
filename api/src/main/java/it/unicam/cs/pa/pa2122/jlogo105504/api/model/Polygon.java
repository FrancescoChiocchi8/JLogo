package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.List;

/**
 * This class is used to represent a generic Polygon that have at least one shape in the list.
 *
 * @author Francesco Chiocchi
 */
public class Polygon implements Shape{

    private final List<Shape> listShapes;
    private final Color color;

    /**
     * Create a new Polygon that has at least one shape in the list, because if in the future,
     * this class will introduce the possibility of generating different types of segments,
     * such as edges or curves, only one segment will be enough to compose the closed area.
     *
     * @param listShapes the list that must contain at least one shape
     * @param color the color for the closed area
     */
    public Polygon(List<Shape> listShapes, Color color) {
        checkElementsInTheList(listShapes);
        //checkIfIsAPolygon();
        this.listShapes = listShapes;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Get the list of the shape that make the closed area.
     *
     * @return the list of the shape that make the closed area
     */
    public List<Shape> getListShapes() {
        return listShapes;
    }

}
