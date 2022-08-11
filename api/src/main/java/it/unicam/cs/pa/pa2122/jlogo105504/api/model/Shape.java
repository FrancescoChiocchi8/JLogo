package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.List;

/**
 * This interface represents a generic shape in the panel.
 *
 * @author Francesco Chiocchi
 */
public interface Shape {

    /**
     * Get the color of the shape.
     *
     * @return the color of the shape
     */
    Color getColor();

    /**
     * This default method is used to check the size of a shape when a new shape will
     * be updated.
     *
     * @param size of the shape to be checked
     * @return true if the size of the shape is greater than 0, false otherwise.
     */
    default boolean checkSizeShape(int size) {
        if(size >= 0)
            return true;
        else
            throw new IllegalArgumentException("Incorrect dimensions for the size of the line!");
    }

    default boolean checkElementsInTheList(List<Shape> shapes) {
        if(!shapes.isEmpty())
            return true;
        else
            throw new IllegalArgumentException("Error! The list is empty.");
    }
}
