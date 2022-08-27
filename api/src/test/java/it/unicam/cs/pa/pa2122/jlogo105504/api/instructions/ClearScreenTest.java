package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to check the instruction CLEARSCREEN.
 *
 * @author Francesco Chiocchi
 */
public class ClearScreenTest {

    private final Panel panel = new SimplePanel(500, 400);
    private final Line line = new Line(new Point(40,4), new Point(3,5), new RGBColor(3, 5, 6), 4);

    @Test
    void testClearScreenInstruction() throws IOException {
        panel.getBasicShapes().add(line);
        assertFalse(panel.getBasicShapes().isEmpty());
        ReadInstructions readInstructions = new ReadInstructions(panel);
        String instruction = "FORWARD 40 \n" +
                "CLEARSCREEN";
        readInstructions.parse(instruction);
        assertTrue(panel.getBasicShapes().isEmpty());
    }
}
