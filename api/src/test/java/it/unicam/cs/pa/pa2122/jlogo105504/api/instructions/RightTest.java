package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of RIGHT's Logo instruction.
 * @author Francesco Chiocchi
 */
public class RightTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "RIGHT 90 \n" +
            "FORWARD 50 \n" +
            "FORWARD 100";

    private String instruction2 = "RIGHT 90 \n" +
            "LEFT 180";

    private String instruction3 = "RIGHT 400\n";

    @Test
    void testRightInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(panel.getCursor().getDirection() == -90);
    }

    @Test
    void testParticularCase1() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        readInstructions2.parse(instruction2);
        assertTrue(panel.getCursor().getDirection() == 90);
    }

    @Test
    void testParticularCase2() throws IOException {
        ReadInstructions readInstructions3 = new ReadInstructions(panel);
        readInstructions3.parse(instruction3);
        assertTrue(panel.getCursor().getDirection() == -40);
    }
}
