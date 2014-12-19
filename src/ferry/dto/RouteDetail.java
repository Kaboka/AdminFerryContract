package ferry.dto;

import java.io.Serializable;

public class RouteDetail extends RouteIdentifier implements Serializable {

    private int duration;
    private HarbourSummary habourDestination;
    private HarbourSummary habourOrigin;
    private int basePrice;

    public RouteDetail() {
        super();
    }

    public RouteDetail(int duration, HarbourSummary habourDestination, HarbourSummary habourOrigin, int basePrice, int id) {
        super(id);
        this.duration = duration;
        this.habourDestination = habourDestination;
        this.habourOrigin = habourOrigin;
        this.basePrice = basePrice;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public HarbourSummary getHabourDestination() {
        return habourDestination;
    }

    public HarbourSummary setHabourDestination(HarbourSummary habourDestination) {
        return this.habourDestination = habourDestination;
    }

    public HarbourSummary getHabourOrigin() {
        return habourOrigin;
    }

    public void setHabourOrigin(HarbourSummary habourOrigin) {
        this.habourOrigin = habourOrigin;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
    
}
