package g2601_2700.s2617_minimum_number_of_visited_cells_in_a_grid;

// #Hard #Array #Dynamic_Programming #Binary_Search #Stack #Union_Find #Segment_Tree
// #Binary_Indexed_Tree #2023_08_30_Time_34_ms_(100.00%)_Space_76_MB_(65.00%)

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {
    private static final int LIMIT = 2;

    public int minimumVisitedCells(int[][] grid) {
        int[][] len = new int[grid.length][grid[0].length];
        for (int[] ints : len) {
            Arrays.fill(ints, -1);
        }
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {0, 0});
        len[0][0] = 1;
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            int i = tmp[0];
            int j = tmp[1];
            int c = 0;
            for (int k = Math.min(grid[0].length - 1, grid[i][j] + j); k > j; k--) {
                if (len[i][k] != -1) {
                    c++;
                    if (c > LIMIT) {
                        break;
                    }
                } else {
                    len[i][k] = len[i][j] + 1;
                    q.add(new int[] {i, k});
                }
            }
            if (len[grid.length - 1][grid[0].length - 1] != -1) {
                return len[grid.length - 1][grid[0].length - 1];
            }
            c = 0;
            for (int k = Math.min(grid.length - 1, grid[i][j] + i); k > i; k--) {
                if (len[k][j] != -1) {
                    c++;
                    if (c > LIMIT) {
                        break;
                    }
                } else {
                    len[k][j] = len[i][j] + 1;
                    q.add(new int[] {k, j});
                }
            }
            if (len[grid.length - 1][grid[0].length - 1] != -1) {
                return len[grid.length - 1][grid[0].length - 1];
            }
        }
        return -1;
    }
}
