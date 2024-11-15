import java.util.Objects;

public class Passenger {
    // variables
    private String name;
    private boolean seatStatus;

    // mutators
    public void setSeatStatus (int inSeat) {
        if (inSeat == 1) {
            seatStatus = true;
        }
        else {
            seatStatus = false;
        }
    }   

    public void setName (String inName) {
        name = inName;
    }

    // getters
    public boolean getSeatStatus(){
        return seatStatus;
    }

    public String getPassengerName() {
        return name;
    }
}
