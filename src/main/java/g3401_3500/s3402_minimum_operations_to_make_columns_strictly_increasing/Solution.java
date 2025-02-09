package g3401_3500.s3402_minimum_operations_to_make_columns_strictly_increasing;

// #Easy #Matrix #Simulation #2025_01_06_Time_1_ms_(99.95%)_Space_45.24_MB_(62.37%)

public class Solution {
    public int minimumOperations(int[][] grid) {
        int ans = 0;
        for (int c = 0; c < grid[0].length; ++c) {
            for (int r = 1; r < grid.length; ++r) {
                if (grid[r][c] <= grid[r - 1][c]) {
                    ans += grid[r - 1][c] + 1 - grid[r][c];
                    grid[r][c] = grid[r - 1][c] + 1;
                }
            }
        }
        return ans;
    }
}
