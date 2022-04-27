package g0601_0700.s0661_image_smoother;

// #Easy #Array #Matrix #2022_03_21_Time_2_ms_(100.00%)_Space_42.9_MB_(91.99%)

public class Solution {
    public int[][] imageSmoother(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                bfs(matrix, i, j, result, m, n);
            }
        }
        return result;
    }

    private void bfs(int[][] matrix, int i, int j, int[][] result, int m, int n) {
        int sum = matrix[i][j];
        int denominator = 1;
        if (j + 1 < n) {
            sum += matrix[i][j + 1];
            denominator++;
        }
        if (i + 1 < m && j + 1 < n) {
            sum += matrix[i + 1][j + 1];
            denominator++;
        }
        if (i + 1 < m) {
            sum += matrix[i + 1][j];
            denominator++;
        }
        if (i + 1 < m && j - 1 >= 0) {
            sum += matrix[i + 1][j - 1];
            denominator++;
        }
        if (j - 1 >= 0) {
            sum += matrix[i][j - 1];
            denominator++;
        }
        if (i - 1 >= 0 && j - 1 >= 0) {
            sum += matrix[i - 1][j - 1];
            denominator++;
        }
        if (i - 1 >= 0) {
            sum += matrix[i - 1][j];
            denominator++;
        }
        if (i - 1 >= 0 && j + 1 < n) {
            sum += matrix[i - 1][j + 1];
            denominator++;
        }
        result[i][j] = sum / denominator;
    }
}
