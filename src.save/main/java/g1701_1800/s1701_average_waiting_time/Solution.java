package g1701_1800.s1701_average_waiting_time;

// #Medium #Array #Simulation #2022_04_24_Time_2_ms_(100.00%)_Space_94.5_MB_(56.50%)

public class Solution {
    public double averageWaitingTime(int[][] customers) {
        int ctime = 0;
        double ans = 0;
        for (int[] customer : customers) {
            if (customer[0] >= ctime) {
                ctime = customer[0] + customer[1];
                ans = ans + (ctime - customer[0]);
            } else {
                ctime = ctime + customer[1];
                ans = ans + (ctime - customer[0]);
            }
        }
        return Math.round(ans / customers.length * 100000d) / 100000d;
    }
}
