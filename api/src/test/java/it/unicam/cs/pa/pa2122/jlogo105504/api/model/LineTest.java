package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the implementation of the class {@link Line}.
 *
 * @author Francesco Chiocchi
 */
public class LineTest {

    Panel panel = new SimplePanel(400,500);
    BasicShape line = new Line(new Point(5.5,45), new Point(7.0,89), new RGBColor(50,50,50), 6);

    @Test
    void testGetStartAndEndPosition(){
        assertEquals(line.getStart(), new Point(5.5, 45));
        assertNotEquals(line.getStart(), new Point(89, 45));
        assertNotEquals(line.getStart(), new Point(5.5, 48));
        assertEquals(line.getEnd(), new Point(7.0, 89));
    }

    @Test
    void testColorLine(){
        assertEquals(line.getColor(), new RGBColor(50, 50, 50));
    }

    @Test
     void testSizeLine(){
        assertThrows(IllegalArgumentException.class, () -> new Line(new Point(5,5.6),
                new Point(60,5), new RGBColor(8,9,65), -4));
        assertDoesNotThrow(()-> new Line(new Point(5,5.6), new Point(60,5),
                new RGBColor(8,9,65), 8));
        panel.getBasicShapes().add(line);
        assertTrue(panel.getBasicShapes().contains(line));
    }

    @Test
    void testLine(){
        BasicShape line =  new Line(new Point(-5,5.6),
                new Point(60,5), new RGBColor(8,9,65), 4);
        System.out.println(line.getStart().getX());
        assertEquals(line.getStart(), new Point(0.0, 5.6));
    }

}
