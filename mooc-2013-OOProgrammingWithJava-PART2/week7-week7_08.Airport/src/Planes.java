
import java.util.*;

public class Planes {

    private ArrayList<Plane> PlaneList;

    public Planes() {
        this.PlaneList = new ArrayList<Plane>();
    }

    public void addPlane(Plane planeObj) {
        this.PlaneList.add(planeObj);
    }

    public void printPlaneInfo(String ID) {
        for (Plane plane : this.PlaneList) {
            if (plane.getID().equals(ID)) {
                System.out.println(plane);;
            }
        }
    }

    public Plane searchPlaneObject(String ID) {
        for (Plane plane : this.PlaneList) {
            if (plane.getID().equals(ID)) {
                return plane;
            }
        }
        return null;
    }

    public void printPlanes() {
        for (Plane plane : this.PlaneList) {
            System.out.println(plane);;
        }
    }
}
