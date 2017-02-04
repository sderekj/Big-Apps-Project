package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by SACC on 2/3/17.
 */
public class QuestionListActivity extends AppCompatActivity {

    private RecyclerView questionListRv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_list_layout);

        initRV();
    }

    private void initRV() {
        questionListRv = (RecyclerView) findViewById(R.id.question_list_rv);
        questionListRv.setLayoutManager(new LinearLayoutManager(this));
        questionListRv.setAdapter(new QuestionListAdapter());
    }
}
