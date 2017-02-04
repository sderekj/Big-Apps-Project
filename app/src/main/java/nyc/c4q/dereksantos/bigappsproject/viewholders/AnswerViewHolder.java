package nyc.c4q.dereksantos.bigappsproject.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.Answer;

/**
 * Created by shannonalexander-navarro on 2/4/17.
 */

public class AnswerViewHolder extends RecyclerView.ViewHolder {

    private TextView response;
    private TextView timeStamp;
    private TextView userName;

    public AnswerViewHolder(View itemView) {
        super(itemView);
        initViews();
    }

    public void bind(Answer answerList) {
        response.setText(answerList.getResponse());
        timeStamp.setText(answerList.getTimeStamp());
        userName.setText(answerList.getUserName());
    }

    private void initViews(){
        response = (TextView) itemView.findViewById(R.id.responseTV);
        timeStamp = (TextView) itemView.findViewById(R.id.response_timeStampTV);
        userName = (TextView) itemView.findViewById(R.id.response_userNameTV);
    }
}
