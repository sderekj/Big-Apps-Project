package nyc.c4q.dereksantos.bigappsproject.network;

import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.model.Resource;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SACC on 1/29/17.
 */

public class NycDataClient {
    private static final String API_URL = "https://data.cityofnewyork.us/";

    public static NycDataClient instance;

    private final NycDataApi api;

    public static NycDataClient getInstance() {
        if (instance == null) {
            instance = new NycDataClient();
        }

        return instance;
    }

    private NycDataClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(NycDataApi.class);
    }

    public Call<List<Resource>> getApiStuff() {
        return api.getData2();
    }
}