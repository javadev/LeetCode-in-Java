package g3001_3100.s3026_maximum_good_subarray_sum;

// #Medium #Array #Hash_Table #Prefix_Sum #2024_03_01_Time_62_ms_(93.52%)_Space_56.2_MB_(95.77%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final int NO_GOOD_SUBARRAYS = 0;

    public long maximumSubarraySum(int[] input, int targetDifference) {
        Map<Integer, Long> valueToMinPrefixSum = new HashMap<>();
        long prefixSum = 0;
        long maxSubarraySum = Long.MIN_VALUE;
        for (int value : input) {
            if (valueToMinPrefixSum.containsKey(value + targetDifference)) {
                maxSubarraySum =
                        Math.max(
                                maxSubarraySum,
                                prefixSum
                                        + value
                                        - valueToMinPrefixSum.get(value + targetDifference));
            }
            if (valueToMinPrefixSum.containsKey(value - targetDifference)) {
                maxSubarraySum =
                        Math.max(
                                maxSubarraySum,
                                prefixSum
                                        + value
                                        - valueToMinPrefixSum.get(value - targetDifference));
            }
            if (!valueToMinPrefixSum.containsKey(value)
                    || valueToMinPrefixSum.get(value) > prefixSum) {
                valueToMinPrefixSum.put(value, prefixSum);
            }
            prefixSum += value;
        }
        return maxSubarraySum != Long.MIN_VALUE ? maxSubarraySum : NO_GOOD_SUBARRAYS;
    }
}
