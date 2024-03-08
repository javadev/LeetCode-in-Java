package g0001_0100.s0064_minimum_path_sum;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Matrix
// #Dynamic_Programming_I_Day_16 #Udemy_Dynamic_Programming #Big_O_Time_O(m*n)_Space_O(m*n)
// #2023_08_11_Time_0_ms_(100.00%)_Space_44_MB_(58.56%)

public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) {
            return grid[0][0];
        }
        int[][] dm = new int[grid.length][grid[0].length];
        int s = 0;
        for (int r = grid.length - 1; r >= 0; r--) {
            dm[r][grid[0].length - 1] = grid[r][grid[0].length - 1] + s;
            s += grid[r][grid[0].length - 1];
        }
        s = 0;
        for (int c = grid[0].length - 1; c >= 0; c--) {
            dm[grid.length - 1][c] = grid[grid.length - 1][c] + s;
            s += grid[grid.length - 1][c];
        }
        return recur(grid, dm, 0, 0);
    }

    private int recur(int[][] grid, int[][] dm, int r, int c) {
        if (dm[r][c] == 0 && r != grid.length - 1 && c != grid[0].length - 1) {
            dm[r][c] = grid[r][c] + Math.min(recur(grid, dm, r + 1, c), recur(grid, dm, r, c + 1));
        }
        return dm[r][c];
    }
}
