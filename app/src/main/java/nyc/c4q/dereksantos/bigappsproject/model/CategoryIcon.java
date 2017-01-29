package nyc.c4q.dereksantos.bigappsproject.model;

import android.support.annotation.DrawableRes;

/**
 * Created by akashaarcher on 1/28/17.
 */

public class CategoryIcon {

    private Integer icon;
    private String title;

    public CategoryIcon(@DrawableRes Integer resource, String title) {
        this.icon = resource;
        this.title = title;
    }

    public Integer getImageResource() {
        return icon;
    }

    public void setImageResource(Integer icon) {
        this.icon = icon;
    }


    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
