
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.

        Scanner reader = new Scanner(System.in);
        //Plane plane = new Plane();
        //Flight flight = new Flight();

        AirportUI uiAirport = new AirportUI(reader);
        uiAirport.start();
    }
}
