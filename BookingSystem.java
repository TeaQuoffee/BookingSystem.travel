import java.util.Scanner;
import java.util.ArrayList;

public class BookingSystem {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Passenger customer = new Passenger();
        ArrayList<String> destinationList = new ArrayList<String>();
        int seatLimit = 151;
        int i = 1;

        destinationList.add("NEW YORK");
        Flight newYork = new Flight("0001", "New York, USA", seatLimit);
        newYork.setAvailableSeats(3);

        destinationList.add("TOKYO");
        Flight tokyo = new Flight("0002", "Tokyo, Japan", seatLimit);
        tokyo.setAvailableSeats(0);

        destinationList.add("PARIS");
        Flight paris = new Flight("0003", "Paris, France", seatLimit);
        paris.setAvailableSeats(7);
        
        System.out.println("Welcome to TotallyNotDelta please enter your name: ");
        String name = scnr.nextLine();
        customer.addPass(name);
        
        if (customer.getPassengerId() != null) {
            System.out.println("Welcome back " + name + "! What can we do for you today?");
            System.out.println("1: [Book Flight]\n2: [Cancel Flight]");
        }

        if (scnr.nextLine().equals("Book Flight")){
            System.out.println("Welcome " + name +", Flying from Atlanta: what is your destination?");
            System.out.println("______________\n\nNEW YORK\nTOKYO\nPARIS\n______________");
            String destinationIn = scnr.nextLine();
            while(i > 0) {
                if (destinationIn.equals("NEW YORK")) {
                    if (newYork.getAvailableSeats() > 0) {
                        System.out.println("Seat Available.");
                        newYork.displayFlightDetails();
                        i--;
                    } else {
                        System.out.println("Seat Unavailable. Try a different destination!");
                        destinationIn = scnr.nextLine();
                    }
                } else if (destinationIn.equals("TOKYO")) {
                    if (tokyo.getAvailableSeats() > 0) {
                        System.out.println("Seat Available.");
                        tokyo.displayFlightDetails();
                        i--;
                    } else {
                        System.out.println("Seat Unavailable. Try a different destination!");      
                        destinationIn = scnr.nextLine();        
                    }
                } else if (destinationIn.equals("PARIS")) {
                    if (paris.getAvailableSeats() > 0) {
                        System.out.println("Seat Available.");
                        paris.displayFlightDetails();
                        i--;
                    } else {
                        System.out.println("Seat Unavailable. Try a different destination!");
                        destinationIn = scnr.nextLine();
                    }
                }
                else {
                    System.out.println(destinationIn + " does not exist or you may have mispelled your destination. Please Try again.");
                    destinationIn = scnr.nextLine();
                }
            }    
    
            
            // purchasing tickets    
            System.out.println("Would you like to purchase a ticket? Y/N");
            String purchaseAns = scnr.nextLine();
    
            if (purchaseAns.equals("Y")) {
                if (destinationIn.equals("NEW YORK")) {
                    System.out.println("Do you want to book a seat? Y/N");
                    String bookAns = scnr.nextLine();
                    if (bookAns.equals("Y")) {
                        if (newYork.bookSeat()) {
                            System.out.println("Seat booked successfully!");
                        } else {
                            System.out.println("Sorry, no seats are available for booking.");
                        }
                    }
                    
                }
                else if (destinationIn.equals("TOKYO")) {
                    System.out.println("Do you want to book a seat? Y/N");
                    String bookAns = scnr.nextLine();
                    if (bookAns.equals("Y")) {
                        if (tokyo.bookSeat()) {
                            System.out.println("Seat booked successfully!");
                        } else {
                            System.out.println("Sorry, no seats are available for booking.");
                        }
                    }
                }
                else if (destinationIn.equals("PARIS")) {
                    System.out.println("Do you want to book a seat? Y/N");
                    String bookAns = scnr.nextLine();
                    if (bookAns.equals("Y")) {
                        if (paris.bookSeat()) {
                            System.out.println("Seat booked successfully!");
                        } else {
                            System.out.println("Sorry, no seats are available for booking.");
                        }
                    }
                }
            }
            System.out.println("Thank you for using our system. Your flight from Atlanta to" + " " + destinationIn + " has been booked. Have a great day!");
    
        }
        else {
            System.out.println("Sorry to hear that. Cancelling your flight.");
            customer.removePass(name);
        }

        
    }
}
