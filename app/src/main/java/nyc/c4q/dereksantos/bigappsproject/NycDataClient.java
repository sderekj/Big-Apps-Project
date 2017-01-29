package nyc.c4q.dereksantos.bigappsproject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SACC on 1/29/17.
 */

public class NycDataClient {

    private static final String API_URL = "https://data.cityofnewyork.us/";

    private final NycDataApi api;

    private NycDataClient(NycDataApi api) { this.api = api; }

    public static NycDataClient getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NycDataApi api = retrofit.create(NycDataApi.class);

        return new NycDataClient(api);
    }
}