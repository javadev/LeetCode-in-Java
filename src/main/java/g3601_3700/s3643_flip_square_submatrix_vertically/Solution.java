package g3601_3700.s3643_flip_square_submatrix_vertically;

// #Easy #Weekly_Contest_462 #2025_08_10_Time_0_ms_(100.00%)_Space_45.80_MB_(59.82%)

public class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k / 2; i++) {
            int top = x + i;
            int bottom = x + k - 1 - i;
            for (int col = 0; col < k; col++) {
                int temp = grid[top][y + col];
                grid[top][y + col] = grid[bottom][y + col];
                grid[bottom][y + col] = temp;
            }
        }
        return grid;
    }
}
