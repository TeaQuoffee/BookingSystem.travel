import java.util.HashMap;
import java.util.Random;
import java.util.HashSet;

public class Passenger {
    // variables
    private String name;
    private boolean seatStatus;
    private boolean randomSeat;
    private HashMap<String,String> passId = new HashMap<String, String>();
     
    // mutators
    public void setpassId(HashMap<String, String> passId) {
        this.passId = passId;
    }

    public void populateManifest() {
        passId.put("Jay Tran", "000001");
        passId.put("Luke Liu", "000002");
    }

    public void addPass(String key) {
        Random rand = new Random();
        HashSet<Integer> usedDigits = new HashSet<>();
        StringBuilder number = new StringBuilder();
        
        while (number.length() < 6) {
            int digit = rand.nextInt(10);
            if (!usedDigits.contains(digit)) {
                usedDigits.add(digit);
                number.append(digit);
            }
        }
        passId.put(key, number.toString());
    }

    public void removePass(String key) {
        passId.remove(key);
    }

    public void setSeatStatus (int inSeat) {
        if (inSeat == 1) {
            seatStatus = true;
        }
        else {
            seatStatus = false;
        }
    }   

    public void setPassengerName (String inName) {
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
    public HashMap<String, String> getPassengerId () {
        return passId;
    }
    
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
