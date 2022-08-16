package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is an implementation of the interface {@link Panel} and represent a simple panel.
 * The responsibility of this class is to hold all information contained in the panel, such as
 * the width, height, current position of the cursor, color of the screen and list of linee/aree.
 *
 * @author Francesco Chiocchi
 */
public class SimplePanel implements Panel {

    private final int width;
    private final int height;
    private Color screenColor;
    private Position home;
    private final Cursor cursor;
    private List<Shape> shapes;

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
        home = setHome(width / 2, height / 2);
        this.screenColor = new RGBColor(255,255,255);
        shapes = new ArrayList<>();
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

    /**
     * This private method is used to set the home for this panel and to initialize
     * the position for the cursor.
     *
     * @param width calculated for the x-coordinate of the home
     * @param height calculated for the y-coordinate of the home
     * @return the home
     */
    private Position setHome(int width, int height) {
        home = new Point(width, height);
        cursor.setCurrentPosition(home);
        return home;
    }

    @Override
    public Position getHome() {
        return home;
    }

    @Override
    public List<Shape> getShapes() {
        return shapes;
    }

    @Override
    public String toString() {
        return "SimplePanel{" +
                "width=" + width +
                ", height=" + height +
                ", screenColor=" + screenColor.toString() +
                ", home=" + home.toString() +
                ", cursor=" + cursor.toString() +
                ", shapes=" + shapes +
                '}';
    }

}
