package it.unicam.cs.pa.pa2122.jlogo105504.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * @author Francesco Chiocchi
 */
public class LogoFX extends Application {

    private Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/home.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("JLogo");
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResource("icons/Logo_icon.jpg")).toString()));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}