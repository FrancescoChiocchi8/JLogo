package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class is used to test the implementation of LEFT's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class LeftTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testLeftInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = """
                LEFT 90\s
                FORWARD 50\s
                FORWARD 100""";
        readInstructions1.parse(instruction1);
        assertEquals(90, panel.getCursor().getDirection());
    }

    @Test
    void testParticularCase1() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        String instruction2 = "LEFT 90 \n" +
                "RIGHT 180";
        readInstructions2.parse(instruction2);
        assertEquals(-90, panel.getCursor().getDirection());
    }

    @Test
    void testParticularCase2() throws IOException {
        ReadInstructions readInstructions3 = new ReadInstructions(panel);
        String instruction3 = "LEFT 400\n";
        readInstructions3.parse(instruction3);
        assertEquals(40, panel.getCursor().getDirection());
    }
}
