package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the class {@link SimplePanel}.
 * @author Francesco Chiocchi
 */
public class SimplePanelTest {

    @Test
    void checkInvalidDimensionsPanel(){
        assertThrows(IllegalArgumentException.class, () -> new SimplePanel(400, 0));
        assertThrows(IllegalArgumentException.class, () -> new SimplePanel(-30, 500));
        assertThrows(IllegalArgumentException.class, () -> new SimplePanel(-40, -50));
    }

    @Test
    void checkValidDimensionsPanel(){
        Panel panel = new SimplePanel(400, 600);
    }

    @Test
    void checkIfTwoPanelsAreDifferent(){
        Panel p1 = new SimplePanel(400,600);
        Panel p2 = new SimplePanel(400,600);
        assertFalse(p1.equals(p2));
    }

    @Test
    void checkInitializeColorScreen(){
        Panel p = new SimplePanel(400,600);
        assertThrows(IllegalArgumentException.class, () -> p.setScreenColor(new RGBColor(-5,6,89)));
        assertTrue(p.getScreenColor().equals(new RGBColor(255,255,255)));
        p.setScreenColor(new RGBColor(60,48,89));
        assertFalse(p.getScreenColor().equals(new RGBColor(255,255,255)));
    }

    @Test
    void checkHomePanel(){
        Panel panel = new SimplePanel(400,800);
        assertTrue(panel.getHome().equals(new Point(200,400)));
        assertTrue(panel.getHome().getX() == 200.0);
        assertTrue(panel.getHome().getY() == 400.0);
        Panel panel2 = new SimplePanel(700,250);
        assertTrue(panel2.getHome().equals(new Point(350,125)));
        assertTrue(panel2.getHome().getX() == 350.0);
        assertTrue(panel2.getHome().getY() == 125.0);
    }
}
