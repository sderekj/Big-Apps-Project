package nyc.c4q.dereksantos.bigappsproject.model;

/**
 * Created by SACC on 1/29/17.
 */
public class LegalFacility implements ApiResponse {

    private String site_name;
    private String location_1_location;
    private String location_1_city;
    private String location_1_state;
    private String location_1_zip;
    private String contact_number;

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getLocation_1_location() {
        return location_1_location;
    }

    public void setLocation_1_location(String location_1_location) {
        this.location_1_location = location_1_location;
    }

    public String getLocation_1_city() {
        return location_1_city;
    }

    public void setLocation_1_city(String location_1_city) {
        this.location_1_city = location_1_city;
    }

    public String getLocation_1_state() {
        return location_1_state;
    }

    public void setLocation_1_state(String location_1_state) {
        this.location_1_state = location_1_state;
    }

    public String getLocation_1_zip() {
        return location_1_zip;
    }

    public void setLocation_1_zip(String location_1_zip) {
        this.location_1_zip = location_1_zip;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
