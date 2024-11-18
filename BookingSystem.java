import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet; // implement 
import java.util.HashMap; // implement

public class BookingSystem {
    public static void main(String[] args) {
        //variables
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> destinationList = new ArrayList<String>();
        int seatLimit = 151;

        // flight declrations
        destinationList.add("NEW YORK");
        Flight newYork = new Flight("0001", "New York, USA", seatLimit);
        newYork.setAvailableSeats(25);

        destinationList.add("TOKYO");
        Flight tokyo = new Flight("0002", "Tokyo, Japan", seatLimit);
        tokyo.setAvailableSeats(0);

        destinationList.add("PARIS");
        Flight paris = new Flight("0003", "Paris, France", seatLimit);
        paris.setAvailableSeats(149);

        //code here
        System.out.println("What is your destination?"); //Maybe make a print method for this???
        System.out.println("NEW YORK\n TOKYO\n PARIS");       
        String destinationIn = scnr.nextLine();
        if (destinationIn == "New York") {
            if (newYork.getAvailableSeats() > 0) {
                System.out.print("Seat Available.");
            }
            else {
                System.out.print("Seat Unavailable. Try a different destination!");
            }
        }
        if (destinationIn == "TOKYO") {
            if (tokyo.getAvailableSeats() > 0) {
                System.out.print("Seat Available.");
            }
            else {
                System.out.print("Seat Unavailable. Try a different destination!");
            }
        }
        if (destinationIn == "PARIS") {
            if (paris.getAvailableSeats() > 0) {
                System.out.print("Seat Available.");
            }
            else {
                System.out.print("Seat Unavailable. Try a different destination!");
            }
        }        

    }
}
