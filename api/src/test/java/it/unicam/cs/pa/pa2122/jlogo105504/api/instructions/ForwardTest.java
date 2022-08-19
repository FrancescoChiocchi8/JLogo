package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Point;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of FORWARD's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class ForwardTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "LEFT 90 \n" +
            "FORWARD 50 \n" +
            "FORWARD 100";

    private String instruction2 = "FORWARD 4000 \n" +
            "FORWARD 50";

    private String instruction3 = "RIGHT 180\n" +
            "FORWARD 4000 \n" +
            "FORWARD 50";

    @Test
    void testForwardInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(panel.getCursor().getCurrentPosition().equals(new Point(250,350)));
    }

    @Test
    void testIfCursorStopToBoard() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        readInstructions2.parse(instruction2);
        assertTrue(panel.getCursor().getCurrentPosition().equals(new Point(500,200)));
        ReadInstructions readInstructions3 = new ReadInstructions(panel);
        readInstructions3.parse(instruction3);
        assertTrue(panel.getCursor().getCurrentPosition().equals(new Point(0,200)));
    }
}
