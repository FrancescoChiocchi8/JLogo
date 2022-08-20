package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This interface represents a RGBColor. Each color is composed by 3-byte(0-255), that represent the RGBColor.
 *
 * @author Francesco Chiocchi
 */
public interface Color {

    /**
     * Get the red color.
     *
     * @return the red color.
     */
    int red();

    /**
     * Get the green color.
     *
     * @return the green color.
     */
    int green();

    /**
     * Get the blue color.
     *
     * @return the blue color.
     */
    int blue();

    /**
     * This default method check if the all param of the color(red, green, blue) are a byte.
     *
     * @param red to be checked
     * @param green to be checked
     * @param blue to be checked
     * @return true if the all param of the color are a byte, Exception be thrown otherwise.
     */
    default boolean checkIfIsAColor(int red, int green, int blue) {
        if(red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255)
            return true;
        else
            throw new IllegalArgumentException("Error, the color must be as byte");
    }
}
