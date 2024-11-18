import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class BookingSystem {
    public static void main(String[] args) {
        //variables
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> destinationList = new ArrayList<String>();
        int[] manifest = new int[151];

        // flight declrations
        Flight newYorkNewYork = new Flight (111, "New York", 25);
        Flight tokyoJapan = new Flight();
        Flight parisFrance = new Flight();

        //code here
        System.out.print("What is your destination?"); //Maybe make a print method for this???
        String destinationIn = scnr.nextLine();
        if (destinationList.contains(destinationIn)) {
            if (Flight.getAvailableSeats > 0) {
                System.out.print("Seat Available.");
            }
            else {
                System.out.print("Seat Unavailable. Try a different destination!");
            }
        }

    }
}
