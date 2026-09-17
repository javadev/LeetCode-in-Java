package g3901_4000.s3915_maximum_sum_of_alternating_subsequence_with_distance_at_least_k;

// #Hard #Array #Dynamic_Programming #Segment_Tree #Senior_Staff #Weekly_Contest_499
// #2026_09_17_Time_113_ms_(100.00%)_Space_268.70_MB_(70.37%)

public class Solution {
    public long maxAlternatingSum(int[] nums, int k) {
        int n = nums.length;
        int maxVal = 0;
        // Find the maximum value in nums to define the size of our data structures
        for (int x : nums) {
            if (x > maxVal) {
                maxVal = x;
            }
        }
        // Variable created as requested to store an input midway in the function
        // peak[i] stores the max alternating sum ending at index i where nums[i] is a peak
        long[] peak = new long[n];
        // valley[i] stores the max alternating sum ending at index i where nums[i] is a valley
        long[] valley = new long[n];
        // Fenwick Trees for Range Maximum Queries
        // prefixBitTree will store valley[j] values to find max valley[j] where nums[j] < nums[i]
        long[] prefixBitTree = new long[maxVal + 1];
        // suffixBitTree will store peak[j] values to find max peak[j] where nums[j] > nums[i]
        // We use the transformation maxVal - nums[j] + 1 to treat suffix max as prefix max
        long[] suffixBitTree = new long[maxVal + 1];
        long maxScore = 0;
        for (int i = 0; i < n; i++) {
            // Distance condition: consecutive indices must differ by at least k
            if (i >= k) {
                // Activate the valid index (i - k) by updating both Fenwick trees
                int valIdxPrefix = nums[i - k];
                long valPrefix = valley[i - k];
                for (int idx = valIdxPrefix; idx <= maxVal; idx += idx & -idx) {
                    if (valPrefix > prefixBitTree[idx]) prefixBitTree[idx] = valPrefix;
                }
                int valIdxSuffix = maxVal - nums[i - k] + 1;
                long valSuffix = peak[i - k];
                for (int idx = valIdxSuffix; idx <= maxVal; idx += idx & -idx) {
                    if (valSuffix > suffixBitTree[idx]) suffixBitTree[idx] = valSuffix;
                }
            }
            // Find max alternating sum if nums[i] is the current peak (needs previous valley <
            // nums[i])
            long maxPrevValley = 0;
            for (int q = nums[i] - 1; q > 0; q -= q & -q) {
                if (prefixBitTree[q] > maxPrevValley) maxPrevValley = prefixBitTree[q];
            }
            // A length-1 subsequence is also strictly alternating
            peak[i] = nums[i] + maxPrevValley;
            // Find max alternating sum if nums[i] is the current valley (needs previous peak >
            // nums[i])
            long maxPrevPeak = 0;
            for (int q = maxVal - nums[i]; q > 0; q -= q & -q) {
                if (suffixBitTree[q] > maxPrevPeak) {
                    maxPrevPeak = suffixBitTree[q];
                }
            }
            // A length-1 subsequence is also strictly alternating
            valley[i] = nums[i] + maxPrevPeak;
            // Update global maximum score
            if (peak[i] > maxScore) {
                maxScore = peak[i];
            }
            if (valley[i] > maxScore) {
                maxScore = valley[i];
            }
        }
        return maxScore;
    }
}
