package g1201_1300.s1240_tiling_a_rectangle_with_the_fewest_squares;

// #Hard #Dynamic_Programming #Backtracking #2022_03_12_Time_3_ms_(62.18%)_Space_40.9_MB_(54.49%)

public class Solution {
    private int n;
    private int m;
    private boolean[][] covered;
    private int res;

    public int tilingRectangle(int n, int m) {
        this.n = n;
        this.m = m;
        this.covered = new boolean[n][m];
        this.res = m * n;
        backtrack(0);
        return res;
    }

    private void backtrack(int count) {
        if (count >= res) {
            return;
        }
        boolean find = false;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (!covered[r][c]) {
                    find = true;
                    int len = findMaxWidth(r, c);
                    while (len > 0) {
                        cover(r, c, len, true);
                        backtrack(count + 1);
                        cover(r, c, len, false);
                        len--;
                    }
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        if (!find) {
            res = count;
        }
    }

    private void cover(int r, int c, int len, boolean flag) {
        for (int i = r; i < r + len; i++) {
            for (int j = c; j < c + len; j++) {
                covered[i][j] = flag;
            }
        }
    }

    private int findMaxWidth(int r, int c) {
        int len = Math.min(n - r, m - c);
        while (true) {
            boolean find = false;
            for (int i = r; i < r + len; i++) {
                for (int j = c; j < c + len; j++) {
                    if (covered[i][j]) {
                        find = true;
                        len = Math.min(i - r, j - c);
                        break;
                    }
                }
                if (find) {
                    break;
                }
            }
            if (!find) {
                break;
            }
        }
        return len;
    }
}
