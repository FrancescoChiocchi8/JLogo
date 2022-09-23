package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.ISavingFile;
import it.unicam.cs.pa.pa2122.jlogo105504.api.io.SavingFile;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.BasicShape;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.ClosedArea;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import it.unicam.cs.pa.pa2122.jlogo105504.gui.utils.*;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

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
        System.out.println("\033[1;34m" + "Choosing a File..." + "\u001B[0m");
        boolean flag = false;
        File input = ChooseFile.chooseFile();
        if (input != null) {
            this.input = input;
            flag = true;
        }
        if (flag)
            openLogoDrawing();
        else System.out.println("\033[1;93m" + "You must select a file." + "\u001B[0m");
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
     * Create the Canvas where all shapes are represented.
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
     * @param gc the graphics context
     */
    private void draw(Panel panel, GraphicsContext gc) {
        gc.setFill(Color.rgb(panel.getScreenColor().red(), panel.getScreenColor().green(),
                panel.getScreenColor().blue()));
        gc.fillRect(0, 0, width, height);
        if (!panel.getBasicShapes().isEmpty())
            drawBasicShape(gc);
        if (!panel.getClosedAreas().isEmpty())
            drawClosedArea(gc);
    }

    /**
     * This private method is used to draw a basic shape in the GUI.
     *
     * @param gc the graphics context
     */
    private void drawBasicShape(GraphicsContext gc) {
        for (BasicShape basicShape : panel.getBasicShapes()) {
            gc.setStroke(Color.rgb(basicShape.getColor().red(), basicShape.getColor().green(),
                    basicShape.getColor().blue()));
            gc.setLineWidth(basicShape.getSize());
            gc.beginPath();
            gc.moveTo(basicShape.getEnd().getX(), basicShape.getEnd().getY());
            gc.lineTo(basicShape.getStart().getX(), basicShape.getStart().getY());
            gc.stroke();
        }
    }

    /**
     * This private method is used to draw a closed area in the GUI.
     *
     * @param gc the graphics context
     */
    private void drawClosedArea(GraphicsContext gc) {
        for(ClosedArea closedArea : panel.getClosedAreas()){
            gc.setStroke(Color.rgb(closedArea.getColor().red(), closedArea.getColor().green(),
                    closedArea.getColor().blue()));
            gc.stroke();
        }
    }

    /**
     * This method is used to save a file in a specified path.
     */
    @FXML
    public void saveFile() {
        if (input == null)
            System.err.println("No files previously opened. First, try to opening a file.");
        else {
            File output = AskOutputFile.askOutputFile();
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
        System.out.println("\033[1;93m" + "Changing size Panel..." + "\u001B[0m");
        ChangePanelSize changePanelSizeController = new ChangePanelSize();
        width = changePanelSizeController.askPanelWidth();
        height = changePanelSizeController.askPanelHeight();
    }

    /**
     * This method is called when the user choose the options "Help" -> "About" in the manu bar.
     */
    @FXML
    private void getHelp() {
        HelpUser.getHelp();
    }

    /**
     * This method is to be implemented.
     */
    @FXML
    public void runAnInstruction() {
    }
}
