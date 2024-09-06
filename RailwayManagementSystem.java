import java.util.function.Function;

public class RailwayManagementSystem {
    public static void main(String[] args) {

        //Using Lambda Expressions
        Function<String, Boolean> checkEticketAvailability = 
            stationName -> stationName.equals("Chennai Central") || stationName.equals("Kochi Central");

        Function<Integer, Boolean> checkSeatAvailability = 
            numberOfSeats -> numberOfSeats<= 300;

        Function<Integer, Boolean> checkPrice = 
            price -> price <= 500;

        //Check for availability of e-ticket
        String stationName = "Chennai Central";
        System.out.println("Checking for availability of e-ticket at " + stationName );
        boolean isEticketAvailable = checkEticketAvailability.apply(stationName);
        System.out.println("Is e-ticket available? " + isEticketAvailable);

        //Check for availability of seats
        int numberOfSeats = 300;
        System.out.println("Checking for availability of " + numberOfSeats +" seats");
        boolean isSeatAvailable = checkSeatAvailability.apply(numberOfSeats);
        System.out.println("Are " + numberOfSeats + " seats available? " + isSeatAvailable);

        //Check for ticket price
        int price = 500;
        System.out.println("Checking for ticket price of " + price);
        boolean isPriceOK = checkPrice.apply(price);
        System.out.println("Is the price of the ticket " + price + " ok? " + isPriceOK);

    }
}