package nyc.c4q.dereksantos.bigappsproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.model.AskQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.GeneralQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.Question;
import nyc.c4q.dereksantos.bigappsproject.viewholders.AskQuestionViewHolder;
import nyc.c4q.dereksantos.bigappsproject.viewholders.GeneralQuestionViewHolder;

/**
 * Created by SACC on 1/29/17.
 */
public class QuestionsAdapter extends RecyclerView.Adapter {

    private final int ASKQUESTION = 0, GENERALQUESTION = 1;

    List<Question> questionList = Arrays.asList(
            new AskQuestion("Ask a Question", "This is where you should ask the question!"),
            new GeneralQuestion("Recently Answered Questions", "These are the recently answered questions."),
            new GeneralQuestion("Unanswered Questions", "Recent questions asked by other New Yorkers.")
    );

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        switch (viewType) {
            case ASKQUESTION:
                viewHolder = new AskQuestionViewHolder(parent);
                break;
            case GENERALQUESTION:
                viewHolder = new GeneralQuestionViewHolder(parent);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case ASKQUESTION:
                AskQuestionViewHolder askQuestionViewHolder = (AskQuestionViewHolder) holder;
                Question askQuestion = questionList.get(position);
                askQuestionViewHolder.bind(askQuestion);
                break;
            case GENERALQUESTION:
                GeneralQuestionViewHolder generalQuestionViewHolder = (GeneralQuestionViewHolder) holder;
                Question generalQuestion = questionList.get(position);
                generalQuestionViewHolder.bind(generalQuestion);
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (questionList.get(position) instanceof AskQuestion) {
            return ASKQUESTION;
        } else if (questionList.get(position) instanceof GeneralQuestion) {
            return GENERALQUESTION;
        }
        return -1;
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }
}
