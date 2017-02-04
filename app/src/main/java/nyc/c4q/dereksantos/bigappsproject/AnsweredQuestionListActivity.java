package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import nyc.c4q.dereksantos.bigappsproject.adapters.questionList.AnsweredQuestionListAdapter;

/**
 * Created by SACC on 2/4/17.
 */
public class AnsweredQuestionListActivity extends AppCompatActivity {

    private RecyclerView answeredQuestionListRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answered_question_list_layout);

        initRV();
    }

    private void initRV() {
        answeredQuestionListRv = (RecyclerView) findViewById(R.id.answered_question_list_rv);
        answeredQuestionListRv.setLayoutManager(new LinearLayoutManager(this));
        answeredQuestionListRv.setAdapter(new AnsweredQuestionListAdapter());
    }
}
