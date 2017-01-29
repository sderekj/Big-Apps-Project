package nyc.c4q.dereksantos.bigappsproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private static int TAB_NUM = 3;
    private ArrayList<String> titles = new ArrayList<>();


    public ViewPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        titles.add("Questions");
        titles.add("Connect");
        titles.add("Resources");
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return QuestionsFragment.newInstance(0, "qFrag");
            case 1:
                return ConnectFragment.newInstance(1, "cFrag");
            case 2:
                return ResourcesFragment.newInstance(2,"rFrag");
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_NUM;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

}
