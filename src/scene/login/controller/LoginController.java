package scene.login.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private JFXTextField adminField;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    void forgotPassword(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://cfapps.nyp.edu.sg/CF/SIMS/ResetPin/pin_reset_form.cfm"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loginClick(ActionEvent event) {
        String adminNo = adminField.getText();
        String password = passwordField.getText();

        //login checker
        int result = 0;
        switch(result) {
            case 0: {
                //setLabel("Couldn't find your admin number");
            }
            case 1: {
                //setLabel("Wrong password");
                //"Incorrect password or admin number";
                //return;
            }
        }

        // Continue to main scene
        Parent root= null;
        try {
            root = FXMLLoader.load(getClass().getResource("../../main/MainScene.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene=new Scene(root);
        Stage stage = (Stage)((Node)event.getTarget()).getScene().getWindow();

        stage.hide();
        stage.setScene(scene);

        // setResizable work around
        stage.setScene(scene);
        stage.setResizable(false);
        stage.sizeToScene();

        stage.show();
    }
}