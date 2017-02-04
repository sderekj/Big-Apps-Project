package nyc.c4q.dereksantos.bigappsproject.viewholders.questionLists;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.AnswerActivity;
import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.Question;

/**
 * Created by SACC on 2/4/17.
 */
public class AnsweredQuestionViewHolder extends RecyclerView.ViewHolder {
    private final TextView titleView;
    private final TextView descriptionView;

    public AnsweredQuestionViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        titleView = (TextView) itemView.findViewById(R.id.question_title);
        descriptionView = (TextView) itemView.findViewById(R.id.question_description);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.question_viewholder, parent, false);
    }

    public void bind(Question question) {
        titleView.setText(question.getTitle());
        descriptionView.setText(question.getDescription());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(itemView.getContext(), AnswerActivity.class);
                itemView.getContext().startActivity(intent);
            }
        });
    }}
