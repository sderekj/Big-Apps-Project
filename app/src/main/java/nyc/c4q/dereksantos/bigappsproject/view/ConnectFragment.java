package nyc.c4q.dereksantos.bigappsproject.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.TabActivity;
import nyc.c4q.dereksantos.bigappsproject.adapters.ConnectAdapter;
import nyc.c4q.dereksantos.bigappsproject.model.ApiResponse;
import nyc.c4q.dereksantos.bigappsproject.model.FarmerMarket;
import nyc.c4q.dereksantos.bigappsproject.model.FluVaccineLocation;
import nyc.c4q.dereksantos.bigappsproject.model.LegalFacility;
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
    private TextView connectHeaderTextView;

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
        View view = inflater.inflate(R.layout.connect_fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.connect_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        connectHeaderTextView = (TextView) view.findViewById(R.id.connect_header_tv);

        String iconClicked = TabActivity.getIconClicked();
        fetchData(iconClicked);
        setHeaderText(iconClicked);

        return view;
    }

    private void setHeaderText(String iconClicked) {
        switch (iconClicked) {
            case "Food & Nutrition":
                connectHeaderTextView.setText("Connect with Local Farmers' Markets");
                break;
            case "Legal Help":
                connectHeaderTextView.setText("Connect with Local Legal Services");
                break;
            case "Healthcare":
                connectHeaderTextView.setText("Connect with Local Healthcare Facilities");
                break;
        }
    }

    private void fetchData(String iconClicked) {
        switch (iconClicked) {
            case "Food & Nutrition":
                Call<List<FarmerMarket>> call1 = nycDataClient.getFoodAndNutritionData();
                call1.enqueue(new Callback<List<FarmerMarket>>() {
                    @Override
                    public void onResponse(Call<List<FarmerMarket>> call, Response<List<FarmerMarket>> response) {
                        List<ApiResponse> list = new ArrayList<>();
                        list.addAll(response.body());
                        RecyclerView.Adapter adapter = new ConnectAdapter(list);
                        recyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<List<FarmerMarket>> call, Throwable t) {

                    }
                });
                break;
            case "Legal Help":
                Call<List<LegalFacility>> call2 = nycDataClient.getLegalData();
                call2.enqueue(new Callback<List<LegalFacility>>() {
                    @Override
                    public void onResponse(Call<List<LegalFacility>> call, Response<List<LegalFacility>> response) {
                        List<ApiResponse> list = new ArrayList<>();
                        list.addAll(response.body());
                        RecyclerView.Adapter adapter = new ConnectAdapter(list);
                        recyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<List<LegalFacility>> call, Throwable t) {

                    }
                });
                break;
            case "Healthcare":
                Call<List<FluVaccineLocation>> call3 = nycDataClient.getVaccineLocationData();
                call3.enqueue(new Callback<List<FluVaccineLocation>>() {
                    @Override
                    public void onResponse(Call<List<FluVaccineLocation>> call, Response<List<FluVaccineLocation>> response) {
                        List<ApiResponse> list = new ArrayList<>();
                        list.addAll(response.body());
                        RecyclerView.Adapter adapter = new ConnectAdapter(list);
                        recyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<List<FluVaccineLocation>> call, Throwable t) {

                    }
                });
                break;
        }
    }

}
