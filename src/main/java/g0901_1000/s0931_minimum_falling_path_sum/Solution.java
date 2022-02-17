package g0901_1000.s0931_minimum_falling_path_sum;

// #Medium #Array #Dynamic_Programming #Matrix

public class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int l = matrix[0].length;
        int[] arr = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            int[] cur = new int[l];
            for (int j = 0; j < l; j++) {
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                int curCell = arr[j];
                if (j > 0) {
                    left = arr[j - 1];
                }
                if (j < l - 1) {
                    right = arr[j + 1];
                }
                cur[j] = matrix[i][j] + Math.min(left, Math.min(right, curCell));
            }
            arr = cur;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
