package nyc.c4q.dereksantos.bigappsproject;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SACC on 1/29/17.
 */

public class Question {

    @SerializedName("facilityname")
    private String title;

    @SerializedName("facilitystreetname")
    private String description;

    public Question(String title, String description) {
        this.title = title;
        this.description = description;
    }

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
}
