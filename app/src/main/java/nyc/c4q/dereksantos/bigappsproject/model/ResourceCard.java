package nyc.c4q.dereksantos.bigappsproject.model;

/**
 * Created by shannonalexander-navarro on 2/3/17.
 */

public class ResourceCard {
    private String resourceTitle;
    private String resourceDescription;
    private String resourcePhone;
    private String resourceAddress;

    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    public String getResourcePhone() {
        return resourcePhone;
    }

    public void setResourcePhone(String resourcePhone) {
        this.resourcePhone = resourcePhone;
    }

    public String getResourceAddress() {
        return resourceAddress;
    }

    public void setResourceAddress(String resourceAddress) {
        this.resourceAddress = resourceAddress;
    }
}
