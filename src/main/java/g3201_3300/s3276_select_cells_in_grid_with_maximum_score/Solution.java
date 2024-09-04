package g3201_3300.s3276_select_cells_in_grid_with_maximum_score;

// #Hard #Array #Dynamic_Programming #Matrix #Bit_Manipulation #Bitmask
// #2024_09_04_Time_6_ms_(99.82%)_Space_44.1_MB_(91.67%)

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int n = grid.size();
        int m = grid.get(0).size();
        int[][] arr = new int[n * m][2];
        for (int i = 0; i < n; i++) {
            List<Integer> l = grid.get(i);
            for (int j = 0; j < l.size(); j++) {
                arr[i * m + j][0] = l.get(j);
                arr[i * m + j][1] = i;
            }
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        int[] dp = new int[1 << n];
        int i = 0;
        while (i < arr.length) {
            boolean[] seen = new boolean[n];
            seen[arr[i][1]] = true;
            int v = arr[i][0];
            i++;
            while (i < arr.length && arr[i][0] == v) {
                seen[arr[i][1]] = true;
                i++;
            }
            int[] next = Arrays.copyOf(dp, dp.length);
            for (int j = 0; j < n; j++) {
                if (seen[j]) {
                    int and = ((1 << n) - 1) ^ (1 << j);
                    for (int k = and; k > 0; k = (k - 1) & and) {
                        next[k | (1 << j)] = Math.max(next[k | (1 << j)], dp[k] + v);
                    }
                    next[1 << j] = Math.max(next[1 << j], v);
                }
            }
            dp = next;
        }
        return dp[dp.length - 1];
    }
}
