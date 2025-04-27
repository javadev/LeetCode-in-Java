package g3501_3600.s3529_count_cells_in_overlapping_horizontal_and_vertical_substrings;

// #Medium #2025_04_27_Time_32_ms_(100.00%)_Space_64.02_MB_(100.00%)

public class Solution {
    public int countCells(char[][] grid, String pattern) {
        int k = pattern.length();
        int[] lps = makeLps(pattern);
        int m = grid.length;
        int n = grid[0].length;
        int[][] horiPats = new int[m][n];
        int[][] vertPats = new int[m][n];
        int i = 0;
        int j = 0;
        while (i < m * n) {
            if (grid[i / n][i % n] == pattern.charAt(j)) {
                i++;
                if (++j == k) {
                    int d = i - j;
                    horiPats[d / n][d % n]++;
                    if (i < m * n) {
                        horiPats[i / n][i % n]--;
                    }
                    j = lps[j - 1];
                }
            } else if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        i = 0;
        j = 0;
        // now do vert pattern, use i = 0 to m*n -1 but instead index as grid[i % m][i/m]
        while (i < m * n) {
            if (grid[i % m][i / m] == pattern.charAt(j)) {
                i++;
                if (++j == k) {
                    int d = i - j;
                    vertPats[d % m][d / m]++;
                    if (i < m * n) {
                        vertPats[i % m][i / m]--;
                    }
                    j = lps[j - 1];
                }
            } else if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        for (i = 1; i < m * n; i++) {
            vertPats[i % m][i / m] += vertPats[(i - 1) % m][(i - 1) / m];
            horiPats[i / n][i % n] += horiPats[(i - 1) / n][(i - 1) % n];
        }
        int res = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (horiPats[i][j] > 0 && vertPats[i][j] > 0) {
                    res++;
                }
            }
        }
        return res;
    }

    private int[] makeLps(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }
}
