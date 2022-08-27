package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.RGBColor;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class is used to test the implementation of SETSCREENCOLOR's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetScreenColorTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testSetScreenColorInstruction() throws IOException {
        assertEquals(panel.getScreenColor(), new RGBColor(255, 255, 255));
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = "SETSCREENCOLOR 40 160 200 \n" +
                "SETSCREENCOLOR 170 200 150";
        readInstructions1.parse(instruction1);
        assertEquals(panel.getScreenColor(), new RGBColor(170, 200, 150));
    }
}
