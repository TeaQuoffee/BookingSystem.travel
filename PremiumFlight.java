public class PremiumFlight extends Flight {
    private boolean hasPriorityBoarding;

    public PremiumFlight(String flightNumber, String destination, int totalSeats, boolean hasPriorityBoarding) {
        super(flightNumber, destination, totalSeats);
        this.hasPriorityBoarding = hasPriorityBoarding;
    }

    @Override
    public void displayFlightDetails() {
        super.displayFlightDetails();
        System.out.println("Priority Boarding: " + (hasPriorityBoarding ? "Yes" : "No"));
    }
}