package g3201_3300.s3283_maximum_number_of_moves_to_kill_all_pawns;

// #Hard #2024_09_09_Time_250_ms_(98.43%)_Space_50.1_MB_(66.27%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static final int[][] KNIGHT_MOVES = {
        {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
        {1, -2}, {1, 2}, {2, -1}, {2, 1}
    };
    private int[][] distances;
    private Integer[][] memo;

    public int maxMoves(int kx, int ky, int[][] positions) {
        int n = positions.length;
        distances = new int[n + 1][n + 1];
        memo = new Integer[n + 1][1 << n];
        // Calculate distances between all pairs of positions (including knight's initial position)
        for (int i = 0; i < n; i++) {
            distances[n][i] = calculateMoves(kx, ky, positions[i][0], positions[i][1]);
            for (int j = i + 1; j < n; j++) {
                int dist =
                        calculateMoves(
                                positions[i][0], positions[i][1], positions[j][0], positions[j][1]);
                distances[i][j] = distances[j][i] = dist;
            }
        }
        return minimax(n, (1 << n) - 1, true);
    }

    private int minimax(int lastPos, int remainingPawns, boolean isAlice) {
        if (remainingPawns == 0) {
            return 0;
        }
        if (memo[lastPos][remainingPawns] != null) {
            return memo[lastPos][remainingPawns];
        }
        int result = isAlice ? 0 : Integer.MAX_VALUE;
        for (int i = 0; i < distances.length - 1; i++) {
            if ((remainingPawns & (1 << i)) != 0) {
                int newRemainingPawns = remainingPawns & ~(1 << i);
                int moveValue = distances[lastPos][i] + minimax(i, newRemainingPawns, !isAlice);

                if (isAlice) {
                    result = Math.max(result, moveValue);
                } else {
                    result = Math.min(result, moveValue);
                }
            }
        }
        memo[lastPos][remainingPawns] = result;
        return result;
    }

    private int calculateMoves(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return 0;
        }
        boolean[][] visited = new boolean[50][50];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x1, y1, 0});
        visited[x1][y1] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];
            for (int[] move : KNIGHT_MOVES) {
                int nx = x + move[0], ny = y + move[1];
                if (nx == x2 && ny == y2) {
                    return moves + 1;
                }
                if (nx >= 0 && nx < 50 && ny >= 0 && ny < 50 && !visited[nx][ny]) {
                    queue.offer(new int[] {nx, ny, moves + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        // Should never reach here if input is valid
        return -1;
    }
}
