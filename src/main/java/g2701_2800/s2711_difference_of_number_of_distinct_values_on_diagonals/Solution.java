package g2701_2800.s2711_difference_of_number_of_distinct_values_on_diagonals;

// #Medium #Array #Hash_Table #Matrix #2023_09_15_Time_7_ms_(90.98%)_Space_44.3_MB_(93.44%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] arrTopLeft = new int[m][n];
        int[][] arrBotRight = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            int c = 0;
            int r = i;
            Set<Integer> set = new HashSet<>();
            while (cellExists(r, c, grid)) {
                arrTopLeft[r][c] = set.size();
                set.add(grid[r++][c++]);
            }
        }

        for (int i = 1; i < n; i++) {
            int r = 0;
            int c = i;
            Set<Integer> set = new HashSet<>();
            while (cellExists(r, c, grid)) {
                arrTopLeft[r][c] = set.size();
                set.add(grid[r++][c++]);
            }
        }

        for (int i = 0; i < n; i++) {
            int r = m - 1;
            int c = i;
            Set<Integer> set = new HashSet<>();
            while (cellExists(r, c, grid)) {
                arrBotRight[r][c] = set.size();
                set.add(grid[r--][c--]);
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            int c = n - 1;
            int r = i;
            Set<Integer> set = new HashSet<>();
            while (cellExists(r, c, grid)) {
                arrBotRight[r][c] = set.size();
                set.add(grid[r--][c--]);
            }
        }

        int[][] result = new int[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                result[r][c] = Math.abs(arrTopLeft[r][c] - arrBotRight[r][c]);
            }
        }

        return result;
    }

    private boolean cellExists(int r, int c, int[][] grid) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}
