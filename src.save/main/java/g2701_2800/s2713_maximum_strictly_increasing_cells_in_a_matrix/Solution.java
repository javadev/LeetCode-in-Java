package g2701_2800.s2713_maximum_strictly_increasing_cells_in_a_matrix;

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search #Matrix #Memoization
// #2023_09_15_Time_116_ms_(96.53%)_Space_100.4_MB_(20.61%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int maxIncreasingCells(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = mat[i][j];
                map.computeIfAbsent(val, k -> new ArrayList<>()).add(new int[] {i, j});
            }
        }
        int[][] memo = new int[n][m];
        int[] res = new int[n + m];
        AtomicInteger max = new AtomicInteger();
        map.keySet().stream()
                .sorted()
                .forEach(
                        a -> {
                            for (int[] pos : map.get(a)) {
                                int i = pos[0];
                                int j = pos[1];
                                memo[i][j] = Math.max(res[i], res[n + j]) + 1;
                                max.set(Math.max(max.get(), memo[i][j]));
                            }
                            for (int[] pos : map.get(a)) {
                                int i = pos[0];
                                int j = pos[1];
                                res[n + j] = Math.max(res[n + j], memo[i][j]);
                                res[i] = Math.max(res[i], memo[i][j]);
                            }
                        });
        return max.get();
    }
}
