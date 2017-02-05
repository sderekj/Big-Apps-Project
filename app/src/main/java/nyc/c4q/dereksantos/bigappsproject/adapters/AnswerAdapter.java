package nyc.c4q.dereksantos.bigappsproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.Answer;
import nyc.c4q.dereksantos.bigappsproject.viewholders.AnswerViewHolder;

/**
 * Created by shannonalexander-navarro on 2/4/17.
 */

public class AnswerAdapter extends RecyclerView.Adapter {

    List<Answer> answers = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.answer_item, parent,false);
        return new AnswerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        AnswerViewHolder answerViewHolder = (AnswerViewHolder) holder;
        Answer answerList = answers.get(position);
        answerViewHolder.bind(answerList);
    }

    @Override
    public int getItemCount() {
        return answers.size();
    }
}
