package g3201_3300.s3286_find_a_safe_walk_through_a_grid;

// #Medium #Array #Matrix #Heap_Priority_Queue #Graph #Shortest_Path #Breadth_First_Search
// #2024_09_15_Time_90_ms_(100.00%)_Space_46.6_MB_(100.00%)

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();
        int[] dr = new int[] {0, 0, 1, -1};
        int[] dc = new int[] {1, -1, 0, 0};
        boolean[][][] visited = new boolean[n][m][health + 1];
        Queue<int[]> bfs = new LinkedList<>();
        bfs.add(new int[] {0, 0, health - grid.get(0).get(0)});
        visited[0][0][health - grid.get(0).get(0)] = true;
        while (!bfs.isEmpty()) {
            int size = bfs.size();
            while (size-- > 0) {
                int[] currNode = bfs.poll();
                int r = Objects.requireNonNull(currNode)[0];
                int c = currNode[1];
                int h = currNode[2];
                if (r == n - 1 && c == m - 1 && h > 0) {
                    return true;
                }
                for (int k = 0; k < 4; k++) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];
                    if (isValidMove(nr, nc, n, m)) {
                        int nh = h - grid.get(nr).get(nc);
                        if (nh >= 0 && !visited[nr][nc][nh]) {
                            visited[nr][nc][nh] = true;
                            bfs.add(new int[] {nr, nc, nh});
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean isValidMove(int r, int c, int n, int m) {
        return r >= 0 && c >= 0 && r < n && c < m;
    }
}
