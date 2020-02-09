import java.util.*;

public class Flights {
    private HashMap<String, Plane> flights;
    
    public Flights() {
        this.flights = new HashMap<String, Plane>();
    }
    
    public String concatFlightInfo(String flightDep, String flightDest){
        return flightDep + "-" + flightDest;
    }
    
    public void addFlight(String flightDep, String flightDest, Plane planeObj){
        String concatString = this.concatFlightInfo(flightDep, flightDest);
        this.flights.put(concatString, planeObj);
    }
    
    public void printFlights(){
        for(String dest: flights.keySet()){
            System.out.println(this.flights.get(dest) + " ("+ dest + ")");
//            System.out.println(plane.toString() + " (" + this.flights.get(plane) + ")");
        }
    }
    
}
