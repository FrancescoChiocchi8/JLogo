package it.unicam.cs.pa.pa2122.jlogo105504.api;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of the class {@link Point}.
 * @author Francesco Chiocchi
 */
public class PointTest {

    @Test
    void testIfPointAreEquals(){
        Position p = new Point(300.5, 300.8);
        assertTrue(p.equals(new Point(300.5,300.8)));
        assertFalse(!p.equals(new Point(300.5,300.8)));
    }

}
