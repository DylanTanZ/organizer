package scene.report;
import scene.survey.SurveyQn;
import javafx.fxml.Initializable;
import resources.database.DB;


import javax.sql.rowset.CachedRowSet;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Created by User on 1/8/2017.
 */
public class ReportController implements Initializable{
    ArrayList<SurveyQn> dataList;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CachedRowSet data=DB.read("select * from surveyTable ");
        try {
            while(data.next()){
                SurveyQn sq=new SurveyQn();
                sq.setId(data.getInt("id"));

                // get eventrate
                sq.setEventRate(data.getRate("Question1"));

                //get venueRate
                sq.setVenueRate(data.getRATE("Question2"));
                //he

                sq.setAns4(data.getString("Question4"));
                sq.setAns5(data.getString("Question5"));
              // ,data.getString(1),data.getString(2),
              //          data.getString(0));
                dataList.add(sq);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
