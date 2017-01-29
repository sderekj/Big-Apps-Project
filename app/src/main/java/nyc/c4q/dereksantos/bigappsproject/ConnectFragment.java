package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class ConnectFragment extends Fragment {

    private String title;
    private int page;
    private static final String INT_TAG = "two";
    private static final String TITLE_TAG = "cFrag";

    public static Fragment newInstance(int page, String title) {
        ConnectFragment connectFrag = new ConnectFragment();
        Bundle bundleArgs = new Bundle();
        bundleArgs.putInt(INT_TAG, page);
        bundleArgs.putString(TITLE_TAG, title);
        connectFrag.setArguments(bundleArgs);
        return connectFrag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(INT_TAG, 2);
        title = getArguments().getString(TITLE_TAG);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.connect_fragment,container,false);
        return view;
    }
}
