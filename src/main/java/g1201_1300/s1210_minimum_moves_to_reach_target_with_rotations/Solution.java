package g1201_1300.s1210_minimum_moves_to_reach_target_with_rotations;

// #Hard #Array #Breadth_First_Search #Matrix #2022_03_09_Time_29_ms_(78.57%)_Space_53.8_MB_(76.19%)

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Solution {
    public int minimumMoves(int[][] grid) {
        int n = grid.length;
        int[][] visited = new int[n][n];
        Queue<int[]> bq = new LinkedList<>();
        bq.offer(new int[] {0, 0, 1});
        visited[0][0] |= 1;
        int level = 0;
        while (!bq.isEmpty()) {
            int levelSize = bq.size();
            for (int l = 0; l < levelSize; l++) {
                int[] cur = bq.poll();
                int xtail = Objects.requireNonNull(cur)[0];
                int ytail = cur[1];
                int dir = cur[2];
                if (xtail == n - 1 && ytail == n - 2 && dir == 1) {
                    return level;
                }
                int xhead = xtail + (dir == 1 ? 0 : 1);
                int yhead = ytail + (dir == 1 ? 1 : 0);
                if (dir == 2) {
                    if (ytail + 1 < n
                            && grid[xtail][ytail + 1] != 1
                            && grid[xtail + 1][ytail + 1] != 1) {
                        if ((visited[xtail][ytail] & 1) == 0) {
                            bq.offer(new int[] {xtail, ytail, 1});
                            visited[xtail][ytail] |= 1;
                        }
                        if ((visited[xtail][ytail + 1] & 2) == 0) {
                            bq.offer(new int[] {xtail, ytail + 1, 2});
                            visited[xtail][ytail + 1] |= 2;
                        }
                    }
                    if (xhead + 1 < n
                            && grid[xhead + 1][yhead] != 1
                            && (visited[xhead][yhead] & 2) == 0) {
                        bq.offer(new int[] {xhead, yhead, 2});
                        visited[xhead][yhead] |= 2;
                    }
                } else {
                    if (xtail + 1 < n
                            && grid[xtail + 1][ytail] != 1
                            && grid[xtail + 1][ytail + 1] != 1) {
                        if ((visited[xtail][ytail] & 2) == 0) {
                            bq.offer(new int[] {xtail, ytail, 2});
                            visited[xtail][ytail] |= 2;
                        }
                        if ((visited[xtail + 1][ytail] & 1) == 0) {
                            bq.offer(new int[] {xtail + 1, ytail, 1});
                            visited[xtail + 1][ytail] |= 1;
                        }
                    }
                    if (yhead + 1 < n
                            && grid[xhead][yhead + 1] != 1
                            && (visited[xhead][yhead] & 1) == 0) {
                        bq.offer(new int[] {xhead, yhead, 1});
                        visited[xhead][yhead] |= 1;
                    }
                }
            }
            level += 1;
        }
        return -1;
    }
}
