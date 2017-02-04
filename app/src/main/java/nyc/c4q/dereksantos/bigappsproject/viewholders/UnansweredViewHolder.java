package nyc.c4q.dereksantos.bigappsproject.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.Question;

/**
 * Created by shannonalexander-navarro on 2/3/17.
 */

public class UnansweredViewHolder extends RecyclerView.ViewHolder{
    private TextView unansweredQuestionTitle;
    private TextView unansweredQuestionDescription;

    public UnansweredViewHolder(View itemView) {
        super(itemView);

        unansweredQuestionTitle = (TextView) itemView.findViewById(R.id.unanswered_title_tv);
        unansweredQuestionDescription = (TextView) itemView.findViewById(R.id.unanswered_description_tv);
    }

    public static View inflateView(ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.unanswered_viewholder, parent, false);
    }

    public void bind(Question unansweredQuestion){
        unansweredQuestionTitle.setText(unansweredQuestion.getTitle());
        unansweredQuestionDescription.setText(unansweredQuestion.getDescription());
    }
}
