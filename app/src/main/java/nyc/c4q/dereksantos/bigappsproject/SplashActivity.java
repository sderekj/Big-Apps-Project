package nyc.c4q.dereksantos.bigappsproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by akashaarcher on 2/3/17.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                // Do something after 5s = 5000ms
                finish();
            }
        }, 5000);


    }

}