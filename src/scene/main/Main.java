package scene.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    private final String DEFAULT_SCREEN = "MainScene.fxml";
    //private final String DEFAULT_ICON = "../resources/images/icon.png";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(DEFAULT_SCREEN));
        primaryStage.setTitle("CCA Organizer");
        primaryStage.setScene(new Scene(root));
        //primaryStage.getIcons().add(new Image(DEFAULT_ICON));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}