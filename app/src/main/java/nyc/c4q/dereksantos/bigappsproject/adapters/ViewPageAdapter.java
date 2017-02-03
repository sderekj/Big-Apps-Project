package nyc.c4q.dereksantos.bigappsproject.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import nyc.c4q.dereksantos.bigappsproject.view.ConnectFragment;
import nyc.c4q.dereksantos.bigappsproject.view.QuestionsFragment;
import nyc.c4q.dereksantos.bigappsproject.view.ResourcesFragment;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private static int TAB_NUM = 3;
    private ArrayList<String> titles = new ArrayList<>();


    public ViewPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        titles.add("Resources");
        titles.add("Questions");
        titles.add("Connect");

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return ResourcesFragment.newInstance(0, "rFrag");
            case 1:
                return QuestionsFragment.newInstance(1, "qFrag");
            case 2:
                return ConnectFragment.newInstance(2, "cFrag");
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
