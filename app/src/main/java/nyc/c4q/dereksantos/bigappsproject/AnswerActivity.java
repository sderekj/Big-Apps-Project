package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.adapters.AnswerAdapter;

public class AnswerActivity extends AppCompatActivity {

    private RecyclerView answerRV;

    private TextView userQuestion;
    private TextView userQuestionDescription;
    private static final String DESCRIPTION_EXTRA = "this question description";


    private static final String TITLE_EXTRA = "this question title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        initViews();
        getQuestion();

        answerRV.setLayoutManager(new LinearLayoutManager(this));
        answerRV.setAdapter(new AnswerAdapter());
    }

    private void initViews() {
        userQuestion = (TextView) findViewById(R.id.question_TV);
        userQuestionDescription = (TextView) findViewById(R.id.question_description_extra_TV);
        answerRV = (RecyclerView) findViewById(R.id.answerRV);
    }

    private void getQuestion() {
        Bundle extras = getIntent().getExtras();
        String titleExtra = extras.getString(TITLE_EXTRA);
        userQuestion.setText(titleExtra);
        String descriptionExtra = extras.getString(DESCRIPTION_EXTRA);
        userQuestionDescription.setText(descriptionExtra);

    }
}
