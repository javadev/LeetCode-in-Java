package g1101_1200.s1109_corporate_flight_bookings;

// #Medium #Array #Prefix_Sum #2022_03_01_Time_3_ms_(87.75%)_Space_81.6_MB_(55.26%)

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
