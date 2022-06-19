package g2201_2300.s2258_escape_the_spreading_fire;

// #Hard #Array #Breadth_First_Search #Binary_Search #Matrix
// #2022_06_18_Time_33_ms_(77.40%)_Space_44.2_MB_(94.95%)

import java.util.ArrayDeque;

public class Solution {
    private int[][] setFire(int[][] grid, int[][] dir) {
        int n = grid.length;
        int m = grid[0].length;
        ArrayDeque<Integer> bfs = new ArrayDeque<>();
        int[][] fire = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                fire[i][j] = Integer.MAX_VALUE;
                if (grid[i][j] == 1) {
                    fire[i][j] = 0;
                    bfs.add(i * m + j);
                }
                if (grid[i][j] == 2) {
                    fire[i][j] = 0;
                }
            }
        }
        while (!bfs.isEmpty()) {
            int rm = bfs.removeFirst();
            int x = rm / m;
            int y = rm % m;
            for (int d = 0; d < 4; d++) {
                int nx = x + dir[d][0];
                int ny = y + dir[d][1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && fire[nx][ny] == Integer.MAX_VALUE) {
                    fire[nx][ny] = fire[x][y] + 1;
                    bfs.add(nx * m + ny);
                }
            }
        }
        return fire;
    }

    private boolean isPoss(int[][] fire, int[][] dir, int time) {
        if (time >= fire[0][0]) {
            return false;
        }
        int n = fire.length;
        int m = fire[0].length;
        ArrayDeque<Integer> bfs = new ArrayDeque<>();
        bfs.add(0);
        boolean[][] isVis = new boolean[n][m];
        isVis[0][0] = true;
        while (!bfs.isEmpty()) {
            int size = bfs.size();
            while (size-- > 0) {
                int rm = bfs.removeFirst();
                int x = rm / m;
                int y = rm % m;
                if (x == n - 1 && y == m - 1) {
                    return true;
                }
                for (int d = 0; d < 4; d++) {
                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && !isVis[nx][ny]) {
                        if (nx == n - 1 && ny == m - 1) {
                            if (time + 1 <= fire[nx][ny]) {
                                isVis[nx][ny] = true;
                                bfs.add(nx * m + ny);
                            }
                        } else {
                            if (time + 1 < fire[nx][ny]) {
                                isVis[nx][ny] = true;
                                bfs.add(nx * m + ny);
                            }
                        }
                    }
                }
            }
            time++;
        }
        return false;
    }

    public int maximumMinutes(int[][] grid) {
        int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        int[][] fire = setFire(grid, dir);
        int lo = 0;
        int hi = (int) 1e9;
        while (lo <= hi) {
            int mid = ((hi - lo) >> 1) + lo;
            if (isPoss(fire, dir, mid)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return hi;
    }
}
