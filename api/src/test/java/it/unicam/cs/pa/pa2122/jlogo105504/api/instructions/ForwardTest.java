package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Point;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class is used to test the implementation of FORWARD's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class ForwardTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testForwardInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = """
                LEFT 90\s
                FORWARD 50\s
                FORWARD 100""";
        readInstructions1.parse(instruction1);
        assertEquals(panel.getCursor().getCurrentPosition(), new Point(250, 350));
    }

    @Test
    void testIfCursorStopToBoard() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        String instruction2 = "FORWARD 4000 \n" +
                "FORWARD 50";
        readInstructions2.parse(instruction2);
        assertEquals(panel.getCursor().getCurrentPosition(), new Point(500, 200));
        ReadInstructions readInstructions3 = new ReadInstructions(panel);
        String instruction3 = """
                RIGHT 180\s
                FORWARD 4000
                FORWARD 50""";
        readInstructions3.parse(instruction3);
        assertEquals(panel.getCursor().getCurrentPosition(), new Point(0, 200));
    }
}
