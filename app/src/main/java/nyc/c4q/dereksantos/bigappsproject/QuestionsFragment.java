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

public class QuestionsFragment extends Fragment {
    private String title;
    private int page;
    private static final String INT_TAG = "one";
    private static final String TITLE_TAG = "questionFrag";

    public static QuestionsFragment newInstance(int page, String title) {
        QuestionsFragment qFrag = new QuestionsFragment();
        Bundle bundleArgs = new Bundle();
        bundleArgs.putInt(INT_TAG, page);
        bundleArgs.putString(TITLE_TAG, title);
        qFrag.setArguments(bundleArgs);
        return qFrag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(INT_TAG, 1);
        title = getArguments().getString(TITLE_TAG);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.question_fragment, container, false);
        return view;
    }
}
