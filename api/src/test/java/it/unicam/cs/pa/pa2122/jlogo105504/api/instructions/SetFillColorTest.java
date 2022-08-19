package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.RGBColor;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of SETFILLCOLOR's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetFillColorTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "FORWARD 40 \n" +
            "LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n" +
            "SETFILLCOLOR 200 150 78";

    @Test
    void testSetFillColorInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(!panel.getShapes().isEmpty());
    }
}
