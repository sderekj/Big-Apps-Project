package nyc.c4q.dereksantos.bigappsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    View view;

    private RecyclerView iconRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.activity_main);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TabActivity.class);
                startActivity(intent);
            }
        });

        iconRv = (RecyclerView) findViewById(R.id.icon_rv);
        iconRv.setLayoutManager(new GridLayoutManager(this,2));
        iconRv.setAdapter(new QuestionIconAdapter());
    }
}
