package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This class is used to test the implementation of the class {@link Polygon}.
 *
 * @author Francesco Chiocchi
 */
public class PolygonTest {

    Shape line1 = new Line(new Point(30,50), new Point(40,50), new RGBColor(25,9,6),2);
    Shape line2 = new Line(new Point(30,50), new Point(35,70), new RGBColor(25,9,6),3);
    Shape line3 = new Line(new Point(35,70), new Point(40,50), new RGBColor(25,9,6),8);
    List<Shape> listShapes = new ArrayList<>();

    @Test
    void checkElementsList(){
        listShapes.add(line1); listShapes.add(line2); listShapes.add(line3);
        assertDoesNotThrow(()-> new Polygon(listShapes, new RGBColor(255,255,255)));
        listShapes.clear();
        assertThrows(IllegalArgumentException.class, () -> new Polygon(listShapes, new RGBColor(2,5,9)));
    }

    @Test
    void testUnsupportedOperetionException(){
        listShapes.add(line1); listShapes.add(line2); listShapes.add(line3);
        Shape triangle = new Polygon(listShapes,new RGBColor(56,85,59));
        assertThrows(UnsupportedOperationException.class, () -> triangle.getStart());
        assertThrows(UnsupportedOperationException.class, () -> triangle.getEnd());
        assertThrows(UnsupportedOperationException.class, () -> triangle.getSize());
        assertDoesNotThrow( () -> triangle.getListOfShape());
    }
}
