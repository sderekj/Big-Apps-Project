package nyc.c4q.dereksantos.bigappsproject.model;

/**
 * Created by SACC on 2/1/17.
 */

public class GeneralQuestion implements Question {

    private final String questionTitle;
    private final String questionDescription;

    public GeneralQuestion(String questionTitle, String questionDescription) {
        this.questionTitle = questionTitle;
        this.questionDescription = questionDescription;
    }

    @Override
    public String getTitle() {
        return questionTitle;
    }

    @Override
    public String getDescription() {
        return questionDescription;
    }
}
