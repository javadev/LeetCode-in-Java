package g1601_1700.s1631_path_with_minimum_effort;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Matrix
// #Heap_Priority_Queue #Union_Find #2022_04_19_Time_75_ms_(60.52%)_Space_42.8_MB_(86.40%)

import java.util.PriorityQueue;

@SuppressWarnings("java:S1210")
public class Solution {
    private static class Pair implements Comparable<Pair> {
        int row;
        int col;
        int diff;

        Pair(int row, int col, int diff) {
            this.row = row;
            this.col = col;
            this.diff = diff;
        }

        public int compareTo(Pair o) {
            return this.diff - o.diff;
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0, 0));
        boolean[][] vis = new boolean[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int min = Integer.MAX_VALUE;
        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            int row = p.row;
            int col = p.col;
            int diff = p.diff;
            if (vis[row][col]) {
                continue;
            }
            vis[row][col] = true;
            if (row == n - 1 && col == m - 1) {
                min = Math.min(min, diff);
            }
            for (int i = 0; i < 4; i++) {
                int r = row + dx[i];
                int c = col + dy[i];
                if (r < 0 || c < 0 || r >= n || c >= m || vis[r][c]) {
                    continue;
                }
                pq.add(new Pair(r, c, Math.max(diff, Math.abs(heights[r][c] - heights[row][col]))));
            }
        }
        return min;
    }
}
