package g3101_3200.s3148_maximum_difference_score_in_a_grid;

// #Medium #Array #Dynamic_Programming #Matrix #2024_05_15_Time_5_ms_(100.00%)_Space_67.4_MB_(5.12%)

import java.util.List;

public class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int m = grid.size() - 1;
        List<Integer> row = grid.get(m);
        int n = row.size();
        int[] maxRB = new int[n--];
        int mx = maxRB[n] = row.get(n);
        int result = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int x = row.get(i);
            result = Math.max(result, mx - x);
            maxRB[i] = mx = Math.max(mx, x);
        }
        for (int i = m - 1; i >= 0; i--) {
            row = grid.get(i);
            mx = 0;
            for (int j = n; j >= 0; j--) {
                mx = Math.max(mx, maxRB[j]);
                int x = row.get(j);
                result = Math.max(result, mx - x);
                maxRB[j] = mx = Math.max(mx, x);
            }
        }
        return result;
    }
}
