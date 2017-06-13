package scene.calendar.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import scene.calendar.entity.Calendar;
import scene.calendar.entity.CalendarButton;

import java.net.URL;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

/**
 * Created by Liu Woon Kit on 23/5/2017.
 */
public class CalendarController implements Initializable {
    // 1 = day picker, 2 = month picker, 3 = year picker
    private int selectedMode;

    Calendar calendar = new Calendar();
    private Label DAY_LABEL[] = {new Label("Monday"), new Label("Tuesday"), new Label("Wednesday"), new Label("Thursday"), new Label("Friday"), new Label("Saturday"), new Label("Sunday")};
    private Button[] calendarButton = new Button[42];

    @FXML
    GridPane calGrid;

    @FXML
    Button modeDisplay;

    @FXML
    Button previousBtn, nextBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        modeDisplay.setText(calendar.toString());
    }

    @FXML
    void modeSwitch(ActionEvent event) {
        switch(selectedMode) {
            case 1: {
                pickMonth();
                selectedMode = 2;
                break;
            }
            case 2: {
                pickYear();
                selectedMode = 3;
                break;
            }
            case 3: {
                pickDay();
                selectedMode = 1;
                break;
            }
        }
        clearGrid();
    }

    public void pickDay() {
        for(Button b : calendarButton) {
            int j = calendar.getFirstDayOfMonth();

            for (int i = 0; i < (calendar.getMaxDaysOfMonth() + j); i++) {
                b.setText(Integer.toString(i+1));
            }
        }
    }

    public void pickMonth() {
        for(Button b : calendarButton) {
            //calGrid.add();
        }
    }

    public void pickYear() {
        for(Button b : calendarButton) {
        }
    }

    public void clearGrid() {

    }



}