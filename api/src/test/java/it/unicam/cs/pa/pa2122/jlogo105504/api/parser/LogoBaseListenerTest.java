package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.instructions.ReadInstructions;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception.NoGeneratedPolygonException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Francesco Chiocchi
 */
public class LogoBaseListenerTest {

    private Panel panel = new SimplePanel(500, 400);

    private String instruction1 = "FORWARD 90 \n" +
            "LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n FORWARD 90\n LEFT 90\n";



    @Test
    void checkIfWasGeneratedAPolygon() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        readInstructions1.parse(instruction1);
        assertTrue(!panel.getBasicShapes().isEmpty());
        for(Object p: panel.getBasicShapes())
            if(p.getClass().equals(new Polygon(null).getClass())) {
                assertTrue(!p.equals(null));
                //se non raggiunge la fine, quindi se il metodo non genera un'eccezione,
                // significa che ha trovato un oggetto poligono, quindi esce dal metodo con return;
                //System.out.println(p.getClass() + "\n" + p);
                return;
            }
        throw new NoGeneratedPolygonException();
    }

}
