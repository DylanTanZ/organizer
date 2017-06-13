package scene.main.controller;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Liu Woon Kit on 12/6/2017.
 */
public class MainSceneController implements Initializable{
    // Create static FXMLLoader so that the MainSceneController does not need to keep creating new FXMLLoaders
    private static FXMLLoader fxmlLoader;

    @FXML
    private AnchorPane content;

    @FXML
    private AnchorPane sceneSelector;

    @Override
    public void initialize(URL location, ResourceBundle resource) {

    }



    @FXML
    void homeClick(ActionEvent event) {
        try {
            content.getChildren().setAll((AnchorPane)FXMLLoader.load(getClass().getResource("../../home/Home.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void calendarClick(ActionEvent event) {
        try {
            content.getChildren().setAll((AnchorPane)FXMLLoader.load(getClass().getResource("../../calendar/Calendar.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /*@FXML
    void logoutClick(ActionEvent event) {
        //Wipe old user data
        new UserDA().userLogout();

        // Create a stage object and lock on the current stage
        Stage stage=(Stage)((Node)event.getTarget()).getScene().getWindow();

        // Close the stage
        stage.close();

        // Prepare stage
        Parent p = loadSceneFile("Login.fxml");
        stage.setScene(new Scene(p));

        //Show the stage
        stage.show();
    }*/

    private boolean displayStatus = false;
    @FXML
    void sceneSelectorClick(ActionEvent event) {
        int width = 1316;
        if(displayStatus == false) {
            displayStatus = true;
            KeyFrame start = new KeyFrame(Duration.ZERO,
                    new KeyValue(sceneSelector.translateXProperty(), 0));
            KeyFrame end = new KeyFrame(Duration.seconds(0.40),
                    new KeyValue(sceneSelector.translateXProperty(), width + 50));
            Timeline slide = new Timeline(start, end);
            slide.setOnFinished(e -> System.out.println("Done"));
            slide.play();
        }

        else {
            displayStatus = false;
            KeyFrame start = new KeyFrame(Duration.ZERO,
                    new KeyValue(sceneSelector.translateXProperty(), width + 50));
            KeyFrame end = new KeyFrame(Duration.seconds(0.5),
                    new KeyValue(sceneSelector.translateXProperty(), 0));
            Timeline slide = new Timeline(start, end);
            slide.setOnFinished(e -> System.out.println("Done"));
            slide.play();
        }
    }
}