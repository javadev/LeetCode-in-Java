package g3901_4000.s3911_k_th_smallest_remaining_even_integer_in_subarray_queries;

// #Hard #Array #Binary_Search #Senior_Staff #Biweekly_Contest_181
// #2026_09_17_Time_5_ms_(100.00%)_Space_215.84_MB_(25.00%)

public class Solution {
    public int[] kthRemainingInteger(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] ans = new int[queries.length];
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + ((nums[i - 1] % 2 == 0) ? 1 : 0);
        }
        for (int q = 0; q < queries.length; q++) {
            int l = queries[q][0];
            int r = queries[q][1];
            int k = queries[q][2];
            int lowerCnt = (nums[l] - 1) / 2;
            int upperCnt = nums[r] / 2;
            int remove = prefix[r + 1] - prefix[l];
            // first segment
            if (lowerCnt >= k) {
                ans[q] = 2 * k;
                continue;
            }
            // third segment
            if (upperCnt - remove < k) {
                ans[q] = 2 * (k + remove);
            } else {
                // middle segment
                int s = l;
                int e = r;
                while (s <= e) {
                    int m = s + (e - s) / 2;
                    int u = nums[m] / 2;
                    int rem = prefix[m + 1] - prefix[l];
                    if (u - rem < k) {
                        s = m + 1;
                    } else {
                        e = m - 1;
                    }
                }
                ans[q] = 2 * (k + (prefix[s] - prefix[l]));
            }
        }
        return ans;
    }
}
