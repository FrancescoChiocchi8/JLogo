package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface represents a generic shape in the panel that may be a line, a edge, a curve...
 *
 * @author Francesco Chiocchi
 */
public abstract class BasicShape {

    /**
     * Default constructor.
     */
    public BasicShape(){ }

    /**
     * Get the color of the basic shape.
     *
     * @return the color of the basic shape.
     */
    public abstract Color getColor();

    /**
     * Get shape's start position of the basic shape.
     *
     * @return the basic shape's start position.
     */
    public abstract Position getStart();

    /**
     * Get shape's end position of the basic shape.
     *
     * @return the basic shape's end position.
     */
    public abstract Position getEnd();

    /**
     * Get shape's size of the basic shape.
     *
     * @return the basic shape's size.
     */
    public abstract int getSize();

}
