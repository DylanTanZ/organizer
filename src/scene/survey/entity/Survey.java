package scene.survey.entity;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Liu Woon Kit on 12/6/2017.
 */
public class Survey {
    private String surveyTitle;
    private GregorianCalendar submitDate;
    private ArrayList<SurveyQuestion> questionsAndAnswersList;

    public Survey(String surveyTitle, GregorianCalendar submitDate) {
        this.surveyTitle = surveyTitle;
        this.submitDate = submitDate;
    }

    public String getSurveyTitle() {
        return surveyTitle;
    }

    public void setSurveyTitle(String surveyTitle) {
        this.surveyTitle = surveyTitle;
    }

    public GregorianCalendar getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(GregorianCalendar submitDate) {
        this.submitDate = submitDate;
    }

    public void addQuestionAndAnswers(String question, String answer) {
        questionsAndAnswersList.add(new SurveyQuestion(question, answer));
    }
}