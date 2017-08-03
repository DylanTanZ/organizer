package scene.survey;
import resources.database.DB;
import scene.survey.SurveyController.RATE;
import scene.survey.SurveyController.HEAR_EVENT;

/**
 * Created by User on 27/7/2017.
 */
public class SurveyQn {
    private RATE eventRate;
    private RATE venueRate;
    private HEAR_EVENT he;
    private String ans4;
    private String ans5;
    private int id;





    public SurveyQn(int id,RATE eventRate, RATE venueRate, HEAR_EVENT he,String ans4, String ans5) {
        this.eventRate=eventRate;
        this.venueRate=venueRate;
        this.he=he;
        this.ans4=ans4;
        this.ans5=ans5;
        this.id=id;
    }

    public RATE getEventRate() {
        return eventRate;
    }

    public void setEventRate(RATE eventRate) {
        this.eventRate = eventRate;
    }

    public RATE getVenueRate() {
        return venueRate;
    }

    public void setVenueRate(RATE venueRate) {
        this.venueRate = venueRate;
    }

    public HEAR_EVENT getHe() {
        return he;
    }

    public void setHe(HEAR_EVENT he) {
        this.he = he;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getAns5() {
        return ans5;
    }

    public void setAns5(String ans5) {
        this.ans5 = ans5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void save(){
        String query="insert into surveytable(question1,question2,question3,question4,question5) values(";
        query+="'"+eventRate.name()+"',";
        query+="'"+venueRate.name()+"',";
        query+="'"+he.name()+"',";
        query+="'"+ans4+"',";
        query+="'"+ans5+"')";
        System.out.println(query);


        DB.update(query);
    }
}





