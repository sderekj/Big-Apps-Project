package nyc.c4q.dereksantos.bigappsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class CategoryIconActivity extends AppCompatActivity {

    private RecyclerView iconRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iconRv = (RecyclerView) findViewById(R.id.icon_rv);
        iconRv.setLayoutManager(new GridLayoutManager(this,2));
        iconRv.setAdapter(new CategoryIconAdapter());
    }
}
