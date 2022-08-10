package it.unicam.cs.pa.pa2122.jlogo105504.api;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the implementation of the class {@link LineClass}.
 *
 * @author Francesco Chiocchi
 */
public class LineClassTest {

    Panel panel = new SimplePanel(400,500);
    Line line = new LineClass(new Point(5.5,45), new Point(7.0,89), new RGBColor(50,50,50), 6);

    @Test
     void testSizeLine(){
        assertThrows(IllegalArgumentException.class, () -> new LineClass(new Point(5,5.6),
                new Point(60,5), new RGBColor(8,9,65), -4));
        assertDoesNotThrow(()-> new LineClass(new Point(5,5.6), new Point(60,5),
                new RGBColor(8,9,65), 8));
        panel.getLines().add(line);
        assertTrue(panel.getLines().contains(line));
    }
}
