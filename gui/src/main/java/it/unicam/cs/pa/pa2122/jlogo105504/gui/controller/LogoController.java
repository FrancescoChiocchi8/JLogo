package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import it.unicam.cs.pa.pa2122.jlogo105504.api.io.FileProgramReader;
import it.unicam.cs.pa.pa2122.jlogo105504.api.model.SimplePanel;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

import java.io.File;


public class LogoController {

    @FXML
    private MenuItem openFile;

    @FXML
    private MenuItem changeSizePanel;

    public void tryToOpenFile(){
        System.out.println("Opening File...");
        ChooseFileController chooseFileController = new ChooseFileController();
        File input = chooseFileController.chooseFile();
        FileProgramReader fileProgramReader = new FileProgramReader();
        fileProgramReader.readFile(input, new SimplePanel(500, 400));
    }

    public void changeSizePanel(){
        System.out.println("Changing size Panel...");
    }

    public void getHelp(){
        //TODO
    }



}
