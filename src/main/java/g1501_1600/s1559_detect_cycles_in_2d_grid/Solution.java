package g1501_1600.s1559_detect_cycles_in_2d_grid;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #2022_04_11_Time_22_ms_(82.51%)_Space_135.8_MB_(70.24%)

public class Solution {
    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && cycle(grid, i, j, visited, grid[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean cycle(char[][] grid, int i, int j, boolean[][] visited, char cc) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != cc) {
            return false;
        }
        if (visited[i][j]) {
            return true;
        }
        visited[i][j] = true;
        char temp = grid[i][j];
        grid[i][j] = '*';
        boolean ans =
                cycle(grid, i + 1, j, visited, cc)
                        || cycle(grid, i - 1, j, visited, cc)
                        || cycle(grid, i, j + 1, visited, cc)
                        || cycle(grid, i, j - 1, visited, cc);
        grid[i][j] = temp;
        return ans;
    }
}
