package it.unicam.cs.pa.pa2122.jlogo105504.api.instructions;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception.NoGeneratedPolygonException;
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

    private String instruction1 = "FORWARD 90 \n" +
            "LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n" +
            "SETFILLCOLOR 200 150 78";

    private String instruction2 = "SETFILLCOLOR 200 150 78 \n" + "FORWARD 90 \n" +
            "LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n" ;

    @Test
    void testSetFillColorInstruction1() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(!panel.getClosedAreas().isEmpty());
        for(ClosedArea closedArea: panel.getClosedAreas())
            if(closedArea.getClass().equals(new Polygon(null, panel.getCursor().getCurrentFillColor()).getClass())){
                //se non raggiunge la fine, quindi se il metodo non genera un'eccezione,
                // significa che ha trovato un oggetto poligono, quindi esce dal metodo con return;
                //System.out.println(p.getClass() + "\n" + p);
                assertTrue(closedArea.getColor().equals(new RGBColor(255,255,255)));
                return;
            }
        throw new NoGeneratedPolygonException();
    }

    @Test
    void testSetFillColorInstruction2() throws IOException {
        ReadInstructions readInstructions2 = new ReadInstructions(panel);
        readInstructions2.parse(instruction2);
        assertTrue(!panel.getClosedAreas().isEmpty());
        for(ClosedArea closedArea: panel.getClosedAreas())
            if(closedArea.getClass().equals(new Polygon(null, panel.getCursor().getCurrentFillColor()).getClass())){
                assertTrue(closedArea.getColor().equals(new RGBColor(200,150,78)));
                return;
            }
        throw new NoGeneratedPolygonException();
    }
}
