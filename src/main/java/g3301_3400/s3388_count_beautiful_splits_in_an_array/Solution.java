package g3301_3400.s3388_count_beautiful_splits_in_an_array;

// #Medium #2024_12_15_Time_165_ms_(100.00%)_Space_266.1_MB_(100.00%)

public class Solution {
    public int beautifulSplits(int[] nums) {
        int n = nums.length;
        int[][] lcp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                if (nums[i] == nums[j]) {
                    lcp[i][j] = 1 + lcp[i + 1][j + 1];
                } else {
                    lcp[i][j] = 0;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (i > 0) {
                    int lcp1 = Math.min(Math.min(lcp[0][i], i), j - i);
                    int lcp2 = Math.min(Math.min(lcp[i][j], j - i), n - j);
                    if (lcp1 >= i || lcp2 >= j - i) {
                        ++res;
                    }
                }
            }
        }
        return res;
    }
}
