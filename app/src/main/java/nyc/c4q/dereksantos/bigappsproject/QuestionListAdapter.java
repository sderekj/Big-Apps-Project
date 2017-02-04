package nyc.c4q.dereksantos.bigappsproject;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.model.AskQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.GeneralQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.Question;

/**
 * Created by SACC on 2/3/17.
 */
public class QuestionListAdapter extends RecyclerView.Adapter<QuestionViewHolder> {
    List<Question> questionList = Arrays.asList(
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new GeneralQuestion("Recently Answered Questions", "These are the recently answered questions."),
            new GeneralQuestion("Unanswered Questions", "Recent questions asked by other New Yorkers."),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new GeneralQuestion("Recently Answered Questions", "These are the recently answered questions."),
            new GeneralQuestion("Unanswered Questions", "Recent questions asked by other New Yorkers."),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new GeneralQuestion("Recently Answered Questions", "These are the recently answered questions."),
            new GeneralQuestion("Unanswered Questions", "Recent questions asked by other New Yorkers."),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new GeneralQuestion("Recently Answered Questions", "These are the recently answered questions."),
            new GeneralQuestion("Unanswered Questions", "Recent questions asked by other New Yorkers."),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new GeneralQuestion("Recently Answered Questions", "These are the recently answered questions."),
            new GeneralQuestion("Unanswered Questions", "Recent questions asked by other New Yorkers."),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new GeneralQuestion("Recently Answered Questions", "These are the recently answered questions."),
            new GeneralQuestion("Unanswered Questions", "Recent questions asked by other New Yorkers."),
            new AskQuestion("Ask a Question", "This is where you should ask the question!")
            );

    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new QuestionViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position) {
        Question question = questionList.get(position);
        holder.bind(question);
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }
}
