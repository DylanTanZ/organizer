package scene.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../login/Login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);

        // Set scene decoration
        primaryStage.setTitle("CCA Organizer");

        // Load custom fonts
        // Don't touch this
        Font.loadFont(getClass().getResourceAsStream("../../resources/fonts/Raleway-Light.ttf"), 12);
        Font.loadFont(getClass().getResourceAsStream("../../resources/fonts/Raleway-Thin.ttf"), 12);
        Font.loadFont(getClass().getResourceAsStream("../../resources/fonts/Roboto-Thin.ttf"), 12);
        Font.loadFont(getClass().getResourceAsStream("../../resources/fonts/AMDRTG.ttf"), 12);
        Font.loadFont(getClass().getResourceAsStream("../../resources/fonts/Roboto-Medium.ttf"), 12);

        // setResizable work around
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}