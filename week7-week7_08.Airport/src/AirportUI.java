
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class AirportUI {

    private final ArrayList<Plane> plane;
    private final ArrayList<Flight> flight;
    private final Scanner reader;

    public AirportUI(Scanner reader) {
        this.plane = new ArrayList<Plane>();
        this.flight = new ArrayList<Flight>();
        this.reader = reader;
    }

    /*this method starts the first part of the ui; the airport UI*/
    public void start() {
        airportPanel();
        flightService();
    }

    private void airportPanel() {
        while (true) {

            startStatements1();

            String command = reader.nextLine();
            command = cleanString(command);

            if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private void flightService() {

        while (true) {

            startStatements2();

            String command = reader.nextLine();
            command = cleanString(command);

            if (command.equals("1")) {
                for (Plane pl : plane) {
                    System.out.println(pl);
                }
            } else if (command.equals("2")) {
                for (Flight ff : flight) {
                    System.out.println(ff);
                }
            } else if (command.equals("3")) {
                onePlane();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private void startStatements1() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.println(">");
    }

    /*this method asks for the plane name and capacity form the user*/
    private void addPlane() {
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();
        planeID = cleanString(planeID);

        System.out.println("Give plane capacity: ");
        String planeCapacity = reader.nextLine();
        planeCapacity = cleanString(planeCapacity);

        int planeCap = Integer.parseInt(planeCapacity);

        Plane pln = new Plane(planeID, planeCap);

        this.plane.add(pln);
    }

    /*this method asks the user the plane id and then adds origin and destintion airport to it*/
    private void addFlight() {
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();
        planeID = cleanString(planeID);

        System.out.println("Give origin airport code: ");
        String origin = reader.nextLine();
        origin = cleanString(origin);

        System.out.println("Give destination airport code: ");
        String destination = reader.nextLine();
        destination = cleanString(destination);

        Plane pla = getPlane(planeID);

        Flight ff = new Flight(pla, origin, destination);
        this.flight.add(ff);
    }

    private Plane getPlane(String word) {
        for (Plane pl : plane) {
            if (pl.getName().equals(word)) {
                return pl;
            }
        }
        return null;
    }

    private void startStatements2() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.println("> 1");
    }

    //this methods prints the detail for a plane
    private void onePlane() {
        System.out.println("Give plane ID:");
        String planeID = reader.nextLine();
        planeID = cleanString(planeID);

        Plane pla = getPlane(planeID);

        System.out.println(pla);
    }

    private String cleanString(String word) {
        return word.trim().toLowerCase();
    }
}
