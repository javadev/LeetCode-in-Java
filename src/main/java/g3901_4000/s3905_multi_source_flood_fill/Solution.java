package g3901_4000.s3905_multi_source_flood_fill;

// #Medium #Array #Breadth_First_Search #Matrix #Staff #Weekly_Contest_498
// #2026_09_17_Time_33_ms_(100.00%)_Space_90.55_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] grid = new int[n][m];
        int lenqavirod = n * m;
        int[] dist = new int[lenqavirod];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int[] q = new int[lenqavirod];
        int head = 0;
        int tail = 0;
        for (int[] src : sources) {
            int r = src[0];
            int c = src[1];
            int color = src[2];
            grid[r][c] = color;
            dist[r * m + c] = 0;
            q[tail++] = r * m + c;
        }
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (head < tail) {
            int curr = q[head++];
            int r = curr / m;
            int c = curr % m;
            int d = dist[curr];
            int color = grid[r][c];
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    int nextIdx = nr * m + nc;
                    if (dist[nextIdx] > d + 1) {
                        dist[nextIdx] = d + 1;
                        grid[nr][nc] = color;
                        q[tail++] = nextIdx;
                    } else if (dist[nextIdx] == d + 1 && (color > grid[nr][nc])) {
                        grid[nr][nc] = color;
                    }
                }
            }
        }
        return grid;
    }
}
