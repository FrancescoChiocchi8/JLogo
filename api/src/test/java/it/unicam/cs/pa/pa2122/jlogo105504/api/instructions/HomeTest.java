package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the implementation of HOME's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class HomeTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testHomeInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = """
                LEFT 90\s
                FORWARD 50\s
                FORWARD 100
                PENUP
                HOME""";
        readInstructions1.parse(instruction1);
        assertEquals(panel.getCursor().getCurrentPosition(), panel.getHome());
        assertFalse(panel.getCursor().getPlot());
    }
}
