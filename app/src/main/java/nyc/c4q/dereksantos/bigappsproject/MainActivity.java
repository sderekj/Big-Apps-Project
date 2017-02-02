package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    CategoryIconFragment iconFragment = new CategoryIconFragment();
    UserProfileFragment profileFragment = new UserProfileFragment();
    SearchFragment searchFragment = new SearchFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction homeFragTransaction = getSupportFragmentManager().beginTransaction();
        homeFragTransaction.replace(R.id.main_container, iconFragment);
        homeFragTransaction.commit();

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNav.setPadding(0, 0, 0, 0);
        bottomNav.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:
                                FragmentTransaction homeFragTransaction = getSupportFragmentManager().beginTransaction();
                                homeFragTransaction.replace(R.id.main_container, iconFragment);
                                homeFragTransaction.commit();
                                break;

                            case R.id.action_search:
                                FragmentTransaction searchFragTransaction = getSupportFragmentManager().beginTransaction();
                                searchFragTransaction.replace(R.id.main_container, searchFragment);
                                searchFragTransaction.commit();
                                break;

                            case R.id.action_profile:
                                FragmentTransaction profileFragTransaction = getSupportFragmentManager().beginTransaction();
                                profileFragTransaction.replace(R.id.main_container, profileFragment);
                                profileFragTransaction.commit();
                                break;
                        }
                        return true;
                    }
                }
        );

    }
}
