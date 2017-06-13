package scene.calendar.entity;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

/**
 * Created by Liu Woon Kit on 31/5/2017.
 */
public class CalendarButton {
    // Temp Entity
    //private ArrayList<?> eventArrayList = new ArrayList<>();

    // 1 for day, 2 for month, 3 for year;
    private int buttonType;
    private GregorianCalendar date;
    private Button button;
    private final double DEFAULT_BUTTON_WIDTH = 70, DEFAULT_BUTTON_HEIGHT = 70;
    private double buttonWidth, buttonHeight;
    private Label label;
    private String buttonLabel;

    /*public ArrayList<?> getEventArrayList() {
        return eventArrayList;
    }

    public void setEventArrayList(ArrayList<?> eventArrayList) {
        this.eventArrayList = eventArrayList;
    }*/

    public int getButtonType() {
        return buttonType;
    }

    public void setButtonType(int buttonType) {
        this.buttonType = buttonType;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public double getButtonWidth() {
        return buttonWidth;
    }

    public void setButtonWidth(double buttonWidth) {
        this.buttonWidth = buttonWidth;
    }

    public double getButtonHeight() {
        return buttonHeight;
    }

    public void setButtonHeight(double buttonHeight) {
        this.buttonHeight = buttonHeight;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public String getButtonLabel() {
        return buttonLabel;
    }

    public void setButtonLabel(String buttonLabel) {
        this.buttonLabel = buttonLabel;
    }

    public void display() {

        if(label.getText().isEmpty()) {
            button = new Button(buttonLabel);
            button.setMaxSize(buttonWidth, buttonHeight);
        }
        else {
            label = new Label(buttonLabel);
        }

        // Prep icons
        HBox hBox = new HBox();
        /*for(String s : eventArrayList) {
           if(s.is???) {

           }
        }*/

        //VBox;
        //button.setGraphic();
    }

    public void display(boolean useDefault) {
        if(useDefault == true) {
            buttonWidth = DEFAULT_BUTTON_WIDTH;
            buttonHeight = DEFAULT_BUTTON_HEIGHT;
        }
        display();
    }

    public void suicide() {
        button.setGraphic(null);
    }

    public String toString() {
        return "";
    }

    public void makeSelectable() {

    }
}