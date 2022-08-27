package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception.NoGeneratedPolygonException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test the implementation of SETFILLCOLOR's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetFillColorTest {

    private final Panel panel = new SimplePanel(500, 400);

    @Test
    void testSetFillColorInstruction1() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = "FORWARD 90 \s" +
                "LEFT 90\s FORWARD 90\s LEFT 90\s FORWARD 90\s LEFT 90\s FORWARD 90\s LEFT 90\s" +
                "SETFILLCOLOR 200 150 78";
        readInstructions1.parse(instruction1);
        assertFalse(panel.getClosedAreas().isEmpty());
        for(ClosedArea closedArea: panel.getClosedAreas())
            if(closedArea.getClass().equals(Polygon.class)){
                //se non raggiunge la fine, quindi se il metodo non genera un'eccezione,
                // significa che ha trovato un oggetto poligono, quindi esce dal metodo con return;
                assertEquals(closedArea.getColor(), new RGBColor(255, 255, 255));
                return;
            }
        throw new NoGeneratedPolygonException();
    }

    @Test
    void testSetFillColorInstruction2() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        String instruction2 = "SETFILLCOLOR 200 150 78 \s" + "FORWARD 90 \s" +
                "LEFT 90\s FORWARD 90\s LEFT 90\s FORWARD 90\s LEFT 90\s FORWARD 90\s LEFT 90";
        readInstructions2.parse(instruction2);
        assertFalse(panel.getClosedAreas().isEmpty());
        for(ClosedArea closedArea: panel.getClosedAreas())
            if(closedArea.getClass().equals(Polygon.class)){
                assertEquals(closedArea.getColor(), new RGBColor(200, 150, 78));
                return;
            }
        throw new NoGeneratedPolygonException();
    }
}
