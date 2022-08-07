package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class is an implementation of the interface {@link Position}, and represents a point in
 * a Panel.
 * @author Francesco Chiocchi
 */
public class Point implements Position{

    private double x;
    private double y;
    private final Panel panel;

    /**
     * Create a simple Point, that it is represents by the x-coordinates, y-coordinates
     * and the panel which contains it.
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param panel the panel which contains it.
     */
    public Point(double x, double y, Panel panel){
        this.x = x;
        this.y = y;
        checkCorrectPointDimension(x, y, panel);
        this.panel = panel;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Get the panel where a point exists.
     * @return the panel where point exists
     */
    public Panel getPanel() {
        return panel;
    }

    /**
     * This default method is used to check the correct point creator.
     * If the x or y-coordinates are greater than the dimension of the panel, the x or y-coordinate
     * of the point will be set to the dimension of the panel.
     * if the x or y-coordinates are less than 0, the x or y-coordinates of the point will
     * be set to 0.0.
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param panel the panel where the point is present
     */
    private void checkCorrectPointDimension(double x, double y, Panel panel){
        if(x < 0)
            this.x = 0.0;
        if(y < 0)
            this.y = 0.0;
        if(x > panel.getWidth())
            this. x = panel.getWidth();
        if(y > panel.getHeight())
            this.y = panel.getHeight();
    }
}
