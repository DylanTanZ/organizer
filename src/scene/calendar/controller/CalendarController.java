package scene.calendar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import scene.calendar.entity.Calendar;
import scene.calendar.entity.CalendarButton;

/**
 * Created by Liu Woon Kit on 23/5/2017.
 */
public class CalendarController {
    private Label DAY_LABEL[] = {new Label("Monday"), new Label("Tuesday"), new Label("Wednesday"), new Label("Thursday"), new Label("Friday"), new Label("Saturday"), new Label("Sunday")};
    private CalendarButton[] calendarButtonArray = new CalendarButton[31];

    @FXML
    GridPane calGrid;

    public void pickDay() {
        for(CalendarButton cb : calendarButtonArray) {

        }
    }

    public void pickMonth() {
        for(CalendarButton cb : calendarButtonArray) {

        }
    }

    public void pickYear() {
        for(CalendarButton cb : calendarButtonArray) {

        }
    }

    public void forceKill() {
        // I'm sorry :c
        for(CalendarButton cb : calendarButtonArray) {
            cb.suicide();
        }
    }

}