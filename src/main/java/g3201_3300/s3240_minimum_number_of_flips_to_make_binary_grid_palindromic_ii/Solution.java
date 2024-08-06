package g3201_3300.s3240_minimum_number_of_flips_to_make_binary_grid_palindromic_ii;

// #Medium #Array #Matrix #Two_Pointers #2024_08_06_Time_3_ms_(96.90%)_Space_93.8_MB_(76.14%)

public class Solution {
    public int minFlips(int[][] grid) {
        int res = 0;
        int one = 0;
        int diff = 0;
        int m = grid.length;
        int n = grid[0].length;
        // Handle quadrants
        for (int i = 0; i < m / 2; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                int v =
                        grid[i][j]
                                + grid[i][n - 1 - j]
                                + grid[m - 1 - i][j]
                                + grid[m - 1 - i][n - 1 - j];
                res += Math.min(v, 4 - v);
            }
        }
        // Handle middle column
        if (n % 2 > 0) {
            for (int i = 0; i < m / 2; ++i) {
                diff += grid[i][n / 2] ^ grid[m - 1 - i][n / 2];
                one += grid[i][n / 2] + grid[m - 1 - i][n / 2];
            }
        }
        // Handle middle row
        if (m % 2 > 0) {
            for (int j = 0; j < n / 2; ++j) {
                diff += grid[m / 2][j] ^ grid[m / 2][n - 1 - j];
                one += grid[m / 2][j] + grid[m / 2][n - 1 - j];
            }
        }
        // Handle center point
        if (n % 2 > 0 && m % 2 > 0) {
            res += grid[m / 2][n / 2];
        }
        // Divisible by 4
        if (diff == 0 && one % 4 > 0) {
            res += 2;
        }
        return res + diff;
    }
}
