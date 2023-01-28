package g0801_0900.s0803_bricks_falling_when_hit;

// #Hard #Array #Matrix #Union_Find #2022_03_23_Time_12_ms_(94.92%)_Space_118.5_MB_(65.25%)

public class Solution {
    private final int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int cols = grid[0].length;

        for (int[] hit : hits) {
            int x = hit[0];
            int y = hit[1];
            grid[x][y]--;
        }

        int row = 0;
        for (int col = 0; col < cols; col++) {
            dfs(row, col, grid);
        }

        int[] res = new int[hits.length];
        for (int i = hits.length - 1; i >= 0; i--) {
            int x = hits[i][0];
            int y = hits[i][1];

            grid[x][y]++;
            if (grid[x][y] == 1 && isConnectedToRoof(x, y, grid)) {
                res[i] = dfs(x, y, grid) - 1;
            }
        }

        return res;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 2;
        return dfs(i + 1, j, grid)
                + dfs(i - 1, j, grid)
                + dfs(i, j + 1, grid)
                + dfs(i, j - 1, grid)
                + 1;
    }

    private boolean isConnectedToRoof(int i, int j, int[][] grid) {
        if (i == 0) {
            return true;
        }
        for (int[] d : dirs) {
            int x = i + d[0];
            int y = j + d[1];
            if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 2) {
                return true;
            }
        }
        return false;
    }
}
