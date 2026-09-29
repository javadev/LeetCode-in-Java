package g3901_4000.s3933_largest_local_values_in_a_matrix_ii;

// #Medium #Array #Matrix #Prefix_Sum #Staff #Weekly_Contest_502
// #2026_09_29_Time_40_ms_(100.00%)_Space_163.99_MB_(56.67%)

public class Solution {

    public int countLocalMaximums(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int wn = 32 - Integer.numberOfLeadingZeros(n);
        int wm = 32 - Integer.numberOfLeadingZeros(m);

        int[][][][] st = buildSparseTable(matrix, n, m, wn, wm);

        return countMaximums(matrix, st, n, m);
    }

    private int[][][][] buildSparseTable(int[][] matrix, int n, int m, int wn, int wm) {

        int[][][][] st = new int[wn][wm][n][m];
        st[0][0] = matrix;

        buildHorizontalLevels(st, n, m, wm);
        buildVerticalLevels(st, n, m, wn, wm);

        return st;
    }

    private void buildHorizontalLevels(int[][][][] st, int n, int m, int wm) {

        for (int k2 = 1; k2 < wm; k2++) {
            int half = 1 << (k2 - 1);
            int width = 1 << k2;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= m - width; j++) {
                    st[0][k2][i][j] = Math.max(st[0][k2 - 1][i][j], st[0][k2 - 1][i][j + half]);
                }
            }
        }
    }

    private void buildVerticalLevels(int[][][][] st, int n, int m, int wn, int wm) {

        for (int k1 = 1; k1 < wn; k1++) {
            int half = 1 << (k1 - 1);
            int height = 1 << k1;

            for (int k2 = 0; k2 < wm; k2++) {
                int width = 1 << k2;

                for (int i = 0; i <= n - height; i++) {
                    for (int j = 0; j <= m - width; j++) {
                        st[k1][k2][i][j] =
                                Math.max(st[k1 - 1][k2][i][j], st[k1 - 1][k2][i + half][j]);
                    }
                }
            }
        }
    }

    private int countMaximums(int[][] matrix, int[][][][] st, int n, int m) {

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isLocalMaximum(matrix, st, i, j, n, m)) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private boolean isLocalMaximum(int[][] matrix, int[][][][] st, int i, int j, int n, int m) {

        int x = matrix[i][j];

        if (x == 0) {
            return false;
        }

        int max1 = query(st, i - x, j - x + 1, i + x + 1, j + x, n, m);

        int max2 = query(st, i - x + 1, j - x, i + x, j + x + 1, n, m);

        return Math.max(max1, max2) <= x;
    }

    private int query(int[][][][] st, int r1, int c1, int r2, int c2, int n, int m) {

        r1 = Math.max(r1, 0);
        c1 = Math.max(c1, 0);
        r2 = Math.min(r2, n);
        c2 = Math.min(c2, m);

        int k1 = 31 - Integer.numberOfLeadingZeros(r2 - r1);
        int k2 = 31 - Integer.numberOfLeadingZeros(c2 - c1);

        int bottom = r2 - (1 << k1);
        int right = c2 - (1 << k2);

        return Math.max(
                Math.max(st[k1][k2][r1][c1], st[k1][k2][bottom][c1]),
                Math.max(st[k1][k2][r1][right], st[k1][k2][bottom][right]));
    }
}
