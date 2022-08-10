package it.unicam.cs.pa.pa2122.jlogo105504.api;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Francesco Chiocchi
 */
public class CursorTest {

    @Test
    void c(){
        Panel panel = new SimplePanel(400, 400);
        assertTrue(panel.equals(panel));
    }

}
