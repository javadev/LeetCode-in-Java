package g3201_3300.s3276_select_cells_in_grid_with_maximum_score;

// #Hard #2024_09_02_Time_36_ms_(100.00%)_Space_48.5_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int n = grid.size();
        int m = grid.get(0).size();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(new ArrayList<>());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = grid.get(i).get(j);
                list.get(num).add(i);
                max = Math.max(grid.get(i).get(j), max);
            }
        }
        int[][] dp = new int[max + 1][(1 << n) * 2 - 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(max, 0, list, dp);
    }

    private int helper(int n, int mask, List<List<Integer>> list, int[][] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n][mask] != -1) {
            return dp[n][mask];
        }
        int take = Integer.MIN_VALUE;
        for (int row : list.get(n)) {
            if ((mask & (1 << row)) != 0) {
                continue;
            }
            take = Math.max(n + helper(n - 1, mask | (1 << row), list, dp), take);
        }
        int notTake = helper(n - 1, mask, list, dp);
        dp[n][mask] = Math.max(take, notTake);
        return dp[n][mask];
    }
}
