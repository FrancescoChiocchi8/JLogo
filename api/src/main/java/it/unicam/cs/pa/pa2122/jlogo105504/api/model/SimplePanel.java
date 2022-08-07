package it.unicam.cs.pa.pa2122.jlogo105504.api.model;

/**
 * This class is an implementation of the interface {@link Panel} and represent
 * a simple panel.
 * @author Francesco Chiocchi
 */
public class SimplePanel implements Panel{

    private int width;
    private int height;

    /**
     * Create a SimplePanel with the specific dimensions.
     * @param width the base of the panel
     * @param height the height of the panel
     */
    public SimplePanel(int width, int height){
        checkCorrectPanelDimension(width, height);
        this.width = width;
        this.height = height;
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
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

}
