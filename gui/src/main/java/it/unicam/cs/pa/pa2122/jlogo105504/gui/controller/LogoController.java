package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.ISavingFile;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.SavingFile;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.*;
import it.unicam.cs.pa.pa2122.jlogo105504.gui.utils.AskOutputFile;
import it.unicam.cs.pa.pa2122.jlogo105504.gui.utils.ChangePanelSize;
import it.unicam.cs.pa.pa2122.jlogo105504.gui.utils.ChooseFile;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to execute the events when a GUI is created.
 */
public class LogoController {

    /**
     * Initialize default width.
     */
    private int width = 920;

    /**
     * Initialize default height.
     */
    private int height = 680;
    private Panel panel;
    private File input;

    /**
     * This method is called when the user clicks on the "Open File" button.
     */
    @FXML
    private void tryToOpenFile() {
        System.out.println("Choosing a File...");
        boolean flag = false;
        File input = ChooseFile.chooseFile();
        if (input != null) {
            this.input = input;
            flag = true;
        }
        if (flag)
            openLogoDrawing();
        else System.out.println("You must select a file.");
    }

    /**
     * This private method is used to create a new window where a new representation of the
     * JLogo program was created.
     */
    private void openLogoDrawing() {
        Canvas canvas = createPanelFX();
        Group anotherWindow = new Group(canvas);
        Scene scene = new Scene(anotherWindow, width, height);
        Stage stage = new Stage();
        stage.setTitle("JLogo Draw");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Create the Canvas where the shape are represented.
     *
     * @return the canvas.
     */
    private Canvas createPanelFX() {
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        panel = new SimplePanel(width, height);
        FileProgramReader fileProgramReader = new FileProgramReader();
        fileProgramReader.readFile(input, panel);
        draw(panel, gc);
        return canvas;
    }

    /**
     * This private method is used to draw the executions of the JLogo program.
     *
     * @param panel the panel to draw
     * @param gc    the graphics context
     */
    private void draw(Panel panel, GraphicsContext gc) {
        gc.setFill(Color.rgb(panel.getScreenColor().red(), panel.getScreenColor().green(),
                panel.getScreenColor().blue()));
        gc.fillRect(0, 0, width, height);
        for (BasicShape basicShape : panel.getBasicShapes()) {
            gc.setLineWidth(basicShape.getSize());
            gc.setFill(Color.rgb(basicShape.getColor().red(), basicShape.getColor().green(),
                    basicShape.getColor().blue()));
            gc.moveTo(basicShape.getEnd().getX(), basicShape.getEnd().getY());
            gc.lineTo(basicShape.getStart().getX(), basicShape.getStart().getY());
            gc.stroke();
        }
        for (ClosedArea closedArea : panel.getClosedAreas()) {

        }
    }

    public void drawBasicShape(){}

    public void drawClosedArea(){}

    /**
     * This method is used to save a file in a specified path.
     */
    @FXML
    public void saveFile() {
        if (input == null)
            System.err.println("No files previously opened. First, try to opening a file.");
        else {
            AskOutputFile askOutputFileController = new AskOutputFile();
            File output = askOutputFileController.askOutputFile();
            ISavingFile savingFile = new SavingFile();
            savingFile.saveProgramToFile(output, this.panel);
        }
    }

    /**
     * This method, when called, close JLogo application.
     */
    @FXML
    private void setCloseJLogo() {
        System.out.println("\033[1;92m" + "Exiting JLogo..." + "\u001B[0m");
        System.exit(0);
    }

    /**
     * This method, when called, changes the size of the panel.
     */
    @FXML
    private void changeSizePanel() {
        System.out.println("Changing size Panel...");
        ChangePanelSize changePanelSizeController = new ChangePanelSize();
        width = changePanelSizeController.askPanelWidth();
        height = changePanelSizeController.askPanelHeight();
    }

    /**
     * This method is called when the user choose the options "Help" -> "About" in the manu bar.
     */
    @FXML
    private void getHelp() {
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
    private String getHelperString() {
        return """
                The steps to run the application are:
                1: Select a size of the panel, otherwise the default size will be set.
                2: Open a logo file.
                3: A new window was opened and a panel was created with all information read into the file.
                4: To save the file you must click the menu item "Save" and digit the name of the file.""";
    }

}
