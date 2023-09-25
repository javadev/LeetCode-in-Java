package g0801_0900.s0807_max_increase_to_keep_city_skyline;

// #Medium #Array #Greedy #Matrix #2022_03_23_Time_2_ms_(23.49%)_Space_43.9_MB_(64.30%)

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int[] tallestR = new int[rows];
        int[] tallestC = new int[cols];
        int max;

        for (int i = 0; i < rows; i++) {
            max = 0;
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
            tallestR[i] = max;
        }

        for (int i = 0; i < cols; i++) {
            max = 0;
            for (int[] ints : grid) {
                if (ints[i] > max) {
                    max = ints[i];
                }
            }
            tallestC[i] = max;
        }

        int increase = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (tallestR[i] < tallestC[j]) {
                    increase += tallestR[i] - grid[i][j];
                    grid[i][j] += tallestR[i] - grid[i][j];
                } else {
                    increase += tallestC[j] - grid[i][j];
                    grid[i][j] += tallestC[j] - grid[i][j];
                }
            }
        }

        return increase;
    }
}
