package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of PENUP's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class PenUpTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testPenUpInstruction() throws IOException {
        assertTrue(panel.getCursor().getPlot());
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = """
                PENUP\s
                FORWARD 50
                PENUP\s
                """;
        readInstructions1.parse(instruction1);
        assertTrue(panel.getBasicShapes().isEmpty());
        assertFalse(panel.getCursor().getPlot());
    }
}
