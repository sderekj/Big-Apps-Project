package nyc.c4q.dereksantos.bigappsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import nyc.c4q.dereksantos.bigappsproject.adapters.AnswerAdapter;

public class AnswerActivity extends AppCompatActivity {

    private RecyclerView answerRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerRV = (RecyclerView) findViewById(R.id.answerRV);
        answerRV.setLayoutManager(new LinearLayoutManager(this));
        answerRV.setAdapter(new AnswerAdapter());
    }
}
