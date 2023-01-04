package g1201_1300.s1219_path_with_maximum_gold;

// #Medium #Array #Matrix #Backtracking #2022_03_11_Time_48_ms_(57.00%)_Space_41.9_MB_(39.12%)

public class Solution {
    private int maxGold = 0;

    public int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    int g = grid[i][j];
                    grid[i][j] = 0;
                    gold(grid, i, j, g);
                    grid[i][j] = g;
                }
            }
        }
        return maxGold;
    }

    private void gold(int[][] grid, int row, int col, int gold) {
        if (gold > maxGold) {
            maxGold = gold;
        }
        if (row > 0 && grid[row - 1][col] != 0) {
            int currGold = grid[row - 1][col];
            grid[row - 1][col] = 0;
            gold(grid, row - 1, col, gold + currGold);
            grid[row - 1][col] = currGold;
        }
        if (col > 0 && grid[row][col - 1] != 0) {
            int currGold = grid[row][col - 1];
            grid[row][col - 1] = 0;
            gold(grid, row, col - 1, gold + currGold);
            grid[row][col - 1] = currGold;
        }
        if (row < grid.length - 1 && grid[row + 1][col] != 0) {
            // flag=false;
            int currGold = grid[row + 1][col];
            grid[row + 1][col] = 0;
            gold(grid, row + 1, col, gold + currGold);
            grid[row + 1][col] = currGold;
        }
        if (col < grid[0].length - 1 && grid[row][col + 1] != 0) {
            int currGold = grid[row][col + 1];
            grid[row][col + 1] = 0;
            gold(grid, row, col + 1, gold + currGold);
            grid[row][col + 1] = currGold;
        }
    }
}
