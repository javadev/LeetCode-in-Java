package g0801_0900.s0861_score_after_flipping_matrix;

// #Medium #Array #Greedy #Matrix #Bit_Manipulation
// #2022_03_27_Time_1_ms_(70.04%)_Space_42.8_MB_(6.86%)

public class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 0) {
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }
                }
            }
        }
        for (int j = 1; j < n; j++) {
            int ones = 0;
            for (int[] ints : grid) {
                if (ints[j] == 1) {
                    ones++;
                }
            }
            if (ones <= m / 2) {
                for (int i = 0; i < m; i++) {
                    if (grid[i][j] == 1) {
                        grid[i][j] = 0;
                    } else {
                        grid[i][j] = 1;
                    }
                }
            }
        }
        int result = 0;
        for (int[] ints : grid) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(ints[j]);
            }
            result += Integer.parseInt(sb.toString(), 2);
        }
        return result;
    }
}
