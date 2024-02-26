package g2901_3000.s2968_apply_operations_to_maximize_frequency_score;

// #Hard #Array #Sorting #Binary_Search #Prefix_Sum #Sliding_Window
// #2024_01_16_Time_27_ms_(78.37%)_Space_55.8_MB_(53.47%)

import java.util.Arrays;

public class Solution {
    public int maxFrequencyScore(int[] nums, long k) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int start = 0;
        int end = 1;
        int out = 1;
        while (end < n) {
            end++;
            int mid = (start + end) / 2;
            long target = nums[mid];
            long cost =
                    (target * (mid - start) - (prefixSum[mid] - prefixSum[start]))
                            + (prefixSum[end] - prefixSum[mid] - target * (end - mid));
            while (start < end && cost > k) {
                start++;
                mid = (start + end) / 2;
                target = nums[mid];
                cost =
                        (target * (mid - start) - (prefixSum[mid] - prefixSum[start]))
                                + (prefixSum[end] - prefixSum[mid] - target * (end - mid));
            }
            out = Math.max(out, end - start);
        }
        return out;
    }
}
