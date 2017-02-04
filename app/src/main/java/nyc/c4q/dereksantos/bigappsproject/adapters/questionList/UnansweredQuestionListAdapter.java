package nyc.c4q.dereksantos.bigappsproject.adapters.questionList;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.viewholders.questionLists.UnansweredQuestionViewHolder;
import nyc.c4q.dereksantos.bigappsproject.model.AskQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.GeneralQuestion;
import nyc.c4q.dereksantos.bigappsproject.model.Question;

/**
 * Created by SACC on 2/3/17.
 */
public class UnansweredQuestionListAdapter extends RecyclerView.Adapter<UnansweredQuestionViewHolder> {
    List<Question> unansweredQuestionList = Arrays.asList(
            new AskQuestion("How much does it cost to ride the subway?", "I'm new to the city, and I don't have a car yet. I need to take the subway, but I don't know how much it costs to ride the subway. How much is it?"),
            new GeneralQuestion("Enrolling my children in school", "I have two young children, and I want them to go to the local school. How do I enroll them in the school?"),
            new GeneralQuestion("Illegal to feed pigeons?", "I live in the lower east side, and I really want to feed the pigeons. Does anyone know if this illegal?"),
            new AskQuestion("Medicare?", "Does anyone know where I can sign up for Medicare?"),
            new GeneralQuestion("Best supermarket?", "Hey, I'm new to the neighborhood, and I'm curious if I should go to Joe's supermarket or the C-Town 2 blocks down."),
            new AskQuestion("How much does it cost to ride the subway?", "I'm new to the city, and I don't have a car yet. I need to take the subway, but I don't know how much it costs to ride the subway. How much is it?"),
            new GeneralQuestion("Enrolling my children in school", "I have two young children, and I want them to go to the local school. How do I enroll them in the school?"),
            new GeneralQuestion("Illegal to feed pigeons?", "I live in the lower east side, and I really want to feed the pigeons. Does anyone know if this illegal?"),
            new AskQuestion("Medicare?", "Does anyone know where I can sign up for Medicare?"),
            new GeneralQuestion("Best supermarket?", "Hey, I'm new to the neighborhood, and I'm curious if I should go to Joe's supermarket or the C-Town 2 blocks down.")
            );

    @Override
    public UnansweredQuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UnansweredQuestionViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(UnansweredQuestionViewHolder holder, int position) {
        Question question = unansweredQuestionList.get(position);
        holder.bind(question);
    }

    @Override
    public int getItemCount() {
        return unansweredQuestionList.size();
    }
}
