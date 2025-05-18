package g3501_3600.s3552_grid_teleportation_traversal;

// #Medium #2025_05_18_Time_133_ms_(99.44%)_Space_60.94_MB_(99.44%)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    private static final int[][] ADJACENT = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int minMoves(String[] matrix) {
        int m = matrix.length;
        int n = matrix[0].length();
        if ((m == 1 && n == 1)
                || (matrix[0].charAt(0) != '.'
                        && matrix[m - 1].charAt(n - 1) == matrix[0].charAt(0))) {
            return 0;
        }
        List<int[]>[] portalsToPositions = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            portalsToPositions[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char curr = matrix[i].charAt(j);
                if (curr >= 'A' && curr <= 'Z') {
                    portalsToPositions[curr - 'A'].add(new int[] {i, j});
                }
            }
        }
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        if (matrix[0].charAt(0) != '.') {
            int idx = matrix[0].charAt(0) - 'A';
            for (int[] pos : portalsToPositions[idx]) {
                queue.offer(pos);
                visited[pos[0]][pos[1]] = true;
            }
        } else {
            queue.offer(new int[] {0, 0});
        }
        visited[0][0] = true;
        int moves = 0;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            while (sz-- > 0) {
                int[] curr = queue.poll();
                for (int[] adj : ADJACENT) {
                    int r = adj[0] + curr[0];
                    int c = adj[1] + curr[1];
                    if (r < 0
                            || r == m
                            || c < 0
                            || c == n
                            || visited[r][c]
                            || matrix[r].charAt(c) == '#') {
                        continue;
                    }
                    if (matrix[r].charAt(c) != '.') {
                        int idx = matrix[r].charAt(c) - 'A';
                        for (int[] pos : portalsToPositions[idx]) {
                            if (pos[0] == m - 1 && pos[1] == n - 1) {
                                return moves + 1;
                            }
                            queue.offer(pos);
                            visited[pos[0]][pos[1]] = true;
                        }
                    } else {
                        if (r == m - 1 && c == n - 1) {
                            return moves + 1;
                        }
                        queue.offer(new int[] {r, c});
                        visited[r][c] = true;
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}
