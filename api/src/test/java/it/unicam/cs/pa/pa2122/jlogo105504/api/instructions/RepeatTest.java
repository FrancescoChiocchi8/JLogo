package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of REPEAT's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class RepeatTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testRepeatInstruction1() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        assertTrue(panel.getClosedAreas().isEmpty());
        String instruction1 = """
                PENUP\s
                FORWARD 50
                 PENDOWN
                 REPEAT 4
                FORWARD 30
                LEFT 90
                EXIT""";
        readInstructions1.parse(instruction1);
        assertFalse(panel.getClosedAreas().isEmpty());
    }

}
