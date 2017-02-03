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
import nyc.c4q.dereksantos.bigappsproject.adapters.ConnectAdapter;
import nyc.c4q.dereksantos.bigappsproject.model.Resource;
import nyc.c4q.dereksantos.bigappsproject.network.NycDataClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class ConnectFragment extends Fragment {

    private String title;
    private int page;
    private static final String INT_TAG = "two";
    private static final String TITLE_TAG = "cFrag";
    private RecyclerView recyclerView;
    private NycDataClient nycDataClient;

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
        nycDataClient = NycDataClient.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.connect_fragment,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.connect_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        fetchData();
        return view;
    }

    private void fetchData() {
        Call<List<Resource>> call = nycDataClient.getApiStuff();
        call.enqueue(new Callback<List<Resource>>() {
            @Override
            public void onResponse(Call<List<Resource>> call, Response<List<Resource>> response) {
                List<Resource> list = response.body();
                RecyclerView.Adapter adapter = new ConnectAdapter(list);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Resource>> call, Throwable t) {

            }
        });
    }
}
