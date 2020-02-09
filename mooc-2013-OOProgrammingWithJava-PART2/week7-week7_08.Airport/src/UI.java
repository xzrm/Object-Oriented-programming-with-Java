
import java.util.*;

public class UI {

    private Scanner reader;
    private Planes planes;
    private Flights flights;

    public UI(Scanner reader, Planes airplanes, Flights flights) {
        this.reader = reader;
        this.planes = airplanes;
        this.flights = flights;

    }

    public void start() {
        this.AirportPanel();
        this.FlightService();
    }

    public void AirportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");

        while (true) {
            System.out.println("");
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");

            String userInput = reader.nextLine();
            if (userInput.equals("1")) {
                this.addAirplane();
            } else if (userInput.equals("2")) {
                this.addFlight();
            } else if (userInput.equals("x")) {
                System.out.println("");
                break;
            } else {
                System.out.println("unknown command");
            }
        }
    }

    public void FlightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        while (true) {
            System.out.println("");
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");

            String userInput = reader.nextLine();
            if (userInput.equals("1")) {
                this.printPlanes();
            } else if (userInput.equals("2")) {
                this.printFlights();
            } else if (userInput.equals("3")) {
                this.printPlaneInfo();
            } else if (userInput.equals("x")) {
                break;
            } else {
                System.out.println("unknown command");
            }
        }
    }

    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCap = Integer.parseInt(reader.nextLine());
        this.planes.addPlane(new Plane(planeID, planeCap));
    }

    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String depCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destCode = reader.nextLine();

        Plane planeObj = this.planes.searchPlaneObject(planeID);
        this.flights.addFlight(depCode, destCode, planeObj);
    }

    public void printPlanes() {
        planes.printPlanes();
    }

    public void printFlights() {
        flights.printFlights();
    }

    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        planes.printPlaneInfo(planeID);
    }

}
