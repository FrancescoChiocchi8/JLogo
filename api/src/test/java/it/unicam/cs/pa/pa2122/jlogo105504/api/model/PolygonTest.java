package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

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

    Line line1 = new Line(new Point(30,50), new Point(40,50), new RGBColor(25,9,6),2);
    Line line2 = new Line(new Point(30,50), new Point(35,70), new RGBColor(25,9,6),3);
    Line line3 = new Line(new Point(35,70), new Point(40,50), new RGBColor(25,9,6),8);
    List<Line> listLine = new ArrayList<>();

    @Test
    void isNotAPolygonTest(){
        listLine.clear();
        listLine.add(line1);
    }
}
