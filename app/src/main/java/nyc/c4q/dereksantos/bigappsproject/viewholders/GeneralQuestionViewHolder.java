package nyc.c4q.dereksantos.bigappsproject.viewholders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.AnsweredQuestionListActivity;
import nyc.c4q.dereksantos.bigappsproject.UnansweredQuestionListActivity;
import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.Question;


/**
 * Created by SACC on 2/1/17.
 */

public class GeneralQuestionViewHolder extends RecyclerView.ViewHolder {
    private final TextView titleTextView;
    private final TextView descriptionTextView;
    private final Context context;


    public GeneralQuestionViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        titleTextView = (TextView) itemView.findViewById(R.id.question_title_tv);
        descriptionTextView = (TextView) itemView.findViewById(R.id.question_description_tv);
        context = parent.getContext();

    }

    public static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.general_question_viewholder, parent, false);
    }

    public void bind(final Question generalQuestion) {

        titleTextView.setText(generalQuestion.getTitle());
        descriptionTextView.setText(generalQuestion.getDescription());
        descriptionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                if (titleTextView.getText().equals("Recently Answered Questions")) {
                    intent = new Intent(context, AnsweredQuestionListActivity.class);
                } else {
                    intent = new Intent(context, UnansweredQuestionListActivity.class);
                }

                context.startActivity(intent);
//                Fragment answerFragment = new AnswerFragment();
//                FragmentManager answerManager = ((FragmentActivity) view.getContext()).getSupportFragmentManager();
//                FragmentTransaction answerFragTransaction = answerManager.beginTransaction();
//                answerFragTransaction.replace(R.id.fragment_questions, answerFragment);

            }
        });
    }
}
