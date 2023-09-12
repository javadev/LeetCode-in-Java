package g2601_2700.s2684_maximum_number_of_moves_in_a_grid;

// #Medium #Array #Dynamic_Programming #Matrix #2023_09_12_Time_4_ms_(97.95%)_Space_54.4_MB_(68.34%)

public class Solution {
    public int maxMoves(int[][] grid) {
        int m = Integer.MIN_VALUE;
        int[][] vis = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            m = Math.max(m, mov(i, 0, grid, Integer.MIN_VALUE, vis));
        }
        return m - 1;
    }

    private int mov(int i, int j, int[][] g, int p, int[][] vis) {
        if (i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] <= p || vis[i][j] == 1) {
            return 0;
        }
        vis[i][j] = 1;
        int ur = 1 + mov(i - 1, j + 1, g, g[i][j], vis);
        int dr = 1 + mov(i + 1, j + 1, g, g[i][j], vis);
        int r = 1 + mov(i, j + 1, g, g[i][j], vis);
        return Math.max(ur, Math.max(dr, r));
    }
}
