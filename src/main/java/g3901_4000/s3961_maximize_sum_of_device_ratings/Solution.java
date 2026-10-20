package g3901_4000.s3961_maximize_sum_of_device_ratings;

// #Medium #Array #Sorting #Greedy #Matrix #Staff #Weekly_Contest_506
// #2026_10_20_Time_6_ms_(98.67%)_Space_209.82_MB_(68.00%)

public class Solution {
    public long maxRatings(int[][] nums) {
        int n = nums[0].length;
        if (n == 1) {
            long totalSum = 0;
            for (int[] num : nums) {
                totalSum += num[0];
            }
            return totalSum;
        }
        long sumM2 = 0;
        int min1Global = Integer.MAX_VALUE;
        int min2Global = Integer.MAX_VALUE;
        for (int[] num : nums) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int val = num[j];
                if (val < min1) {
                    min2 = min1;
                    min1 = val;
                } else if (val < min2) {
                    min2 = val;
                }
            }
            sumM2 += min2;
            if (min1 < min1Global) {
                min1Global = min1;
            }
            if (min2 < min2Global) {
                min2Global = min2;
            }
        }
        return min1Global + sumM2 - min2Global;
    }
}
