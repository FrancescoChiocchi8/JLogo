package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class provides an implementation for the interface {@link Color}.
 *
 * @author Francesco Chiocchi
 */
public class RGBColor implements Color{

    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue) {
        checkIfIsAByte(red, green, blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public int getRed() {
        return red;
    }

    @Override
    public int getGreen() {
        return green;
    }

    @Override
    public int getBlue() {
        return blue;
    }

    /**
     * A color is equals to other if and only if it has all param identical.
     *
     * @param o the other object to be compared
     * @return true if the color is equals to other, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RGBColor rgbColor = (RGBColor) o;

        if (red != rgbColor.red) return false;
        if (green != rgbColor.green) return false;
        return blue == rgbColor.blue;
    }

    @Override
    public int hashCode() {
        int result = red;
        result = 31 * result + green;
        result = 31 * result + blue;
        return result;
    }
}
