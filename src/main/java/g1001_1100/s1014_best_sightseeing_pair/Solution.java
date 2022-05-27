package g1001_1100.s1014_best_sightseeing_pair;

// #Medium #Array #Dynamic_Programming #Dynamic_Programming_I_Day_7
// #2022_02_25_Time_2_ms_(99.86%)_Space_51.3_MB_(73.75%)

public class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int bestPrevious = values[0];
        int maxSum = 0;
        for (int i = 1; i < values.length; ++i) {
            maxSum = Math.max(maxSum, bestPrevious + values[i] - i);
            bestPrevious = Math.max(bestPrevious, values[i] + i);
        }
        return maxSum;
    }
}
