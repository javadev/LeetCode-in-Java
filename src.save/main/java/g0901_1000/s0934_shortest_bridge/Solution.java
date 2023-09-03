package g0901_1000.s0934_shortest_bridge;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Graph_Theory_I_Day_6_Matrix_Related_Problems
// #2022_03_30_Time_6_ms_(97.87%)_Space_42.8_MB_(86.98%)

import java.util.ArrayDeque;

public class Solution {
    private static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int shortestBridge(int[][] grid) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        boolean flag = false;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length && !flag; i++) {
            for (int j = 0; j < grid[i].length && !flag; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, visited, q);
                    flag = true;
                }
            }
        }
        int level = -1;
        while (!q.isEmpty()) {
            int size = q.size();
            level++;
            while (size-- > 0) {
                Pair rem = q.removeFirst();
                for (int[] dir : dirs) {
                    int newrow = rem.x + dir[0];
                    int newcol = rem.y + dir[1];
                    if (newrow >= 0
                            && newcol >= 0
                            && newrow < grid.length
                            && newcol < grid[0].length
                            && !visited[newrow][newcol]) {
                        if (grid[newrow][newcol] == 1) {
                            return level;
                        }
                        q.add(new Pair(newrow, newcol));
                        visited[newrow][newcol] = true;
                    }
                }
            }
        }
        return -1;
    }

    private void dfs(int[][] grid, int row, int col, boolean[][] visited, ArrayDeque<Pair> q) {
        visited[row][col] = true;
        q.add(new Pair(row, col));
        for (int[] dir : dirs) {
            int newrow = row + dir[0];
            int newcol = col + dir[1];
            if (newrow >= 0
                    && newcol >= 0
                    && newrow < grid.length
                    && newcol < grid[0].length
                    && !visited[newrow][newcol]
                    && grid[newrow][newcol] == 1) {
                dfs(grid, newrow, newcol, visited, q);
            }
        }
    }
}
