package Lab8;
import java.util.ArrayList;
import java.util.Scanner;

class FlightDest {
    private String flightNo;
    private String destination;

    public FlightDest(String flightNo, String destination) {
        this.flightNo = flightNo;
        this.destination = destination;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

class FlightInfo {
    private ArrayList<FlightDest> flightDestList;

    public FlightInfo() {
        flightDestList = new ArrayList<>();
    }

    public void addFlightDestPair(String fNo, String dest) {
        FlightDest flightDest = new FlightDest(fNo, dest);
        flightDestList.add(flightDest);
    }

    public ArrayList<String> getFlightsDest(String dest) {
        ArrayList<String> flightsForDestination = new ArrayList<>();
        for (FlightDest flightDest : flightDestList) {
            if (flightDest.getDestination().equals(dest)) {
                flightsForDestination.add(flightDest.getFlightNo());
            }
        }
        return flightsForDestination;
    }
}

public class Pgm1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FlightInfo info = new FlightInfo();

        System.out.println("Enter number of flights:");
        int inp = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < inp; i++) {
            System.out.println("Enter flight number:");
            String num = sc.nextLine();

            System.out.println("Enter destination:");
            String des = sc.nextLine();

            info.addFlightDestPair(num, des);
        }

        System.out.println("Enter destination to get flights:");
        String destinationToGetFlights = sc.nextLine();

        ArrayList<String> flights = info.getFlightsDest(destinationToGetFlights);
        System.out.println("Flights for destination " + destinationToGetFlights + ": " + flights);

        sc.close();
    }
}
