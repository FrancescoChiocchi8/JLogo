package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import javafx.scene.control.TextInputDialog;

import java.util.Optional;

/**
 * This class is used to change the dimensions of the panel.
 *
 * @author Francesco Chiocchi
 */
public class ChangePanelSizeController {

    private int width;
    private int height;

    /**
     * This method is used to ask the user the new width default value.
     *
     * @return the new width's default value of a panel.
     */
    public int askPanelWidth(){
        TextInputDialog dialog = new TextInputDialog("insert panel's width");
        dialog.setTitle("Width Panel: ");
        dialog.setHeaderText("Please, insert the width of the panel");
        dialog.setContentText("Width Panel: ");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(width -> this.width = Integer.parseInt(width));
        System.out.println("\033[1;92m" + "The new width's size is: " + this.width + "\u001B[0m");
        return width;
    }

    /**
     * This method is used to ask the user the new height's default value.
     *
     * @return the new height's default value of a panel.
     */
    public int askPanelHeight(){
        TextInputDialog dialog = new TextInputDialog("insert panel's height");
        dialog.setTitle("Height Panel: ");
        dialog.setHeaderText("Please, insert the height of the panel");
        dialog.setContentText("Height Panel: ");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(height -> this.height = Integer.parseInt(height));
        System.out.println("\033[1;92m" + "The new height's size is: " + this.height + "\u001B[0m");
        return height;
    }
}
