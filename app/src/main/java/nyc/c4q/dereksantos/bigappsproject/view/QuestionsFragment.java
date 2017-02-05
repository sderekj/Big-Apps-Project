package nyc.c4q.dereksantos.bigappsproject.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.adapters.QuestionsAdapter;
import nyc.c4q.dereksantos.bigappsproject.model.FarmerMarket;
import nyc.c4q.dereksantos.bigappsproject.network.NycDataClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class QuestionsFragment extends Fragment {
    private String title;
    private int page;
    private static final String INT_TAG = "one";
    private static final String TITLE_TAG = "questionFrag";
    private RecyclerView recyclerView;
    private NycDataClient nycDataClient;

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
        nycDataClient = NycDataClient.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.question_fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.questions_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new QuestionsAdapter());
//        fetchData();

        return view;
    }

    private void fetchData() {
        Call<List<FarmerMarket>> call = nycDataClient.getFoodAndNutritionData();
        call.enqueue(new Callback<List<FarmerMarket>>() {
            @Override
            public void onResponse(Call<List<FarmerMarket>> call, Response<List<FarmerMarket>> response) {
                List<FarmerMarket> list = response.body();
//                RecyclerView.Adapter adapter = new QuestionsAdapter(list);
//                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<FarmerMarket>> call, Throwable t) {

            }
        });
    }
}
