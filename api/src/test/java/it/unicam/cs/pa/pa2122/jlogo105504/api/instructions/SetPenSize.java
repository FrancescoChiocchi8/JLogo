package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class is used to test the implementation of SETPENSIZE's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetPenSize {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testSetPenSizeInstruction() throws IOException {
        assertEquals(1, panel.getCursor().getSizeLine());
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = """
                SETPENSIZE 4
                FORWARD 50
                SETPENSIZE 10
                FORWARD 50""";
        readInstructions1.parse(instruction1);
        assertEquals(10, panel.getCursor().getSizeLine());
    }
}
