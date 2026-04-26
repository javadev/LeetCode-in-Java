package g3701_3800.s3738_longest_non_decreasing_subarray_after_replacing_at_most_one_element;

// #Medium #Array #Dynamic_Programming #Staff #Biweekly_Contest_169
// #2026_04_26_Time_7_ms_(99.28%)_Space_123.88_MB_(5.07%)

public class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return n;
        }
        int i = 0;
        int len1 = 0;
        int len2 = 0;
        int ans = 2;
        while (i < n) {
            int l = (i == 0) ? -1000 * 1000 * 10 : nums[i - 1];
            int r = (i == n - 1) ? 1000 * 1000 * 10 : nums[i + 1];
            if (l <= nums[i]) {
                len2++;
                ans = Math.max(len2 + 1, ans);
            } else if (r >= nums[i]) {
                int j = i;
                len1 = len2;
                while (j < n - 1 && nums[j] <= nums[j + 1]) {
                    j++;
                }
                len2 = j - i + 1;
                ans = Math.max(len2 + 1, ans);
                if (l <= r || (len1 > 1 && nums[i - 2] <= nums[i])) {
                    ans = Math.max(len1 + len2, ans);
                }
                i = j;
            } else {
                len2 = 0;
            }
            i++;
        }
        ans = Math.min(ans, n);
        return ans;
    }
}
