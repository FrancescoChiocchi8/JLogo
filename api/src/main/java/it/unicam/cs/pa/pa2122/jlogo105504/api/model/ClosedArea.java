package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception.NoGeneratedClosedAreaException;

import java.util.List;

/**
 * This interface represents a generic closed area in a panel.
 *
 * @author Francesco Chiocchi
 */
public interface ClosedArea {

    /**
     * Get the color of the closed area.
     *
     * @return the color of the closed area.
     */
    Color getColor();

    /**
     * Get the elements that compose the closed area.
     *
     * @return the elements that compose the closed area.
     */
    List<BasicShape> getBasicShapes();

    /**
     * This default method is used to check the basic shape's list that is not empty.
     *
     * @param basicShapes the list to check
     */
    default void checkBasicShapesList(List<BasicShape> basicShapes){
        if(basicShapes.isEmpty())
            throw new NoGeneratedClosedAreaException();
    }

}
