package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception.NoGeneratedPolygonException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class is used to test the implementation of SETFILLCOLOR's Logo instruction.
 *
 * @author Francesco Chiocchi
 */
public class SetFillColorTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "FORWARD 90 \n" +
            "LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n" +
            "SETFILLCOLOR 200 150 78";

    @Test
    void testSetFillColorInstruction() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(!panel.getShapes().isEmpty());
        for(Object p: panel.getShapes())
            if(p.getClass().equals(new Polygon(null).getClass())){
                //se non raggiunge la fine, quindi se il metodo non genera un'eccezione,
                // significa che ha trovato un oggetto poligono, quindi esce dal metodo con return;
                //System.out.println(p.getClass() + "\n" + p);
                assertTrue(((Polygon) p).getColor().equals(new RGBColor(200,150,78)));
                return;
            }
        throw new NoGeneratedPolygonException();
    }
}
