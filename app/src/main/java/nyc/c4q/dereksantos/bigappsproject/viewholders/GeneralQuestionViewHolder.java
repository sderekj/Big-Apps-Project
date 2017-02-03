package nyc.c4q.dereksantos.bigappsproject.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.Question;


/**
 * Created by SACC on 2/1/17.
 */

public class GeneralQuestionViewHolder extends RecyclerView.ViewHolder {
    private final TextView titleTextView;
    private final TextView descriptionTextView;

    public GeneralQuestionViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        titleTextView = (TextView) itemView.findViewById(R.id.question_title_tv);
        descriptionTextView = (TextView) itemView.findViewById(R.id.question_description_tv);

    }

    public static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.general_question_viewholder, parent, false);
    }

    public void bind(Question generalQuestion) {
        titleTextView.setText(generalQuestion.getTitle());
        descriptionTextView.setText(generalQuestion.getDescription());
    }
}
