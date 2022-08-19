package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of BACKWARD's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class BackwardTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "LEFT 90 \n" +
            "BACKWARD 50 \n" +
            "BACKWARD 100";

    private String instruction2 = "BACKWARD 4000 \n" +
            "BACKWARD 50";

    private String instruction3 = "RIGHT 180\n" +
            "BACKWARD 4000 \n" +
            "BACKWARD 50";

    @Test
    void testBackwardInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(panel.getCursor().getCurrentPosition().equals(new Point(250,50)));
    }

    @Test
    void testIfCursorStopToBoard() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        readInstructions2.parse(instruction2);
        assertTrue(panel.getCursor().getCurrentPosition().equals(new Point(0,200)));
        ReadInstructions readInstructions3 = new ReadInstructions(panel);
        readInstructions3.parse(instruction3);
        assertTrue(panel.getCursor().getCurrentPosition().equals(new Point(500,200)));
    }
}
