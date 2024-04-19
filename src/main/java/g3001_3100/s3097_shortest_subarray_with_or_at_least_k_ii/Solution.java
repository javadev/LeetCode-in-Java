package g3001_3100.s3097_shortest_subarray_with_or_at_least_k_ii;

// #Medium #Array #Bit_Manipulation #Sliding_Window
// #2024_04_19_Time_7_ms_(98.43%)_Space_70.2_MB_(74.25%)

public class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        if (nums[0] >= k) {
            return 1;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (nums[i] >= k) {
                return 1;
            }
            for (int j = i - 1; j >= 0 && (nums[i] | nums[j]) != nums[j]; j--) {
                nums[j] |= nums[i];
                if (nums[j] >= k) {
                    res = Math.min(res, i - j + 1);
                }
            }
        }
        if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
    }
}
