package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface represents a generic position with two coordinates.
 * @author Francesco Chiocchi
 */
public interface Position {

    /**
     * Get the current x-coordinate.
     * @return the x-coordinate
     */
    double getX();

    /**
     * Get the current y-coordinate.
     * @return the y-coordinate
     */
    double getY();

    /**
     * Set the x-coordinate.
     * @param x the x-coordinate
     */
    void setX(double x);        ;


    /**
     * Set the y-coordinate.
     * @param y the y-coordinate
     */
    void setY(double y);

}
