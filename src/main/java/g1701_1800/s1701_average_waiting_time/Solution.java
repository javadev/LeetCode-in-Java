package g1701_1800.s1701_average_waiting_time;

// #Medium #Array #Simulation #2022_04_24_Time_2_ms_(100.00%)_Space_94.5_MB_(56.50%)

public class Solution {
    public double averageWaitingTime(int[][] customers) {
        int ctime = 0;
        double ans = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i][0] >= ctime) {
                ctime = customers[i][0] + customers[i][1];
                ans = ans + (ctime - customers[i][0]);
            } else {
                ctime = ctime + customers[i][1];
                ans = ans + (ctime - customers[i][0]);
            }
        }
        return (double) Math.round(ans / customers.length * 100000d) / 100000d;
    }
}
