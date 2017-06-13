package scene.survey.entity;

/**
 * Created by Liu Woon Kit on 12/6/2017.
 */
public class SurveyQuestion {
    private String question;
    private String answer;

    public SurveyQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
