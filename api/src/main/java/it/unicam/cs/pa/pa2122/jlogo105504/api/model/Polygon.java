package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.List;

/**
 * This class is used to represent a generic Polygon that have at least one shape in the list.
 *
 * @author Francesco Chiocchi
 */
public class Polygon implements ClosedArea{

    private final List<BasicShape> basicShapes;
    private final Color color;

    /**
     * Create a new Polygon that has at least one shape in the list, because if in the future,
     * this class will introduce the possibility of generating different types of segments,
     * such as edges or curves, only one segment will be enough to compose the closed area.
     *
     * @param basicShapes the list that must contain at least one shape
     */
    public Polygon(List<BasicShape> basicShapes, Color color) {
        checkBasicShapesList(basicShapes);
        this.basicShapes = basicShapes;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public List<BasicShape> getBasicShapes() {
        return basicShapes;
    }

    @Override
    public String toString() {
        return "POLYGON <" +
                getBasicShapes().size() +"> <" +
                color.red() + "> <" +
                color.green() + "> <" +
                color.blue() + ">\n" +
                String.join("\n", getBasicShapes().toString());
    }

}