package g0701_0800.s0764_largest_plus_sign;

// #Medium #Array #Dynamic_Programming

public class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        boolean[][] mat = new boolean[n][n];
        for (int[] pos : mines) {
            mat[pos[0]][pos[1]] = true;
        }
        int[][] left = new int[n][n];
        int[][] right = new int[n][n];
        int[][] up = new int[n][n];
        int[][] down = new int[n][n];
        int ans = 0;
        // For Left and Up only
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                left[i][j] = mat[i][j] ? 0 : 1 + (j == 0 ? 0 : left[i][j - 1]);
                up[i][j] = mat[i][j] ? 0 : 1 + (i == 0 ? 0 : up[i - 1][j]);
            }
        }
        // For Right and Down and simoultaneously get answer
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                right[i][j] = mat[i][j] ? 0 : 1 + (j == n - 1 ? 0 : right[i][j + 1]);
                down[i][j] = mat[i][j] ? 0 : 1 + (i == n - 1 ? 0 : down[i + 1][j]);
                int x = Math.min(Math.min(left[i][j], up[i][j]), Math.min(right[i][j], down[i][j]));
                ans = Math.max(ans, x);
            }
        }
        return ans;
    }
}
