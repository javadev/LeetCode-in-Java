package g3301_3400.s3342_find_minimum_time_to_reach_last_room_ii;

// #Medium #2024_11_04_Time_573_ms_(100.00%)_Space_127_MB_(100.00%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int inf = Integer.MAX_VALUE;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], inf);
        }
        PriorityQueue<int[]> h = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // arrive time, i, j
        h.offer(new int[] {0, 0, 0});
        moveTime[0][0] = -1;
        while (!h.isEmpty()) {
            int[] cur = h.poll();
            int t = cur[0];
            int i = cur[1];
            int j = cur[2];
            if (t >= dp[i][j]) {
                continue;
            }
            if (i == n - 1 && j == m - 1) {
                return t;
            }
            dp[i][j] = t;
            int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
            for (int[] dir : dirs) {
                int x = i + dir[0];
                int y = j + dir[1];
                int c = (i + j) % 2 + 1;
                if (0 <= x && x < n && 0 <= y && y < m && dp[x][y] == inf) {
                    h.offer(new int[] {Math.max(moveTime[x][y], t) + c, x, y});
                }
            }
        }
        return -1;
    }
}
