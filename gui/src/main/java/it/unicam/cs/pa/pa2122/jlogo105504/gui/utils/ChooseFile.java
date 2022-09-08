package it.unicam.cs.pa.pa2122.jlogo105504.gui.utils;

import javafx.stage.FileChooser;

import java.io.File;

/**
 * This class is used to open the file in the "Browse File".
 *
 * @author Francesco Chiocchi
 */
public class ChooseFile {

    /**
     * Default constructor.
     */
    public ChooseFile() {
    }

    /**
     * This method is used to select a file from "Browse File".
     *
     * @return the chosen file.
     */
    public static File chooseFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose File");
        return fileChooser.showOpenDialog(null);
    }
}
