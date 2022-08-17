package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the implementation of the class {@link Line}.
 *
 * @author Francesco Chiocchi
 */
public class LineTest {

    Panel panel = new SimplePanel(400,500);
    Shape line = new Line(new Point(5.5,45), new Point(7.0,89), new RGBColor(50,50,50), 6);

    @Test
    void testGetStartAndEndPosition(){
        assertTrue(line.getStart().equals(new Point(5.5, 45)));
        assertFalse(line.getStart().equals(new Point(89, 45)));
        assertFalse(line.getStart().equals(new Point(5.5, 48)));
        assertTrue(line.getEnd().equals(new Point(7.0, 89)));
    }

    @Test
    void testColorLine(){
        assertTrue(line.getColor().equals(new RGBColor(50, 50, 50)));
    }

    @Test
     void testSizeLine(){
        assertThrows(IllegalArgumentException.class, () -> new Line(new Point(5,5.6),
                new Point(60,5), new RGBColor(8,9,65), -4));
        assertDoesNotThrow(()-> new Line(new Point(5,5.6), new Point(60,5),
                new RGBColor(8,9,65), 8));
        panel.getShapes().add(line);
        assertTrue(panel.getShapes().contains(line));
    }

    @Test
    void testLine(){
        Shape line =  new Line(new Point(-5,5.6),
                new Point(60,5), new RGBColor(8,9,65), 4);
        System.out.println(line.getStart().getX());
        assertTrue(line.getStart().equals(new Point(0.0,5.6)));
    }

    @Test
    void testException(){
        assertThrows(UnsupportedOperationException.class, () -> line.getListOfShape());
    }


}
