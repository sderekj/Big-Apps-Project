package nyc.c4q.dereksantos.bigappsproject.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SACC on 2/4/17.
 */
public class FluVaccineLocation implements ApiResponse {

    @SerializedName("facility_name")
    private String title;

    @SerializedName("location_address")
    private String description;
    private String location_city;
    private String zip_code;
    private String phone;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation_city() {
        return location_city;
    }

    public void setLocation_city(String location_city) {
        this.location_city = location_city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
