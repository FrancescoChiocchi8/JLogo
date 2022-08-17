package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface represents a generic cursor.
 *
 * @author Francesco Chiocchi
 */
public interface Cursor {

    /**
     * Get the current position of the cursor.
     *
     * @return the current position of the cursor.
     */
    Position getCurrentPosition();

    /**
     * Update the position of the cursor.
     *
     * @param position new position of the cursor
     */
    void setCurrentPosition(Position position);

    /**
     * Get the boolean value true if the cursor is drawing, false otherwise.
     *
     * @return true if the cursor is drawing, false otherwise.
     */
    boolean getPlot();

    /**
     * Update of param plot to true if the cursor is drawing, false otherwise.
     *
     * @param plot true if the cursor is drawing, false otherwise
     */
    void setPlot(boolean plot);

    /**
     * Get the value of the cursor's direction.
     *
     * @return the value of the cursor's direction.
     */
    int getDirection();

    /**
     * Update the direction of the cursor.
     *
     * @param direction the value to be added to the current direction of the cursor
     */
    void setDirection(int direction);

    /**
     * Get the current size of the possible line generating by the cursor.
     *
     * @return the size of the possible line generating by the cursor.
     */
    int getSizeLine();

    /**
     * Update the size of a possible line generating by the cursor.
     *
     * @param sizeLine the new value of a possible line generating by the cursor
     */
    void setSizeLine(int sizeLine);

    /**
     * Get of the current color for generating line by the cursor.
     *
     * @return the current color for generating line by the cursor.
     */
    Color getCurrentLineColor();

    /**
     * Update the current color of the line generating by the cursor.
     *
     * @param color of the line generating by the cursor
     */
    void setCurrentLineColor(Color color);

    /**
     * This default method is used to check the size of a possible line generating by the cursor.
     *
     * @param sizeLine to be checked
     * @return true if the size line is greater than 0, false otherwise.
     */
    default boolean checkSetSizeLine(int sizeLine){
        if(sizeLine > 0)
            return true;
        else throw new IllegalArgumentException("The size of the line is negative");
    }
}
