public class Passenger {
    // variables
    private String name;
    private boolean seatStatus;
    private boolean randomSeat;

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

    public void setrandomSeat (int inSeat) {
        if (inSeat == 1) {
            randomSeat = true;
        }
        else {
            randomSeat = false;
        }       
    }

    // getters
    public boolean getSeatStatus(){
        return seatStatus;
    }

    public String getPassengerName() {
        return name;
    }

    public boolean getRandomSeat() {
        return randomSeat;    
    }
}
