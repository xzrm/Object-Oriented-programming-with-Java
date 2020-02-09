
import java.util.*;

public class RingingCentre {

    private HashMap<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();

    }

    public void observe(Bird bird, String place) {
        if (this.observations.containsKey(bird)) {
            this.observations.get(bird).add(place);
        } else {
            this.observations.put(bird, new ArrayList<String>());
            this.observations.get(bird).add(place);
        }

    }

    public void observations(Bird bird) {
        if (this.observations.get(bird) == null) {
            System.out.println(bird.toString() + " observations: 0");
        } else {
            int numObservations = this.observations.get(bird).size();
            System.out.println(bird + " observations: " + numObservations);
            for (String s : this.observations.get(bird)) {
                System.out.println(s);
            }
        }
    }

}
