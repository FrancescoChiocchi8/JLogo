package it.unicam.cs.pa.pa2122.jlogo105504.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

/**
 * This class is used to launch the JLogo GUI.
 *
 * @author Francesco Chiocchi
 */
public class LogoFX extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/home.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("JLogo");
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResource("icons/Logo_icon.jpg")).toString()));
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main of the application.
     *
     * @param args the args
     */
    public static void main(String[] args) {
        launch();
    }
}