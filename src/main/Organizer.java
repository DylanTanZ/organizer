package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import util.DB;


public class Organizer extends Application {
    private final String DEFAULT_SCREEN = "login/Login.fxml";
    //private final String DEFAULT_ICON = "../res/images/icon.png";

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource(DEFAULT_SCREEN));
        primaryStage.setTitle("Personal Manager");
        //primaryStage.setScene(new Scene(root));
        //primaryStage.getIcons().add(new Image(DEFAULT_ICON));
        primaryStage.show();

        DB db=new DB();
        db.update("INSERT into test(\"123\",\"123\")");



    }


    public static void main(String[] args) {
        launch(args);
    }
}