package g3001_3100.s3095_shortest_subarray_with_or_at_least_k_i;

// #Easy #Array #Bit_Manipulation #Sliding_Window
// #2024_04_18_Time_1_ms_(98.94%)_Space_42.3_MB_(57.80%)

public class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int maxL = n + 1;
        int val;
        for (int i = 0; i < n; i++) {
            val = 0;
            for (int j = i; j < n; j++) {
                val |= nums[j];
                if (val >= k) {
                    maxL = Math.min(maxL, j - i + 1);
                }
            }
        }
        return (maxL == n + 1) ? -1 : maxL;
    }
}
