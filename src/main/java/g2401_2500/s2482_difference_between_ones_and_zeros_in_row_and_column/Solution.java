package g2401_2500.s2482_difference_between_ones_and_zeros_in_row_and_column;

// #Medium #Array #Matrix #Simulation #2023_01_25_Time_9_ms_(94.05%)_Space_76.3_MB_(95.36%)

public class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] rowOne = new int[grid.length];
        int[] colOne = new int[grid[0].length];
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    c++;
                }
            }
            rowOne[i] = c;
        }
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int[] ints : grid) {
                if (ints[i] == 1) {
                    c++;
                }
            }
            colOne[i] = c;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = rowOne[i] + colOne[j] - (m - rowOne[i]) - (n - colOne[j]);
            }
        }
        return grid;
    }
}
