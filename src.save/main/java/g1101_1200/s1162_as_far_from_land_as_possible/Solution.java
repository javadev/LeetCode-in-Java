package g1101_1200.s1162_as_far_from_land_as_possible;

// #Medium #Array #Dynamic_Programming #Breadth_First_Search #Matrix
// #Graph_Theory_I_Day_4_Matrix_Related_Problems
// #2023_06_02_Time_16_ms_(62.40%)_Space_44_MB_(42.90%)

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q.add(new int[] {i, j});
                    vis[i][j] = true;
                }
            }
        }
        if (q.isEmpty() || q.size() == n * m) {
            return -1;
        }
        int[] dir = {-1, 0, 1, 0, -1};
        int maxDistance = 0;
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] top = q.poll();
                int currX = Objects.requireNonNull(top)[0];
                int currY = top[1];
                for (int j = 0; j < dir.length - 1; j++) {
                    int x = currX + dir[j];
                    int y = currY + dir[j + 1];

                    if (x >= 0 && x != n && y >= 0 && y != n && !vis[x][y]) {
                        maxDistance = Math.max(maxDistance, level);
                        vis[x][y] = true;
                        q.add(new int[] {x, y});
                    }
                }
            }
            level++;
        }
        return maxDistance;
    }
}
