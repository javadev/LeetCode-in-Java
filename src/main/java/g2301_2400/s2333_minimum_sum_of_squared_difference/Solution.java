package g2301_2400.s2333_minimum_sum_of_squared_difference;

// #Medium #Array #Math #Sorting #Heap_Priority_Queue
// #2022_07_12_Time_15_ms_(95.13%)_Space_106.4_MB_(46.91%)

public class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long minSumSquare = 0;
        int[] diffs = new int[100_001];
        long totalDiff = 0;
        long kSum = (long) k1 + k2;
        int currentDiff;
        int maxDiff = 0;
        for (int i = 0; i < nums1.length; i++) {
            // get current diff.
            currentDiff = Math.abs(nums1[i] - nums2[i]);
            // if current diff > 0, count/store it. If not,then ignore it.
            if (currentDiff > 0) {
                totalDiff += currentDiff;
                diffs[currentDiff]++;
                maxDiff = Math.max(maxDiff, currentDiff);
            }
        }
        // if kSum (k1 + k2) < totalDifferences, it means we can make all numbers/differences 0s
        if (totalDiff <= kSum) {
            return 0;
        }
        // starting from the back, from the highest difference, lower that group one by one to the
        // previous group.
        // we need to make all n diffs to n-1, then n-2, as long as kSum allows it.
        for (int i = maxDiff; i > 0 && kSum > 0; i--) {
            if (diffs[i] > 0) {
                // if current group has more differences than the totalK, we can only move k of them
                // to the lower level.
                if (diffs[i] >= kSum) {
                    diffs[i] -= kSum;
                    diffs[i - 1] += kSum;
                    kSum = 0;
                } else {
                    // else, we can make this whole group one level lower.
                    diffs[i - 1] += diffs[i];
                    kSum -= diffs[i];
                    diffs[i] = 0;
                }
            }
        }
        for (int i = 0; i <= maxDiff; i++) {
            if (diffs[i] > 0) {
                minSumSquare += (long) (Math.pow(i, 2)) * diffs[i];
            }
        }
        return minSumSquare;
    }
}
