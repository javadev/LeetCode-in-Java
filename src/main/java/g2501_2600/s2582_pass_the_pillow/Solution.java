package g2501_2600.s2582_pass_the_pillow;

// #Easy #Math #Simulation #2023_08_22_Time_0_ms_(100.00%)_Space_39.3_MB_(46.65%)

public class Solution {
    public int passThePillow(int n, int time) {
        int roundTrip = (n - 1) * 2;
        time = time % roundTrip;
        if (time < n) {
            return time + 1;
        }
        return n - (time - n + 1);
    }
}
