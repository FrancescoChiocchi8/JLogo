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

    Panel panel = new SimplePanel(400, 600);
    Panel panel2 = new SimplePanel(300, 500);

    @Test
    void checkIfPointAreEquals(){
        Position p = new Point(300.5, 300.8, panel);
        assertTrue(p.equals(new Point(300.5,300.8,panel)));
        assertFalse(p.equals(new Point(300.5,300.8,panel2)));
    }

    @Test
    void checkAllPossiblePositionPointInThePanel(){
        Position p = new Point(-5,60, panel);
        assertTrue(p.getX() == 0);
        assertTrue(p.getY() == 60);
        assertTrue(((Point) p).getPanel() == panel);
        assertFalse(((Point) p).getPanel() == panel2);
        Position p2 = new Point(500, -408, panel);
        assertTrue(p2.getX() == 400);
        assertTrue (p2.getY() == 0.0);
        Position p3 = new Point(-400, -700, panel);
        assertTrue(p3.getX() == 0.0);
        assertTrue (p3.getY() == 0.0);
        Position p4 = new Point(500, 800, panel);
        assertTrue(p4.getX() == 400);
        assertTrue (p4.getY() == 600);
    }

    @Test
    void check(){
        Panel panel = new SimplePanel(300, 400);
        assertTrue(panel.getScreenColor().equals(new RGBColor(255,255,255)));
    }
}