package g1201_1300.s1293_shortest_path_in_a_grid_with_obstacles_elimination;

// #Hard #Array #Breadth_First_Search #Matrix #2022_03_10_Time_35_ms_(63.17%)_Space_53.3_MB_(37.63%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int shortestPath(int[][] grid, int k) {
        if (grid.length == 1 && grid[0].length == 1 && grid[0][0] == 0) {
            return 0;
        }
        // 4 potential moves:
        int[][] moves = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int m = grid.length;
        int n = grid[0].length;
        // use obs to record the min total obstacles when traverse to the position
        int[][] obs = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                obs[i][j] = Integer.MAX_VALUE;
            }
        }
        obs[0][0] = 0;
        // Queue to record {x cord, y cord, total obstacles when trvavers to this position}
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {0, 0, 0});
        int level = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            level++;
            for (int i = 0; i < size; i++) {
                int[] current = que.poll();
                for (int[] move : moves) {
                    int[] next = new int[] {current[0] + move[0], current[1] + move[1]};
                    if (next[0] == m - 1 && next[1] == n - 1) {
                        return level;
                    }
                    if (next[0] < 0 || next[0] > (m - 1) || next[1] < 0 || next[1] > (n - 1)) {
                        continue;
                    }
                    if (current[2] + grid[next[0]][next[1]] < obs[next[0]][next[1]]
                            && current[2] + grid[next[0]][next[1]] <= k) {
                        obs[next[0]][next[1]] = current[2] + grid[next[0]][next[1]];
                        que.add(new int[] {next[0], next[1], obs[next[0]][next[1]]});
                    }
                }
            }
        }
        return -1;
    }
}
