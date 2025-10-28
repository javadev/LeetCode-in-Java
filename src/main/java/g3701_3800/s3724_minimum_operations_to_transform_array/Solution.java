package g3701_3800.s3724_minimum_operations_to_transform_array;

// #Medium #Biweekly_Contest_168 #2025_10_28_Time_2_ms_(100.00%)_Space_62.61_MB_(5.39%)

public class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int last = nums2[n];
        long steps = 1;
        long minDiffFromLast = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int min = Math.min(nums1[i], nums2[i]);
            int max = Math.max(nums1[i], nums2[i]);
            steps += Math.abs(max - min);
            if (minDiffFromLast > 0) {
                if (min <= last && last <= max) {
                    minDiffFromLast = 0;
                } else {
                    minDiffFromLast =
                            Math.min(
                                    minDiffFromLast,
                                    Math.min(Math.abs(min - last), Math.abs(max - last)));
                }
            }
        }
        return steps + minDiffFromLast;
    }
}
