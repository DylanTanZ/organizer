package scene.survey;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;


/**
 * Created by User on 26/7/2017.
 */
public class SurveyController implements Initializable {

    @FXML
    private ToggleGroup rateEvent;
    @FXML
    private ToggleGroup rateVenue;
    @FXML
    private ToggleGroup hearEvent;
    @FXML
    private JFXTextField ans4;
    @FXML
    private JFXTextField ans5;



    enum RATE {
        Excellent("Excellent",0),Good("Good",1),Average("Average",2),Poor("Poor",3);

        private final String rate;
        private final int index;
        private RATE(String rate, int index){
            this.index=index;
            this.rate=rate;

        }
        private int getIndex(){return index;}
        private String getRate(){return rate;}

    }

    enum HEAR_EVENT{
        Newspaper("Newspaper"),NYPPortal("NYPPortal"),Radio("Radio"), Magazine("Magazine");
        private final String way;
        private HEAR_EVENT(String way){
            this.way = way;
        }
        String getWay(){return way;}

    }





    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
    @FXML
    void submit(ActionEvent event) {
        RadioButton rb=(RadioButton)rateEvent.getSelectedToggle();
        RATE rEvent=getRate(rb.getText());
        RATE rVenue=getRate(((RadioButton)rateVenue.getSelectedToggle()).getText());


        RadioButton hb=(RadioButton)hearEvent.getSelectedToggle();
        HEAR_EVENT he;
        if(hb.getText()== HEAR_EVENT.Newspaper.getWay()){he= HEAR_EVENT.Newspaper;}
        else if(hb.getText()== HEAR_EVENT.NYPPortal.getWay()){he= HEAR_EVENT.NYPPortal;}
        else if(hb.getText()== HEAR_EVENT.Radio.getWay()){he= HEAR_EVENT.Radio;}
        else {he= HEAR_EVENT.Magazine;}

        String ans4txt = ans4.getText();
        String ans5txt = ans5.getText();

        SurveyQn sq=new SurveyQn(-1,rEvent,rVenue,he,ans4txt,ans5txt);
        sq.save();









    }

    private RATE getRate(String text){
        if(text== RATE.Excellent.name()){return RATE.Excellent;}
        else if(text== RATE.Good.name()){return RATE.Good;}
        else if(text== RATE.Average.name()){return RATE.Average;}
        return RATE.Poor;

    }




}
