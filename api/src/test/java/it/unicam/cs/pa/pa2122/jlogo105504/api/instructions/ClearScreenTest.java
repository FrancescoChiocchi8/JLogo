package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to check the instruction CLEARSCREEN.
 *
 * @author Francesco Chiocchi
 */
public class ClearScreenTest {

    private Panel panel = new SimplePanel(500, 400);
    private Line line = new Line(new Point(40,4), new Point(3,5), new RGBColor(3, 5, 6), 4);

    private String instruction = "FORWARD 40 \n" +
            "CLEARSCREEN";

    @Test
    void testClearScreenInstruction() throws IOException {
        panel.getShapes().add(line);
        assertTrue(!panel.getShapes().isEmpty());
        ReadInstructions readFile = new ReadInstructions(panel);
        readFile.parse(instruction);
        assertTrue(panel.getShapes().isEmpty());
    }
}
