package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Point;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimpleCursor;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the implementation of the class {@link SimpleCursor}.
 *
 * @author Francesco Chiocchi
 */
public class CursorTest {

    Panel panel = new SimplePanel(700, 250);

    @Test
    void checkIfCursorIsInTheHome(){
        assertTrue(panel.getCursor().getCurrentPosition().equals(new Point(350,125)));
    }

    @Test
    void checkDirectionOfTheCursor(){
        assertDoesNotThrow(() -> panel.getCursor().setDirection(70));
        assertDoesNotThrow(() -> panel.getCursor().setDirection(0));
        assertDoesNotThrow(() -> panel.getCursor().setDirection(360));
        assertDoesNotThrow(() -> panel.getCursor().setDirection(500));
    }

}
