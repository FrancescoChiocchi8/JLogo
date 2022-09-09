package it.unicam.cs.pa.pa2122.jlogo105504.gui.utils;

import javafx.scene.control.TextInputDialog;

import java.io.File;

/**
 * This class is used to ask the user where it wants save the output logo file.
 *
 * @author Francesco Chiocchi
 */
public class AskOutputFile {

    /**
     * This public method is used to ask the name of the output file to the user.
     *
     * @return the output file.
     */
    public File askOutputFile() {
        TextInputDialog dialog = new TextInputDialog("insert output file");
        dialog.setTitle("Output File: ");
        dialog.setHeaderText("Please, insert the output file");
        dialog.setContentText("Output File: ");
        String result = String.valueOf(dialog.showAndWait());
        File output = new File(result);
        System.out.println("\033[1;92m" + "The new file " + output + "was generated." + "\u001B[0m");
        return output;
    }
}
