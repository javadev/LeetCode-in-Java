package g2601_2700.s2684_maximum_number_of_moves_in_a_grid;

// #Medium #Array #Dynamic_Programming #Matrix #2023_09_19_Time_3_ms_(99.53%)_Space_55.4_MB_(15.49%)

import java.util.Arrays;

public class Solution {
    public int maxMoves(int[][] grid) {
        int h = grid.length;
        boolean[] dp1 = new boolean[h];
        boolean[] dp2 = new boolean[h];
        int rtn = 0;
        Arrays.fill(dp1, true);
        for (int col = 1; col < grid[0].length; col++) {
            boolean f = false;
            for (int row = 0; row < h; row++) {
                int pr = row - 1;
                int nr = row + 1;
                dp2[row] = false;
                if (pr >= 0 && dp1[pr] && grid[pr][col - 1] < grid[row][col]) {
                    dp2[row] = true;
                    f = true;
                }
                if (nr < h && dp1[nr] && grid[nr][col - 1] < grid[row][col]) {
                    dp2[row] = true;
                    f = true;
                }
                if (dp1[row] && grid[row][col - 1] < grid[row][col]) {
                    dp2[row] = true;
                    f = true;
                }
            }
            boolean[] t = dp1;
            dp1 = dp2;
            dp2 = t;
            if (f) {
                rtn++;
            } else {
                break;
            }
        }
        return rtn;
    }
}
