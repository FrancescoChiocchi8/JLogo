package it.unicam.cs.pa.pa2122.jlogo105504.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LogoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Benvenuti in JLogo!");
    }
}