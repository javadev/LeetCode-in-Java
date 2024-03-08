package g0501_0600.s0507_perfect_number;

// #Easy #Math #2022_07_24_Time_2_ms_(80.46%)_Space_41.5_MB_(9.33%)

public class Solution {
    public boolean checkPerfectNumber(int num) {
        int s = 1;
        for (int sq = (int) Math.sqrt(num); sq > 1; sq--) {
            if (num % sq == 0) {
                s += sq + (num / sq);
            }
        }
        return num != 1 && s == num;
    }
}
