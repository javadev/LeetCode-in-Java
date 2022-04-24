package g1701_1800.s1701_average_waiting_time;

// #Medium #Array #Simulation #2022_04_24_Time_4_ms_(54.50%)_Space_89.2_MB_(91.50%)

public class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sumOfTime = 0;
        int preFinishTime = 0;
        for (int[] customer : customers) {
            preFinishTime = Math.max(customer[0], preFinishTime);
            sumOfTime += (preFinishTime + customer[1]) - customer[0];
            preFinishTime += customer[1];
        }
        return sumOfTime / customers.length;
    }
}
