
import java.util.*;

public class Bird {

    private HashMap<String, String> latin;
    private HashMap<String, Integer> observations;

    public Bird() {
        this.latin = new HashMap<String, String>();
        this.observations = new HashMap<String, Integer>();
    }

    public void Add(String name, String latinName) {
        if (!latin.keySet().contains(name)) {
            this.latin.put(name, latinName);
            this.observations.put(name, 0);
        }
    }

    public void Observation(String name) {
        if (latin.keySet().contains(name)) {
            int numObserv = this.observations.get(name);
            numObserv ++;
            this.observations.put(name, numObserv);
        }else{
            System.out.println("Is not a bird");
        }
    }
    
    public void Statistics(){
        for(String bird: latin.keySet()){
            System.out.println(bird + " (" + latin.get(bird) + "): " + observations.get(bird) + " observations");
        }
    }
    
    public void Show(String bird){
        System.out.println(bird + " (" + latin.get(bird) + "): " + observations.get(bird) + " observations");
    }
    
    
}
