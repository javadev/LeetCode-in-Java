package g2701_2800.s2739_total_distance_traveled;

// #Easy #Math #Simulation #2023_09_23_Time_4_ms_(100.00%)_Space_43.3_MB_(10.42%)

public class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int transferableTimes = (mainTank - 1) / 4;
        int transferredLiters = Math.min(transferableTimes, additionalTank);
        return (mainTank + transferredLiters) * 10;
    }
}
