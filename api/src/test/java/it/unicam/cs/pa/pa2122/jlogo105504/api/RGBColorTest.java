package it.unicam.cs.pa.pa2122.jlogo105504.api;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Color;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.RGBColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This class is used to test the implementation of {@link RGBColor}
 * @author Francesco Chiocchi
 */
public class RGBColorTest {

    @Test
    void checkIfAreValidInput(){
        assertDoesNotThrow(() -> new RGBColor(0,0, 0));
        assertDoesNotThrow(() -> new RGBColor(0,0, 255));
        assertDoesNotThrow(() -> new RGBColor(0,255, 255));
        assertDoesNotThrow(() -> new RGBColor(255,255, 255));
    }

    @Test
    void checkIfAreInvalidInputColor(){
        assertThrows(IllegalArgumentException.class, () -> new RGBColor(-80, 90, 32));
        assertThrows(IllegalArgumentException.class, () -> new RGBColor(400, 50, 60));
        assertThrows(IllegalArgumentException.class, () -> new RGBColor(255, -40, 32));
        assertThrows(IllegalArgumentException.class, () -> new RGBColor(255,322, 89));
        assertThrows(IllegalArgumentException.class, () -> new RGBColor(255, 50, -1));
        assertThrows(IllegalArgumentException.class, () -> new RGBColor(255,60, 256));
    }
}
