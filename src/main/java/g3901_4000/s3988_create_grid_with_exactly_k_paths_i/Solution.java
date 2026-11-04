package g3901_4000.s3988_create_grid_with_exactly_k_paths_i;

// #Medium #Array #Math #Matrix #Combinatorics #Staff #Weekly_Contest_510
// #2026_11_03_Time_1_ms_(100.00%)_Space_43.92_MB_(68.14%)

import java.util.Arrays;

public class Solution {
    public String[] createGrid(int m, int n, int k) {
        int[] dimensions = getDimensions(m, n, k);
        if (dimensions.length == 0) {
            return new String[] {};
        }
        int dm = dimensions[0];
        int dn = dimensions[1];
        char[][] grid = initializeGrid(m, n);
        createRequiredPaths(grid, dm, dn);
        addObstacles(grid, dm, dn, k);
        connectRemainingGrid(grid, m, n, dm, dn);
        return convertToStrings(grid, m);
    }

    private int[] getDimensions(int m, int n, int k) {
        if (k == 1) {
            return new int[] {0, 0};
        }
        if (k == 2 && m >= 2 && n >= 2) {
            return new int[] {1, 1};
        }
        if (k == 3) {
            if (m >= 3 && n >= 2) {
                return new int[] {2, 1};
            }
            if (m >= 2 && n >= 3) {
                return new int[] {1, 2};
            }
        }
        if (k == 4) {
            return getFourPathDimensions(m, n);
        }
        return new int[0];
    }

    private int[] getFourPathDimensions(int m, int n) {
        if (m >= 4 && n >= 2) {
            return new int[] {3, 1};
        }
        if (m >= 2 && n >= 4) {
            return new int[] {1, 3};
        }
        if (m >= 3 && n >= 3) {
            return new int[] {2, 2};
        }
        return new int[0];
    }

    private char[][] initializeGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for (char[] row : grid) {
            Arrays.fill(row, '#');
        }
        return grid;
    }

    private void createRequiredPaths(char[][] grid, int dm, int dn) {
        for (int i = 0; i <= dm; i++) {
            for (int j = 0; j <= dn; j++) {
                grid[i][j] = '.';
            }
        }
    }

    private void addObstacles(char[][] grid, int dm, int dn, int k) {
        if (dm == 2 && dn == 2 && k == 4) {
            grid[0][2] = '#';
            grid[2][0] = '#';
        }
    }

    private void connectRemainingGrid(char[][] grid, int m, int n, int dm, int dn) {
        connectVertically(grid, dm, dn, m);
        connectHorizontally(grid, m, dn, n);
    }

    private void connectVertically(char[][] grid, int dm, int dn, int m) {
        for (int i = dm + 1; i < m; i++) {
            grid[i][dn] = '.';
        }
    }

    private void connectHorizontally(char[][] grid, int m, int dn, int n) {
        for (int j = dn + 1; j < n; j++) {
            grid[m - 1][j] = '.';
        }
    }

    private String[] convertToStrings(char[][] grid, int m) {
        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }
        return ans;
    }
}
