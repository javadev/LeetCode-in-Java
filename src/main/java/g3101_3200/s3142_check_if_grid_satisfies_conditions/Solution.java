package g3101_3200.s3142_check_if_grid_satisfies_conditions;

// #Easy #Array #Matrix #2024_05_15_Time_1_ms_(95.76%)_Space_44.4_MB_(59.70%)

public class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m - 1; i++) {
            if (n > 1) {
                for (int j = 0; j < n - 1; j++) {
                    if ((grid[i][j] != grid[i + 1][j]) || (grid[i][j] == grid[i][j + 1])) {
                        return false;
                    }
                }
            } else {
                if (grid[i][0] != grid[i + 1][0]) {
                    return false;
                }
            }
        }
        for (int j = 0; j < n - 1; j++) {
            if (grid[m - 1][j] == grid[m - 1][j + 1]) {
                return false;
            }
        }
        return true;
    }
}
