package g1101_1200.s1109_corporate_flight_bookings;

// #Medium #Array #Prefix_Sum #2023_06_01_Time_2_ms_(100.00%)_Space_55.6_MB_(95.36%)

public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ret = new int[n];
        for (int[] booking : bookings) {
            ret[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                ret[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; ++i) {
            ret[i] += ret[i - 1];
        }
        return ret;
    }
}
