package g0701_0800.s0778_swim_in_rising_water;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Matrix
// #Heap_Priority_Queue #Union_Find #2022_03_26_Time_13_ms_(69.75%)_Space_51.8_MB_(12.57%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private int[] dir = new int[] {-1, 0, 1, 0, -1};

    public int swimInWater(int[][] grid) {
        int max = 0;
        // find the maximum value in the matrix
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, ints[j]);
            }
        }
        int l = 0;
        int r = max;
        int res = 0;
        // perform binary search
        while (l <= r) {
            // find test water level
            int mid = (l + r) / 2;
            // if you can reach destination with current water level, store it as an answer and try
            // lowering water level
            if (bfs(grid, mid)) {
                res = mid;
                r = mid - 1;
            } else {
                // otherwise increase water level and try again
                l = mid + 1;
            }
        }
        return res;
    }

    public boolean bfs(int[][] grid, int limit) {
        // use queue to process cells starting from top left corner
        Queue<int[]> que = new LinkedList<>();
        // boolean array to keep track of visited cells
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        // we start from top left corner
        que.add(new int[] {0, 0});
        visited[0][0] = true;
        while (!que.isEmpty()) {
            // get current cell
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            // if value of current cell is greater than limit return false
            if (grid[x][y] > limit) {
                return false;
            }
            // if we reached the destination return true
            if (x == grid.length - 1 && y == grid[0].length - 1) {
                return true;
            }
            // check cells in all 4 directions
            for (int i = 0; i < dir.length - 1; i++) {
                int dx = x + dir[i];
                int dy = y + dir[i + 1];
                // if neighboring cell is in bounds, and hasn't been visited yet,
                // and its value is less than current water level, add it to visited array and to
                // the queue
                if (dx >= 0
                        && dy >= 0
                        && dx < grid.length
                        && dy < grid[0].length
                        && !visited[dx][dy]
                        && grid[dx][dy] <= limit) {
                    visited[dx][dy] = true;
                    que.add(new int[] {dx, dy});
                }
            }
        }
        return false;
    }
}
