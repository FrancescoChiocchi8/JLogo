package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.List;

/**
 * This interface represents a generic shape in the panel.
 *
 * @author Francesco Chiocchi
 */
public abstract class Shape {

    /**
     * Default constructor.
     */
    public Shape(){ }

    /**
     * Get the color of the shape.
     *
     * @return the color of the shape.
     */
    public abstract Color getColor();

    /**
     * Get the list of the line that make the closed area.
     *
     * @return the list of the line that make the closed area.
     * @throws UnsupportedOperationException if it is not a complex shape.
     */
    public abstract List<Line> getListLine();

    /**
     * Get shape's start position if it is a basic shape such as Line, Edge, Curves...
     *
     * @return the shape's start position.
     * @throws UnsupportedOperationException if it is a complex shape
     */
    public abstract Position getStart();

    /**
     * Get shape's end position if it is a basic shape such as Line, Edge, Curves...
     *
     * @return the shape's end position.
     * @throws UnsupportedOperationException if it is a complex shape
     */
    public abstract Position getEnd();

    /**
     * Get shape's size if it is a basic shape such as Line, Edge, Curves...
     *
     * @return the shape's size.
     * @throws UnsupportedOperationException if it is a complex shape
     */
    public abstract int getSize();

}
