package g3501_3600.s3552_grid_teleportation_traversal;

// #Medium #Array #Hash_Table #Breadth_First_Search #Matrix
// #2025_05_20_Time_146_ms_(98.62%)_Space_60.98_MB_(99.48%)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

@SuppressWarnings({"java:S107", "unchecked"})
public class Solution {
    private static final int[][] ADJACENT = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    private List<int[]>[] initializePortals(int m, int n, String[] matrix) {
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
        return portalsToPositions;
    }

    private void initializeQueue(
            Queue<int[]> queue,
            boolean[][] visited,
            String[] matrix,
            List<int[]>[] portalsToPositions) {
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
    }

    private boolean isValidMove(int r, int c, int m, int n, boolean[][] visited, String[] matrix) {
        return !(r < 0 || r == m || c < 0 || c == n || visited[r][c] || matrix[r].charAt(c) == '#');
    }

    private boolean processPortal(
            int r,
            int c,
            int m,
            int n,
            Queue<int[]> queue,
            boolean[][] visited,
            String[] matrix,
            List<int[]>[] portalsToPositions) {
        int idx = matrix[r].charAt(c) - 'A';
        for (int[] pos : portalsToPositions[idx]) {
            if (pos[0] == m - 1 && pos[1] == n - 1) {
                return true;
            }
            queue.offer(pos);
            visited[pos[0]][pos[1]] = true;
        }
        return false;
    }

    public int minMoves(String[] matrix) {
        int m = matrix.length;
        int n = matrix[0].length();
        if ((m == 1 && n == 1)
                || (matrix[0].charAt(0) != '.'
                        && matrix[m - 1].charAt(n - 1) == matrix[0].charAt(0))) {
            return 0;
        }
        List<int[]>[] portalsToPositions = initializePortals(m, n, matrix);
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        initializeQueue(queue, visited, matrix, portalsToPositions);
        int moves = 0;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            while (sz-- > 0) {
                int[] curr = queue.poll();
                for (int[] adj : ADJACENT) {
                    int r = adj[0] + Objects.requireNonNull(curr)[0];
                    int c = adj[1] + curr[1];
                    if (!isValidMove(r, c, m, n, visited, matrix)) {
                        continue;
                    }
                    if (matrix[r].charAt(c) != '.') {
                        if (processPortal(r, c, m, n, queue, visited, matrix, portalsToPositions)) {
                            return moves + 1;
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
