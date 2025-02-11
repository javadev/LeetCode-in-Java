package g3401_3500.s3446_sort_matrix_by_diagonals;

// #Medium #Array #Sorting #Matrix #2025_02_11_Time_3_ms_(94.47%)_Space_45.46_MB_(95.07%)

import java.util.Arrays;

public class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int top = 0;
        int left = 0;
        int right = grid[0].length - 1;
        while (top < right) {
            int x = grid[0].length - 1 - left;
            int[] arr = new int[left + 1];
            for (int i = top; i <= left; i++) {
                arr[i] = grid[i][x++];
            }
            Arrays.sort(arr);
            x = grid[0].length - 1 - left;
            for (int i = top; i <= left; i++) {
                grid[i][x++] = arr[i];
            }
            left++;
            right--;
        }
        int bottom = grid.length - 1;
        int x = 0;
        while (top <= bottom) {
            int[] arr = new int[bottom + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = grid[x + i][i];
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                grid[x + i][i] = arr[arr.length - 1 - i];
            }
            bottom--;
            x++;
        }
        return grid;
    }
}
