package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface is used to represent a generic panel.
 * @author Francesco Chiocchi
 */
public interface Panel {

    /**
     * This method is used to get the current base of this panel.
     * @return the value of base for this panel
     */
    int getWidth();

    /**
     * This method is used to get the current height of this panel.
     * @return the value of height for this panel
     */
    int getHeight();

    /**
     * Set the width for the corresponding panel.
     * @param width for the corresponding panel
     */
    void setWidth(int width);

    /**
     * Set the height for the corresponding panel.
     * @param height for the corresponding panel
     */
    void setHeight(int height);

    /**
     * This default method is used to check if the dimension of panel are valid.
     *
     * @param width to be checked
     * @param height to be checked
     * @return true if the dimension of the panel are valid, false otherwise
     */
    default boolean checkCorrectPanelDimension(int width, int height) {
        if(width > 0 && height > 0)
            return true;
        else
            throw new IllegalArgumentException("Incorrect dimensions for this panel!");
    }

}
