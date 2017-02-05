package nyc.c4q.dereksantos.bigappsproject.network;

import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.model.FluVaccineLocation;
import nyc.c4q.dereksantos.bigappsproject.model.LegalFacility;
import nyc.c4q.dereksantos.bigappsproject.model.FarmerMarket;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SACC on 1/29/17.
 */

public interface NycDataApi {

    @GET("resource/tm2y-4xcp.json")
    Call<List<LegalFacility>> getLegalData();

    @GET("resource/cw3p-q2v6.json")
    Call<List<FarmerMarket>> getFoodAndNutritionData();

    @GET("resource/inaf-e6a5.json")
    Call<List<FluVaccineLocation>> getVaccineLocationData();

}
