package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.ISavingFile;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.SavingFile;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.BasicShape;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.ClosedArea;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

/**
 * This class is used to execute the events when a GUI is created.
 */
public class LogoController {

    private int defaultWidth = 920;
    private int defaultHeight = 680;
    private Panel panel;
    private File input;

    /**
     * This method is called when the user clicks on the "Open File" button.
     */
    @FXML
    private void tryToOpenFile() {
        System.out.println("Choosing a File...");
        boolean flag = false;
        File input = ChooseFileController.chooseFile();
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
        Scene scene = new Scene(anotherWindow, defaultWidth, defaultHeight);
        Stage stage = new Stage();
        stage.setTitle("JLogo");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Create the Canvas where the shape are represented.
     *
     * @return the canvas.
     */
    private Canvas createPanelFX() {
        Canvas canvas = new Canvas(defaultWidth, defaultHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        panel = new SimplePanel(defaultWidth, defaultHeight);
        FileProgramReader fileProgramReader = new FileProgramReader();
        fileProgramReader.readFile(input, panel);
        draw(panel, gc);
        return canvas;
    }

    /**
     * This private method is used to draw the executions of the JLogo program.
     *
     * @param panel the panel to draw
     * @param gc the graphics context
     */
    private void draw(Panel panel, GraphicsContext gc) {
        gc.setFill(Color.rgb(panel.getScreenColor().red(), panel.getScreenColor().green(),
                panel.getScreenColor().blue()));
        gc.fillRect(0,0, defaultWidth, defaultHeight);
        for (BasicShape basicShape : panel.getBasicShapes()) {
            gc.setLineWidth(panel.getCursor().getSizeLine());
            gc.setFill(Color.rgb(basicShape.getColor().red(), basicShape.getColor().green(),
                    basicShape.getColor().blue()));
            gc.moveTo(basicShape.getEnd().getX(), basicShape.getEnd().getY());
            gc.lineTo(basicShape.getStart().getX(), basicShape.getStart().getY());
            gc.stroke();
        }
        for (ClosedArea closedArea : panel.getClosedAreas()) {
            gc.setFill(Color.rgb(closedArea.getColor().red(), closedArea.getColor().green(),
                    closedArea.getColor().blue()));
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
        ChangePanelSizeController changePanelSizeController = new ChangePanelSizeController();
        defaultWidth = changePanelSizeController.askPanelWidth();
        defaultHeight = changePanelSizeController.askPanelHeight();
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
                3: A new window was opened and a panel was created with all information read into the file.""";
    }

    @FXML
    public void newFile(){
        panel.getBasicShapes().clear();
        panel.getClosedAreas().clear();
    }

    /**
     * This method is used to save a file in a specified path.
     *
     */
    @FXML
    public void saveFile() {
        if(input == null)
            System.err.println("No files previously opened. First, try to opening a file.");
        else {
            AskOutputFileController askOutputFileController = new AskOutputFileController();
            File output = askOutputFileController.askOutputFile();
            ISavingFile savingFile = new SavingFile();
            savingFile.saveProgramToFile(output, this.panel);
        }
    }
}
