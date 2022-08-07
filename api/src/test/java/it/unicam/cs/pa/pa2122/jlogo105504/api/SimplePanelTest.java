package it.unicam.cs.pa.pa2122.jlogo105504.api;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
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

}
