package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is an implementation of the interface {@link Panel} and represent a simple panel.
 * The responsibility of this class is to hold all information contained in the panel, such as
 * the width, height, current position of the cursor, color of the screen and list of
 * basic shapes/aree.
 *
 * @author Francesco Chiocchi
 */
public class SimplePanel implements Panel {

    private final int width;
    private final int height;
    private Color screenColor;
    private final Position home;
    private final Cursor cursor;
    private final List<BasicShape> basicShapes;
    private final List<ClosedArea> closedAreas;

    /**
     * Create a SimplePanel with the specific dimensions, initialize the color of
     * the screen to white (255, 255, 255), initialize the list of the lines in the panel
     * and put the cursor in the home.
     *
     * @param width  the base of the panel
     * @param height the height of the panel
     */
    public SimplePanel(int width, int height){
        checkCorrectPanelDimension(width, height);
        this.width = width;
        this.height = height;
        cursor = new SimpleCursor();
        home = new Point(width / 2.0, height / 2.0);
        cursor.setCurrentPosition(home);
        this.screenColor = new RGBColor(255,255,255);
        basicShapes = new ArrayList<>();
        closedAreas = new ArrayList<>();
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public Cursor getCursor() {
        return cursor;
    }

    @Override
    public Color getScreenColor() {
        return screenColor;
    }

    @Override
    public void setScreenColor(Color screenColor) {
        this.screenColor = screenColor;
    }

    @Override
    public Position getHome() {
        return home;
    }

    @Override
    public List<BasicShape> getBasicShapes() {
        return basicShapes;
    }

    @Override
    public List<ClosedArea> getClosedAreas() {
        return closedAreas;
    }

    @Override
    public String toString() {
        return "SIZE <" +
                width + "> <" +
                height + "> <" +
                screenColor.red() + "> <" +
                screenColor.green() + "> <" +
                screenColor.blue() + ">\n" +
                "<shape>\n" +
                String.join("\n", getBasicShapes().toString()) +
                String.join("\n", getClosedAreas().toString()) +
                "\n<shape>"
                ;
    }

}