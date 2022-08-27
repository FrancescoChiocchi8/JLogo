package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class is used to test the implementation of BACKWARD's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class BackwardTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testBackwardInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = """
                LEFT 90\s
                BACKWARD 50\s
                BACKWARD 100""";
        readInstructions1.parse(instruction1);
        assertEquals(panel.getCursor().getCurrentPosition(), new Point(250, 50));
    }

    @Test
    void testIfCursorStopToBoard() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        String instruction2 = "BACKWARD 4000 \n" +
                "BACKWARD 50";
        readInstructions2.parse(instruction2);
        assertEquals(panel.getCursor().getCurrentPosition(), new Point(0, 200));
        ReadInstructions readInstructions3 = new ReadInstructions(panel);
        String instruction3 = """
                RIGHT 180
                BACKWARD 4000\s
                BACKWARD 50""";
        readInstructions3.parse(instruction3);
        assertEquals(panel.getCursor().getCurrentPosition(), new Point(500, 200));
    }
}
