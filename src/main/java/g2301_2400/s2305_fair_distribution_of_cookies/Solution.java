package g2301_2400.s2305_fair_distribution_of_cookies;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_06_16_Time_14_ms_(84.35%)_Space_39.6_MB_(92.46%)

public class Solution {
    private int res = Integer.MAX_VALUE;

    public int distributeCookies(int[] c, int k) {
        int[] nums = new int[k];
        dfs(c, nums, 0);
        return res;
    }

    private void dfs(int[] c, int[] nums, int cur) {
        if (cur == c.length) {
            int r = 0;
            for (int num : nums) {
                r = Math.max(r, num);
            }
            res = Math.min(res, r);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + c[cur] > res) {
                continue;
            }
            nums[i] += c[cur];
            dfs(c, nums, cur + 1);
            nums[i] -= c[cur];
        }
    }
}
