package g1501_1600.s1503_last_moment_before_all_ants_fall_out_of_a_plank;

// #Medium #Array #Simulation #Brainteaser #2022_04_07_Time_1_ms_(81.72%)_Space_53.9_MB_(54.84%)

public class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int highestLeft = 0;
        int smallestRight = Integer.MAX_VALUE;
        for (int i = 0; i <= n + 1; i++) {
            if (i < left.length && left[i] > highestLeft) {
                highestLeft = left[i];
            }
            if (i < right.length && right[i] < smallestRight) {
                smallestRight = right[i];
            }
        }
        if (left.length != 0 && right.length == 0) {
            return highestLeft;
        }
        if (right.length != 0 && left.length == 0) {
            return Math.abs(smallestRight - n);
        }
        return Math.max(highestLeft, Math.abs(smallestRight - n));
    }
}
