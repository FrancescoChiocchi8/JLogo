package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the implementation of the class {@link Point}.
 * @author Francesco Chiocchi
 */
public class PointTest {

    @Test
    void testIfPointAreEquals(){
        Position p = new Point(300.5, 300.8);
        assertEquals(p, new Point(300.5, 300.8));
        assertEquals(p, new Point(300.5, 300.8));
    }

}
