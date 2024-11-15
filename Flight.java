public class Flight {
    // Instance variables to store flight details
    private String flightNumber;
    private String destination;
    private int totalSeats;
    private int availableSeats;
    
    // Constructor to initialize the flight details
    public Flight(String flightNumber, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats; // Initially, all seats are available
    }
    
    // Getter and Setter methods for flight details
    public String getFlightNumber() {
        return flightNumber;
    }
    
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public int getTotalSeats() {
        return totalSeats;
    }
    
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    
    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Method to book a seat on the flight
    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--; // Decrease available seats by 1 when booking
            System.out.println("Seat booked successfully on flight " + flightNumber);
            return true;
        } else {
            System.out.println("No available seats on flight " + flightNumber);
            return false;
        }
    }

    // Method to cancel a booking (increases available seats)
    public void cancelBooking() {
        if (availableSeats < totalSeats) {
            availableSeats++; // Increase available seats by 1
            System.out.println("Booking canceled successfully on flight " + flightNumber);
        } else {
            System.out.println("No bookings to cancel on flight " + flightNumber);
        }
    }

    // Method to display flight details
    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Available Seats: " + availableSeats);
    }
}