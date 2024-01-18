package g2601_2700.s2651_calculate_delayed_arrival_time;

// #Easy #Math #2023_09_06_Time_0_ms_(100.00%)_Space_39.6_MB_(47.38%)

public class Solution {
    public int findDelayedArrivalTime(int ar, int de) {
        if (ar + de >= 24) {
            return Math.abs(ar + de - 24);
        }
        return ar + de;
    }
}
