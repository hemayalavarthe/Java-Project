import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RailwayManagement{
    public static void main(String[] args) {
        // create list of trains
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Kochi Express", "Kochi", "Delhi", 1425));
        trains.add(new Train("Mumbai Express", "Mumbai", "Hyderabad", 1317));
        trains.add(new Train("Chennai Express", "Chennai", "Bangalore", 1210));
        trains.add(new Train("Rajdhani Express", "Delhi", "Kolkata", 1645));

        // filter trains by destination
        System.out.println("Trains to Delhi:");
        filterTrainsByDestination(trains, "Delhi").forEach(System.out::println);

        // filter trains by departure
        System.out.println("\nTrains from Delhi:");
        filterTrainsByDeparture(trains, "Delhi").forEach(System.out::println);
    }

    // filter trains by destination
    public static List<Train> filterTrainsByDestination(List<Train> trains, String destination) {
        return filterTrains(trains, t -> t.getDestination().equals(destination));
    }

    // filter trains by departure
    public static List<Train> filterTrainsByDeparture(List<Train> trains, String departure) {
        return filterTrains(trains, t -> t.getDeparture().equals(departure));
    }

    // filter trains using predicate
    public static List<Train> filterTrains(List<Train> trains, Predicate<Train> predicate) {
        List<Train> filteredTrains = new ArrayList<>();
        for (Train train : trains) {
            if (predicate.test(train)) {
                filteredTrains.add(train);
            }
        }
        return filteredTrains;
    }
}

// Train class
class Train {
    private String name;
    private String departure;
    private String destination;
    private int departureTime;

    public Train(String name, String departure, String destination, int departureTime) {
        this.name = name;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getName() {
        return name;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return String.format("\nTrain: %s, \nDeparture: %s, \nDestination: %s, \nDeparture Time: %d",
                name, departure, destination, departureTime);
    }
}