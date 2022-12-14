package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.List;

/**
 * This interface is used to represent a generic panel.
 *
 * @author Francesco Chiocchi
 */
public interface Panel{

    /**
     * This method is used to get the current base of this panel.
     *
     * @return the value of base for this panel
     */
    int getWidth();

    /**
     * This method is used to get the current height of this panel.
     *
     * @return the value of height for this panel
     */
    int getHeight();

    /**
     * Get the cursor in the panel.
     *
     * @return the cursor in the panel
     */
    Cursor getCursor();

    /**
     * This method is used to get the current color of the screen.
     *
     * @return the current color of the screen
     */
    Color getScreenColor();

    /**
     * Update color of the screen.
     *
     * @param screenColor the color of the screen
     */
    void setScreenColor(Color screenColor);

    /**
     * Get the position home for this panel.
     *
     * @return the position home for this panel
     */
    Position getHome();

    /**
     * Get of the shapes for this panel.
     *
     * @return all elements in the list that represent the list of shapes which are contains in the panel.
     */
    List<BasicShape> getBasicShapes();

    /**
     * Get the list of all complex shapes in the panel.
     *
     * @return the list of all complex shapes in the panel.
     */
    List<ClosedArea> getClosedAreas();

    /**
     * This default method is used to check if the dimension of panel are valid.
     *
     * @param width  to be checked
     * @param height to be checked
     */
    default boolean checkCorrectPanelDimension(int width, int height) {
        if(width > 0 && height > 0) {
            return true;
        }
        else
            throw new IllegalArgumentException("Incorrect dimensions for this panel!");
    }

}
