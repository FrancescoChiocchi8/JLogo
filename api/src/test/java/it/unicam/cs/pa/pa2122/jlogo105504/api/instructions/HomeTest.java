package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Point;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of HOME's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class HomeTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "LEFT 90 \n" +
            "FORWARD 50 \n" +
            "FORWARD 100\n" +
            "PENUP\n" +
            "HOME";

    @Test
    void testHomeInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(panel.getCursor().getCurrentPosition().equals(panel.getHome()));
        assertTrue(!panel.getCursor().getPlot());
    }
}
