package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

import java.awt.event.ActionEvent;

public class LogoController {
    @FXML
    private Label welcomeText;

    @FXML
    private MenuItem openFile;

    @FXML
    private MenuItem changeSizePanel;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Benvenuti in JLogo!");
    }
}