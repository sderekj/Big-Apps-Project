package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.model.TipCard;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class ResourcesFragment extends Fragment {
    private int page;
    private String title;
    private static String INT_TAG = "zero";
    private static String TITLE_TAG = "rFrag";
    private RecyclerView tipRV;
    private TipAdapter tipAdapter;
    List<TipCard> tipCards = new ArrayList<>();

    public static Fragment newInstance(int page, String title) {
        ResourcesFragment resourcesFrag = new ResourcesFragment();
        Bundle bundleArgs = new Bundle();
        bundleArgs.putInt(INT_TAG, page);
        bundleArgs.putString(TITLE_TAG, title);
        resourcesFrag.setArguments(bundleArgs);
        return resourcesFrag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(INT_TAG, 0);
        title = getArguments().getString(TITLE_TAG);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.resource_fragment, container, false);

        tipRV = (RecyclerView) view.findViewById(R.id.tip_rv);
        tipRV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        tipAdapter = new TipAdapter(tipCards);
        tipRV.setAdapter(tipAdapter);
        return view;
    }
}
