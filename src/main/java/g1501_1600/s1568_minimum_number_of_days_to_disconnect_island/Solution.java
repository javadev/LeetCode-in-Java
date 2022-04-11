package g1501_1600.s1568_minimum_number_of_days_to_disconnect_island;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Strongly_Connected_Component
// #2022_04_11_Time_1_ms_(100.00%)_Space_41.8_MB_(91.49%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S107")
public class Solution {
    private final int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int minDays(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int numOfIslands = 0;
        boolean hasArticulationPoint = false;
        int color = 1;
        int minIslandSize = m * n;
        int[][] time = new int[m][n];
        int[][] low = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    numOfIslands++;
                    color++;
                    List<Integer> articulationPoints = new ArrayList<>();
                    int[] islandSize = new int[1];
                    tarjan(i, j, -1, -1, 0, time, low, grid, articulationPoints, color, islandSize);
                    minIslandSize = Math.min(minIslandSize, islandSize[0]);
                    if (!articulationPoints.isEmpty()) {
                        hasArticulationPoint = true;
                    }
                }
            }
        }
        if (numOfIslands >= 2) {
            return 0;
        }
        if (numOfIslands == 0) {
            return 0;
        }
        if (numOfIslands == 1 && minIslandSize == 1) {
            return 1;
        }
        return hasArticulationPoint ? 1 : 2;
    }

    private void tarjan(
            int x,
            int y,
            int prex,
            int prey,
            int time,
            int[][] times,
            int[][] lows,
            int[][] grid,
            List<Integer> articulationPoints,
            int color,
            int[] islandSize) {
        times[x][y] = time;
        lows[x][y] = time;
        grid[x][y] = color;
        islandSize[0]++;
        int children = 0;
        for (int[] dir : dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length) {
                continue;
            }
            if (grid[nx][ny] == 1) {
                children++;
                tarjan(
                        nx,
                        ny,
                        x,
                        y,
                        time + 1,
                        times,
                        lows,
                        grid,
                        articulationPoints,
                        color,
                        islandSize);
                lows[x][y] = Math.min(lows[x][y], lows[nx][ny]);
                if (prex != -1 && lows[nx][ny] >= time) {
                    articulationPoints.add(x * grid.length + y);
                }
            } else if ((nx != prex || ny != prey) && grid[nx][ny] != 0) {
                lows[x][y] = Math.min(lows[x][y], times[nx][ny]);
            }
        }
        if (prex == -1 && children > 1) {
            articulationPoints.add(x * grid.length + y);
        }
    }
}
