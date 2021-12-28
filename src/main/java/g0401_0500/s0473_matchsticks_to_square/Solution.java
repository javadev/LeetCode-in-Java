package g0401_0500.s0473_matchsticks_to_square;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask

import java.util.Arrays;

public class Solution {
    private boolean[] vs;
    private int m = 0;
    private int sum = 0;
    private int max = 0;
    private int e = 0;

    public boolean makesquare(int[] nums) {
        m = nums.length;
        if (m < 4) {
            return false;
        }
        for (int n : nums) {
            sum += n;
            max = Math.max(max, n);
        }
        if (sum % 4 != 0 || max > sum / 4) {
            return false;
        }
        Arrays.sort(nums);
        e = sum / 4;
        vs = new boolean[m];
        vs[0] = true;
        return dfs(nums, 1, nums[0], 4);
    }

    private boolean dfs(int[] nums, int idx, int tot, int cnt) {
        if (tot == e) {
            if (--cnt == 1) return true;
            for (int i = 0; i < m; i++) {
                if (vs[i]) {
                    continue;
                }
                vs[i] = true;
                boolean res = dfs(nums, i + 1, nums[i], cnt);
                vs[i] = false;
                return res;
            }
        }
        for (int i = idx; i < m; i++) {
            if (vs[i]) {
                continue;
            }
            if (nums[i] + tot > e) {
                return false;
            }
            vs[i] = true;
            if (dfs(nums, i + 1, tot + nums[i], cnt)) {
                return true;
            }
            vs[i] = false;
        }
        return false;
    }
}
