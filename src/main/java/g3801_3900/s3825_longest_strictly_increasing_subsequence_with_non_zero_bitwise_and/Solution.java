package g3801_3900.s3825_longest_strictly_increasing_subsequence_with_non_zero_bitwise_and;

// #Medium #Array #Binary_Search #Bit_Manipulation #Enumeration #Staff #Biweekly_Contest_175
// #2026_06_09_Time_327_ms_(92.65%)_Space_111.14_MB_(76.47%)

public class Solution {
    private int lis(int[] nums, int n) {
        int[] tails = new int[n];
        int sz = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int l = 0;
            int r = sz;
            while (l < r) {
                int m = (l + r) >>> 1;
                if (tails[m] >= x) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            tails[l] = x;
            if (l == sz) {
                sz++;
            }
        }
        return sz;
    }

    public int longestSubsequence(int[] nums) {
        final int maxbits = 32;
        int result = 0;
        int n = nums.length;
        int[] buf = new int[n];
        for (int bit = 0; bit < maxbits; bit++) {
            int m = 0;
            for (int x : nums) {
                if (((x >> bit) & 1) != 0) {
                    buf[m++] = x;
                }
            }
            result = Math.max(result, lis(buf, m));
        }
        return result;
    }
}
