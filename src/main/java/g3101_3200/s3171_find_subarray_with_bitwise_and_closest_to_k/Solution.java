package g3101_3200.s3171_find_subarray_with_bitwise_and_closest_to_k;

// #Hard #Array #Binary_Search #Bit_Manipulation #Segment_Tree
// #2024_06_06_Time_10_ms_(98.04%)_Space_56.3_MB_(79.06%)

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            res = Math.min(res, Math.abs(nums[i] - k));
            for (int j = i - 1; j >= 0 && (nums[j] & nums[i]) != nums[j]; j--) {
                nums[j] &= nums[i];
                res = Math.min(res, Math.abs(nums[j] - k));
            }
        }
        return res;
    }
}
