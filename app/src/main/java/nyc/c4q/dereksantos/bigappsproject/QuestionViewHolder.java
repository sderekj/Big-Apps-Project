package nyc.c4q.dereksantos.bigappsproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SACC on 1/29/17.
 */

public class QuestionViewHolder extends RecyclerView.ViewHolder {


    private final TextView titleTextView;
    private final TextView descriptionTextView;

    public QuestionViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        titleTextView = (TextView) itemView.findViewById(R.id.question_title_tv);
        descriptionTextView = (TextView) itemView.findViewById(R.id.question_description_tv);
    }

    public static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.question_viewholder, parent, false);
    }

    public void bind(Question question) {
        titleTextView.setText(question.getTitle());
        descriptionTextView.setText(question.getDescription());
    }
}
