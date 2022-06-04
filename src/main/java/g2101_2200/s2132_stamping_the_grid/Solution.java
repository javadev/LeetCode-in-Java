package g2101_2200.s2132_stamping_the_grid;

// #Hard #Array #Greedy #Matrix #Prefix_Sum #2022_06_04_Time_11_ms_(93.06%)_Space_129.3_MB_(71.53%)

public class Solution {
    private boolean canPaved(int[][] grid, int is, int js, int ie, int je) {
        for (int i = is; i <= ie; i++) {
            for (int j = js; j <= je; j++) {
                if(grid[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean possibleToStamp(int[][] grid, int h, int w) {
        int rl = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            int prev = -1;
            for (int j = 0; j < row.length; j++) {
                if(row[j] == 0) {
                    if(j == prev + 1 && j > 0 && j+w-1 < rl) {
                        if(i>0 && grid[i-1][j] == 1 && i+h-1 < grid.length && canPaved(grid, i, j, i + h - 1, j + w - 1)) {
                            return false;
                        }
                        if(i+1 < grid.length && grid[i+1][j] == 1 && i-h+1 >= 0 && canPaved(grid, i - h + 1, j, i, j + w - 1)) {
                            return false;
                        }
                    }

                    if(j+1 < rl && row[j+1]==1 && j-w+1 >= 0) {
                        if(i>0 && grid[i-1][j] == 1 && i+h-1 < grid.length && canPaved(grid, i, j - w + 1, i + h - 1, j)) {
                            return false;
                        }
                        if(i+1 < grid.length && grid[i+1][j] == 1 && i-h+1 >= 0 && canPaved(grid, i - h + 1, j - w + 1, i, j)) {
                            return false;
                        }
                    }
                    continue;
                }

                if(1 < j-prev && j-prev <= w) {
                    return false;
                }

                prev = j;
            }
            if(1 < row.length-prev && row.length-prev <= w) {
                return false;
            }
        }

        for (int i = 0; i < rl; i++) {
            int prev = -1;
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i] == 0) {
                    continue;
                }

                if(1 < j-prev && j-prev <= h) {
                    return false;
                }

                prev = j;
            }

            if(1 < grid.length-prev && grid.length-prev <= h) {
                return false;
            }
        }
        return true;
    }
}