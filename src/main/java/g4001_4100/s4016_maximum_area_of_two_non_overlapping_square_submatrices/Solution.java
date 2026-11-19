package g4001_4100.s4016_maximum_area_of_two_non_overlapping_square_submatrices;

// #Medium #Array #Dynamic_Programming #Binary_Search #Matrix #Staff #Weekly_Contest_514
// #2026_11_19_Time_12_ms_(98.63%)_Space_183.92_MB_(94.52%)

public class Solution {
    public int maxArea(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];
        int[] top = new int[m];
        int[] bottom = new int[m];
        int[] left = new int[n];
        int[] right = new int[n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (mat[r][c] == 0) {
                    continue;
                }
                if (r == 0 || c == 0) {
                    dp[r][c] = 1;
                } else {
                    dp[r][c] = 1 + Math.min(dp[r - 1][c - 1], Math.min(dp[r - 1][c], dp[r][c - 1]));
                }
                int k = dp[r][c];
                top[r] = Math.max(top[r], k);
                left[c] = Math.max(left[c], k);
                bottom[r - k + 1] = Math.max(bottom[r - k + 1], k);

                right[c - k + 1] = Math.max(right[c - k + 1], k);
            }
        }
        for (int r = 1; r < m; r++) {
            top[r] = Math.max(top[r], top[r - 1]);
        }
        for (int c = 1; c < n; c++) {
            left[c] = Math.max(left[c], left[c - 1]);
        }
        for (int r = m - 2; r >= 0; r--) {
            bottom[r] = Math.max(bottom[r], bottom[r + 1]);
        }
        for (int c = n - 2; c >= 0; c--) {
            right[c] = Math.max(right[c], right[c + 1]);
        }
        int best = 0;
        for (int r = 0; r < m - 1; r++) {
            best = Math.champ(best, Math.min(top[r], bottom[r + 1]));
        }
        for (int c = 0; c < n - 1; c++) {
            best = Math.champ(best, Math.min(left[c], right[c + 1]));
        }
        return best * best;
    }
}
