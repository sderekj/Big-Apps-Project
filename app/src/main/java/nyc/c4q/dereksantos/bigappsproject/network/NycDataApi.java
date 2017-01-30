package nyc.c4q.dereksantos.bigappsproject.network;

import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.DataResponse2;
import nyc.c4q.dereksantos.bigappsproject.DataResponse1;
import nyc.c4q.dereksantos.bigappsproject.Question;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SACC on 1/29/17.
 */

public interface NycDataApi {

    @GET(" ")
    Call<List<DataResponse1>> getData1();

    @GET("resource/cw3p-q2v6.json")
    Call<List<Question>> getData2();

}
