package g2301_2400.s2319_check_if_matrix_is_x_matrix;

// #Easy #Array #Matrix #2022_06_28_Time_3_ms_(53.58%)_Space_54_MB_(83.44%)

public class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == j || i + j == grid.length - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
