package g3201_3300.s3283_maximum_number_of_moves_to_kill_all_pawns;

// #Hard #Array #Math #Breadth_First_Search #Bit_Manipulation #Bitmask #Game_Theory
// #2025_03_22_Time_126_ms_(100.00%)_Space_48.23_MB_(72.09%)

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    private static final int[][] DIRECTIONS = {
        {2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };

    private void initializePositions(int[][] positions, int[][] pos, int kx, int ky) {
        int n = positions.length;
        for (int i = 0; i < n; i++) {
            int x = positions[i][0];
            int y = positions[i][1];
            pos[x][y] = i;
        }
        pos[kx][ky] = n;
    }

    private void calculateDistances(int[][] positions, int[][] pos, int[][] distances) {
        int n = positions.length;
        for (int i = 0; i < n; i++) {
            int count = n - i;
            boolean[][] visited = new boolean[50][50];
            visited[positions[i][0]][positions[i][1]] = true;
            Queue<int[]> que = new ArrayDeque<>();
            que.offer(new int[] {positions[i][0], positions[i][1]});
            int steps = 1;
            while (!que.isEmpty() && count > 0) {
                int size = que.size();
                while (size-- > 0) {
                    int[] cur = que.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for (int[] d : DIRECTIONS) {
                        int nx = x + d[0];
                        int ny = y + d[1];
                        if (0 <= nx && nx < 50 && 0 <= ny && ny < 50 && !visited[nx][ny]) {
                            que.offer(new int[] {nx, ny});
                            visited[nx][ny] = true;
                            int j = pos[nx][ny];
                            if (j > i) {
                                distances[i][j] = distances[j][i] = steps;
                                if (--count == 0) {
                                    break;
                                }
                            }
                        }
                    }
                    if (count == 0) {
                        break;
                    }
                }
                steps++;
            }
        }
    }

    private int calculateDP(int n, int[][] distances) {
        int m = (1 << n) - 1;
        int[][] dp = new int[1 << n][n + 1];
        for (int mask = 1; mask < (1 << n); mask++) {
            boolean isEven = (Integer.bitCount(m ^ mask)) % 2 == 0;
            for (int i = 0; i <= n; i++) {
                int result = 0;
                if (isEven) {
                    for (int j = 0; j < n; j++) {
                        if ((mask & (1 << j)) > 0) {
                            result = Math.max(result, dp[mask ^ (1 << j)][j] + distances[i][j]);
                        }
                    }
                } else {
                    result = Integer.MAX_VALUE;
                    for (int j = 0; j < n; j++) {
                        if ((mask & (1 << j)) > 0) {
                            result = Math.min(result, dp[mask ^ (1 << j)][j] + distances[i][j]);
                        }
                    }
                }
                dp[mask][i] = result;
            }
        }
        return dp[m][n];
    }

    public int maxMoves(int kx, int ky, int[][] positions) {
        int n = positions.length;
        int[][] pos = new int[50][50];
        initializePositions(positions, pos, kx, ky);
        int[][] distances = new int[n + 1][n + 1];
        calculateDistances(positions, pos, distances);
        return calculateDP(n, distances);
    }
}
