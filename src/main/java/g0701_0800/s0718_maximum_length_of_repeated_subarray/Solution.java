package g0701_0800.s0718_maximum_length_of_repeated_subarray;

// #Medium #Array #Dynamic_Programming #Binary_Search #Sliding_Window #Hash_Function #Rolling_Hash
// #2022_03_24_Time_58_ms_(77.21%)_Space_78.8_MB_(32.62%)

public class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int max = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
