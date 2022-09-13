package it.unicam.cs.pa.pa2122.jlogo105504.gui.utils;

import javafx.scene.control.Alert;

/**
 * The responsibility of this class is to create a new Alert dialog in order to help the user.
 *
 * @author Francesco Chiocchi
 */
public class HelpUser {

    /**
     * This static method is used to print to the screen a simple text in order to help the user.
     */
    public static void getHelp() {
        System.out.println("Get help: " + getHelperString());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("JLogo Help");
        alert.setHeaderText("How to use JLogo application?");
        alert.setContentText(getHelperString());
        alert.showAndWait();
    }

    /**
     * The default string to helper the user.
     *
     * @return the helper string.
     */
    private static String getHelperString() {
        return """
                The steps to run the application are:
                1: Select a size of the panel, otherwise the default size will be set.
                2: Open a logo file.
                3: A new window was opened and a panel was created with all information read into the file.
                4: To save the file you must click the menu item "Save" and digit the name of the file.""";
    }
}
