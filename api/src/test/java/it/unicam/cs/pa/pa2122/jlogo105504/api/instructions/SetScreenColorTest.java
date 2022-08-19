package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.RGBColor;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of SETSCREENCOLOR's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetScreenColorTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "SETSCREENCOLOR 40 160 200 \n" +
            "SETSCREENCOLOR 170 200 150";

    @Test
    void testSetScreenColorInstruction() throws IOException {
        assertTrue(panel.getScreenColor().equals(new RGBColor(255,255,255)));
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(panel.getScreenColor().equals(new RGBColor(170,200,150)));
    }
}
