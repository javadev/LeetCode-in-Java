package g3201_3300.s3239_minimum_number_of_flips_to_make_binary_grid_palindromic_i;

// #Medium #Array #Matrix #Two_Pointers #2024_08_06_Time_3_ms_(100.00%)_Space_111.4_MB_(41.81%)

public class Solution {
    public int minFlips(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int rowFlips = 0;
        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n; j++) {
                int sum = grid[i][j] + grid[m - 1 - i][j];
                rowFlips += Math.min(sum, 2 - sum);
            }
        }
        int columnFlips = 0;
        for (int j = 0; j < n / 2; j++) {
            for (int[] ints : grid) {
                int sum = ints[j] + ints[n - 1 - j];
                columnFlips += Math.min(sum, 2 - sum);
            }
        }
        return Math.min(rowFlips, columnFlips);
    }
}
