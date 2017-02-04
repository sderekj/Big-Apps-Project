package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import nyc.c4q.dereksantos.bigappsproject.adapters.questionList.UnansweredQuestionListAdapter;

/**
 * Created by SACC on 2/3/17.
 */
public class UnansweredQuestionListActivity extends AppCompatActivity {

    private RecyclerView unansweredQuestionListRv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unanswered_question_list_layout);

        initRV();
    }

    private void initRV() {
        unansweredQuestionListRv = (RecyclerView) findViewById(R.id.unanswered_question_list_rv);
        unansweredQuestionListRv.setLayoutManager(new LinearLayoutManager(this));
        unansweredQuestionListRv.setAdapter(new UnansweredQuestionListAdapter());
    }
}
