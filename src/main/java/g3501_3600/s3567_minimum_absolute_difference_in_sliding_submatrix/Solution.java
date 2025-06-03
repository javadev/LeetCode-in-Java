package g3501_3600.s3567_minimum_absolute_difference_in_sliding_submatrix;

// #Medium #Array #Sorting #Matrix #2025_06_03_Time_7_ms_(99.69%)_Space_45.24_MB_(99.03%)

import java.util.Arrays;

public class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] result = new int[rows - k + 1][cols - k + 1];
        for (int x = 0; x <= rows - k; x++) {
            for (int y = 0; y <= cols - k; y++) {
                int size = k * k;
                int[] elements = new int[size];
                int idx = 0;
                for (int i = x; i < x + k; i++) {
                    for (int j = y; j < y + k; j++) {
                        elements[idx++] = grid[i][j];
                    }
                }
                Arrays.sort(elements);
                int minDiff = Integer.MAX_VALUE;
                for (int i = 1; i < size; i++) {
                    if (elements[i] != elements[i - 1]) {
                        minDiff = Math.min(minDiff, elements[i] - elements[i - 1]);
                        if (minDiff == 1) {
                            break;
                        }
                    }
                }
                result[x][y] = minDiff == Integer.MAX_VALUE ? 0 : minDiff;
            }
        }
        return result;
    }
}
