public class Flight {
    private String flightNumber;
    private String destination;
    private int totalSeats;
    private int availableSeats;
	private boolean[] seatsAvailable;
    
    public Flight(String flightNumber, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.seatsAvailable = new boolean[totalSeats];
        this.availableSeats = totalSeats;
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

    public boolean bookSeat(int seatNumber) {
        if (seatNumber >= 0 && seatNumber < totalSeats && !seatsAvailable[seatNumber]) {
            seatsAvailable[seatNumber] = true;
            availableSeats--;
            return true;  
        }
        return false;  
    }

    public boolean bookSeat() {
        for (int i = 0; i < totalSeats; i++) {
            if (!seatsAvailable[i]) {  
                seatsAvailable[i] = true;
                availableSeats--;
                return true;  
            }
        }
        return false; 
    }

     public boolean cancelSeat(int seatNumber) {
        if (seatNumber >= 0 && seatNumber < totalSeats && seatsAvailable[seatNumber]) {
            seatsAvailable[seatNumber] = false; 
            availableSeats++; 
            return true;  
        }
        return false; 
    }
    
    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Available Seats: " + availableSeats);
    }
}