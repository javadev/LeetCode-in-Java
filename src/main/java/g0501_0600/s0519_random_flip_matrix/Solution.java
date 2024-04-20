package g0501_0600.s0519_random_flip_matrix;

// #Medium #Hash_Table #Math #Randomized #Reservoir_Sampling
// #2022_07_25_Time_38_ms_(79.28%)_Space_50.4_MB_(71.17%)

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@SuppressWarnings("java:S2245")
public class Solution {
    private final int cols;
    private final int total;
    private final Random rand;
    private final Set<Integer> available;

    public Solution(int nRows, int nCols) {
        this.cols = nCols;
        this.rand = new Random();
        this.available = new HashSet<>();
        this.total = nRows * this.cols;
    }

    public int[] flip() {
        int x = rand.nextInt(this.total);
        while (available.contains(x)) {
            x = rand.nextInt(this.total);
        }

        this.available.add(x);
        return new int[] {x / this.cols, x % this.cols};
    }

    public void reset() {
        this.available.clear();
    }
}
