package g0401_0500.s0473_matchsticks_to_square;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask

import java.util.Arrays;

public class Solution {
    private boolean[] used;
    private int m = 0;
    private int sum = 0;
    private int max = 0;
    private int target = 0;

    public boolean makesquare(int[] matchsticks) {
        m = matchsticks.length;
        if (m < 4) {
            return false;
        }
        for (int n : matchsticks) {
            sum += n;
            max = Math.max(max, n);
        }
        if (sum % 4 != 0 || max > sum / 4) {
            return false;
        }
        Arrays.sort(matchsticks);
        target = sum / 4;
        used = new boolean[m];
        used[0] = true;
        return dfs(matchsticks, 1, matchsticks[0], 4);
    }

    private boolean dfs(int[] matchsticks, int idx, int tot, int cnt) {
        if (tot == target) {
            if (--cnt == 1) return true;
            for (int i = 0; i < m; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                boolean res = dfs(matchsticks, i + 1, matchsticks[i], cnt);
                used[i] = false;
                return res;
            }
        }
        for (int i = idx; i < m; i++) {
            if (used[i]) {
                continue;
            }
            if (matchsticks[i] + tot > target) {
                return false;
            }
            used[i] = true;
            if (dfs(matchsticks, i + 1, tot + matchsticks[i], cnt)) {
                return true;
            }
            used[i] = false;
        }
        return false;
    }
}
