package nyc.c4q.dereksantos.bigappsproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SACC on 1/29/17.
 */

public interface NycDataApi {

    @GET("resource/cw3p-q2v6.json")
    Call<List<DataResponse1>> getData1();

    @GET(" ")
    Call<DataRespone2> getData2();

}
