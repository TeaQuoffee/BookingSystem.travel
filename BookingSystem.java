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
        System.out.println("What is your destination?");
        System.out.println("______________\n\nNEW YORK\nTOKYO\nPARIS\n______________");       
        String destinationIn = scnr.nextLine();
        if (destinationIn .equals("NEW YORK")) {
            if (newYork.getAvailableSeats() > 0) {
                System.out.println("Seat Available.");
            }
            else {
                System.out.println("Seat Unavailable. Try a different destination!");
            }
        }
        if (destinationIn .equals("TOKYO")) {
            if (tokyo.getAvailableSeats() > 0) {
                System.out.println("Seat Available.");
            }
            else {
                System.out.println("Seat Unavailable. Try a different destination!");
            }
        }
        if (destinationIn .equals("PARIS")) {
            if (paris.getAvailableSeats() > 0) {
                System.out.println("Seat Available.");
            }
            else {
                System.out.println("Seat Unavailable. Try a different destination!");
            }
        }
        
        System.out.println("Would you like to purchase a ticket? Y/N");
        String purchanseAns = scnr.nextLine();
        if (purchanseAns .equals("Y")) ;   
            if(destinationList.contains(destinationIn) && destinationIn.equals("NEW YORK")) {
                newYork.displayFlightDetails();
            }
            else if(destinationList.contains(destinationIn) && destinationIn .equals("TOKYO")) {
                tokyo.displayFlightDetails();
            }
            else if (destinationIn.contains(destinationIn) && destinationIn .equals("PARIS")) {
                paris.displayFlightDetails();
            }                    

    }
}
