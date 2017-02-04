package nyc.c4q.dereksantos.bigappsproject.model;

/**
 * Created by shannonalexander-navarro on 2/4/17.
 */

public class UnansweredQuestion {

    private final String questionTitle;
    private final String questionDescription;

    public UnansweredQuestion(String questionTitle, String questionDescription) {
        this.questionTitle = questionTitle;
        this.questionDescription = questionDescription;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }
}
