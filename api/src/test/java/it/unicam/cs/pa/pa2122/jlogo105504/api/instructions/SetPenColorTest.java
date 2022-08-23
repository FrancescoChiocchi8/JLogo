package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.RGBColor;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of SETPENCOLOR's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetPenColorTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "SETPENCOLOR 254 60 80 \n";

    @Test
    void testSetPenColorInstruction() throws IOException {
        assertTrue(panel.getCursor().getCurrentShapeColor().equals(new RGBColor(0,0,0)));
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(panel.getCursor().getCurrentShapeColor().equals(new RGBColor(254,60,80)));
    }
}
