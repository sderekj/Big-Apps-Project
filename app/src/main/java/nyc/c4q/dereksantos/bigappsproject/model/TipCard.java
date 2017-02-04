package nyc.c4q.dereksantos.bigappsproject.model;

/**
 * Created by shannonalexander-navarro on 1/29/17.
 */
public class TipCard {

    private String factoid;

    public TipCard(String tip) {
        this.factoid = tip;
    }

    public String getFactoid() {
        return factoid;
    }

    public void setFactoid(String factoid) {
        this.factoid = factoid;
    }
}
