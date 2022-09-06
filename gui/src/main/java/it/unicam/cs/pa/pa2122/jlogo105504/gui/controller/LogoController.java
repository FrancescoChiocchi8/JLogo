package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.BasicShape;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.ClosedArea;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.Panel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import it.unicam.cs.pa.pa2122.jlogo105504.api.parser.LogoBaseListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;


public class LogoController {

    private final int defaultWidth = 920;
    private final int defaultHeight = 680;
    @FXML
    private Button openFile;
    @FXML
    private Button closeJLogo;
    private Panel panel;
    private File file;
    private LogoBaseListener logoBaseListener;


    @FXML
    private void tryToOpenFile() {
        System.out.println("Choosing a File...");
        boolean flag = false;
        File input = ChooseFileController.chooseFile();
        if (input != null) {
            file = input;
            flag = true;
        }
        if (flag)
            openLogoDrawing();
        else System.out.println("You must select a file.");
    }

    private void openLogoDrawing() {
        Canvas canvas = createPanelFX();
        Group anotherWindow = new Group(canvas);
        Scene scene = new Scene(anotherWindow, defaultWidth, defaultHeight);

        Stage stage = new Stage();
        stage.setTitle("JLogo");
        stage.setScene(scene);
        stage.show();
    }

    private Canvas createPanelFX() {
        //Canvas canvas = createCanvas();
        Canvas canvas = new Canvas(defaultWidth, defaultHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        panel = new SimplePanel(defaultWidth, defaultHeight);
        FileProgramReader fileProgramReader = new FileProgramReader();
        fileProgramReader.readFile(file, panel);
        draw(panel, gc);

        return canvas;
    }

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


    private Canvas createCanvas() {
        Canvas canvas = new Canvas(defaultWidth, defaultHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        return canvas;
    }

    @FXML
    private void setCloseJLogo() {
        System.out.println("\033[1;92m" + "Exiting JLogo...");
        System.out.print("\u001B[0m");
        System.exit(0);
    }

    @FXML
    private void changeSizePanel() {
        System.out.println("Changing size Panel...");

    }

    public void startExecution(ActionEvent actionEvent) {
    }

    @FXML
    private void getHelp() {
        //TODO
    }
}
