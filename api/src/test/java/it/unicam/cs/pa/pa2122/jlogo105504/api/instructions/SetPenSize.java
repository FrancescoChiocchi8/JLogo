package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.RGBColor;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of SETPENSIZE's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetPenSize {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "SETPENSIZE 4\n" +
            "FORWARD 50\n" +
            "SETPENSIZE 10\n" +
            "FORWARD 50";

    @Test
    void testSetPenSizeInstruction() throws IOException {
        assertTrue(panel.getCursor().getSizeLine() == 1);
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(panel.getCursor().getSizeLine() == 10);
    }
}
