package it.unicam.cs.pa.pa2122.jlogo105504.api.parser;

import it.unicam.cs.pa.pa2122.jlogo105504.api.instructions.ReadInstructions;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.exception.NoGeneratedPolygonException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Francesco Chiocchi
 */
public class LogoBaseListenerTest {

    private final Panel panel = new SimplePanel(500, 400);


    @Test
    void checkIfWasGeneratedAPolygon() throws IOException {
        ReadInstructions readInstructions1 = new ReadInstructions(panel);
        String instruction1 = "FORWARD 90 \s" +
                "LEFT 90\s FORWARD 90\s LEFT 90\s FORWARD 90\s LEFT 90\s FORWARD 90\s LEFT 90";
        readInstructions1.parse(instruction1);
        assertFalse(panel.getClosedAreas().isEmpty());
        for(ClosedArea closedArea: panel.getClosedAreas())
            if(closedArea.getClass().equals(Polygon.class)) {
                assertNotEquals(null, closedArea);
                //se non raggiunge la fine, quindi se il metodo non genera un'eccezione,
                // significa che ha trovato un oggetto poligono, quindi esce dal metodo con return;
                return;
            }
        throw new NoGeneratedPolygonException();
    }

}
