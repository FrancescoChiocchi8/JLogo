package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class is an implementation of the interface {@link Position}, and represents a point in
 * a panel.
 *
 * @author Francesco Chiocchi
 */
public class Point implements Position{

    private double x;
    private double y;

    /**
     * Cre
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        checkCorrectPointDimension(x, y);
    }

    /**
     * If the parameters x and y are greater than 0.0 then they are set up to the input value,
     * otherwise they are set up to the value 0.0.
     *
     * @param x coordinate
     * @param y coordinate
     */
    private void checkCorrectPointDimension(double x, double y) {
        if(x < 0)
            this.x = 0.0;
        else
            this.x = x;
        if(y < 0)
            this.y = 0.0;
        else
            this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    /**
     * Two point are equals if and only if the x,y-coordinates are equals.
     *
     * @param o the other object to compare
     * @return true if the two point are equals, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;
        return Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
