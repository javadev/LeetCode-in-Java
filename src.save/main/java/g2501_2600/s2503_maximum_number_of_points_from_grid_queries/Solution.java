package g2501_2600.s2503_maximum_number_of_points_from_grid_queries;

// #Hard #Array #Sorting #Breadth_First_Search #Heap_Priority_Queue #Union_Find
// #2023_03_20_Time_47_ms_(96.38%)_Space_59.9_MB_(49.28%)

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    private final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[] maxPoints(int[][] grid, int[] q) {
        int r = grid.length;
        int c = grid[0].length;
        int[] res = new int[q.length];
        Integer[] index = new Integer[q.length];
        for (int i = 0; i < q.length; i++) {
            index[i] = i;
        }
        Arrays.sort(index, Comparator.comparingInt(o -> q[o]));
        Queue<int[]> q1 = new ArrayDeque<>();
        PriorityQueue<int[]> q2 = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        q2.offer(new int[] {0, 0, grid[0][0]});
        boolean[][] visited = new boolean[r][c];
        int count = 0;
        visited[0][0] = true;
        for (int i = 0; i < q.length; i++) {
            int currLimit = q[index[i]];
            while (!q2.isEmpty() && q2.peek()[2] < currLimit) {
                q1.offer(q2.poll());
            }
            while (!q1.isEmpty()) {
                int[] curr = q1.poll();
                count++;
                for (int[] dir : dirs) {
                    int x = dir[0] + curr[0];
                    int y = dir[1] + curr[1];
                    if (x < 0 || y < 0 || x >= r || y >= c || visited[x][y]) {
                        continue;
                    }
                    if (!visited[x][y] && grid[x][y] < currLimit) {
                        q1.offer(new int[] {x, y, grid[x][y]});
                    } else {
                        q2.offer(new int[] {x, y, grid[x][y]});
                    }
                    visited[x][y] = true;
                }
            }
            res[index[i]] = count;
        }
        return res;
    }
}
