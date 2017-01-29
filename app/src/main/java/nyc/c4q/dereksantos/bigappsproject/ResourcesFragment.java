package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class ResourcesFragment extends Fragment {
    private int page;
    private String title;
    private static String INT_TAG = "two";
    private static String TITLE_TAG = "rFrag";

    public static Fragment newInstance(int page, String title) {
        ResourcesFragment resourcesFrag = new ResourcesFragment();
        Bundle bundleArgs = new Bundle();
        bundleArgs.putInt(INT_TAG, page);
        bundleArgs.putString(TITLE_TAG, title);
        resourcesFrag.setArguments(bundleArgs);
        return resourcesFrag;
    }
}
