import java.util.HashSet;
import java.util.Random;

public class GenerateManifest {
    private int [] newYorkManifest= new int [151];
    private int [] tokyoManifest= new int [151];
    private int [] parisManifest= new int [151];
    private Random rand = new Random();

    private void intitializeManifest (int[] manifest) {
        for (int i = 0; i < manifest.length; i++) {
            manifest[i] = 1;
        }
    }
    
    private void setRandomUnavailableSeats(int[] manifest, int count) {
        HashSet<Integer> unavailableIn = new HashSet<>();
        while (unavailableIn.size() < count) {
            int randIn = rand.nextInt(manifest.length);
            if (!unavailableIn.contains(randIn)) {
                manifest[randIn] = 0;
                unavailableIn.add(randIn);
            }
        }
    }

    // getters
    public void getManifestNY() {
        intitializeManifest(newYorkManifest);
        setRandomUnavailableSeats(newYorkManifest, 3);
    }
    
    public void getManifestTokyo() {
        intitializeManifest(tokyoManifest);
        setRandomUnavailableSeats(tokyoManifest, 0);
    }

    public void getManifestParis() {
        intitializeManifest(parisManifest);
        setRandomUnavailableSeats(parisManifest, 7);
    }
}
