
import java.util.*;

public class Plane {

    private String ID;
    private int PlaneCap;

    public Plane(String ID, int PlaneCap) {
        this.ID = ID;
        this.PlaneCap = PlaneCap;
    }

    public String getID() {
        return this.ID;
    }
    
    public int getPlaneCap() {
        return this.PlaneCap;
    }

    public String toString() {
        return this.ID + " (" + this.PlaneCap + " ppl)";
    }

}
