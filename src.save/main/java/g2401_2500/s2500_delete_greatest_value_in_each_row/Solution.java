package g2401_2500.s2500_delete_greatest_value_in_each_row;

// #Easy #Array #Sorting #Matrix #2023_02_12_Time_3_ms_(98.16%)_Space_42.6_MB_(34.09%)

import java.util.Arrays;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for (int j = 0; j < grid[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
            sum += max;
        }
        return sum;
    }
}
