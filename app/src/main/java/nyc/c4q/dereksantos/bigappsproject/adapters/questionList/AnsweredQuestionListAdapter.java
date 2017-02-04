package nyc.c4q.dereksantos.bigappsproject.adapters.questionList;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.viewholders.questionLists.AnsweredQuestionViewHolder;
import nyc.c4q.dereksantos.bigappsproject.model.AskQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.GeneralQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.Question;

/**
 * Created by SACC on 2/4/17.
 */
public class AnsweredQuestionListAdapter extends RecyclerView.Adapter<AnsweredQuestionViewHolder> {
    List<Question> answeredQuestionList = Arrays.asList(
            new AskQuestion("Where to find an apartment?", "Something about question 1"),
            new GeneralQuestion("Is school free?", "Something about question 2"),
            new GeneralQuestion("Where can I find the best tacos in the West Village?", "Something about question 3"),
            new AskQuestion("Is Craigslist good for jobs?", "Something about question 4")
    );

    @Override
    public AnsweredQuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AnsweredQuestionViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(AnsweredQuestionViewHolder holder, int position) {
        Question question = answeredQuestionList.get(position);
        holder.bind(question);
    }

    @Override
    public int getItemCount() {
        return answeredQuestionList.size();
    }
}
