package g1201_1300.s1227_airplane_seat_assignment_probability;

// #Medium #Dynamic_Programming #Math #Brainteaser #Probability_and_Statistics
// #2022_03_12_Time_1_ms_(15.63%)_Space_41.7_MB_(12.95%)

public class Solution {
    public double nthPersonGetsNthSeat(int n) {
        if (n == 1) {
            return 1.0D;
        }
        return 0.5D;
    }
}
