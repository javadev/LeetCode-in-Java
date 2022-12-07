package g2201_2300.s2290_minimum_obstacle_removal_to_reach_corner;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2022_06_17_Time_172_ms_(82.27%)_Space_85.6_MB_(84.16%)

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int minimumObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dirs = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<State> q = new PriorityQueue<>((a, b) -> a.removed - b.removed);
        q.add(new State(0, 0, 0));
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        while (!q.isEmpty()) {
            State state = q.poll();
            if (state.r == n - 1 && state.c == m - 1) {
                return state.removed;
            }
            for (int[] d : dirs) {
                int nr = state.r + d[0];
                int nc = state.c + d[1];
                if (nr < 0 || nc < 0 || nr == n || nc == m || visited[nr][nc]) {
                    continue;
                }
                visited[nr][nc] = true;
                State next = new State(nr, nc, state.removed);
                if (grid[nr][nc] == 1) {
                    next.removed++;
                }
                q.add(next);
            }
        }
        return -1;
    }

    private static class State {
        int r;
        int c;
        int removed;

        State(int r, int c, int removed) {
            this.r = r;
            this.c = c;
            this.removed = removed;
        }
    }
}
