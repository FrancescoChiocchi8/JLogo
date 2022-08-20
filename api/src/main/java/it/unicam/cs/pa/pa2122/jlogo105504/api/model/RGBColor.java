package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class provides an implementation for the interface {@link Color}.
 *
 * @author Francesco Chiocchi
 */
public record RGBColor(int red, int green, int blue) implements Color {

    public RGBColor {
        checkIfIsAColor(red, green, blue);
    }

    /**
     * A color is equals to other if and only if it has all identical param.
     *
     * @param o the other object to be compared
     * @return true if the color is equals to other, false otherwise.
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
    public String toString() {
        return "RGBColor{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
