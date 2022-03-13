package g1201_1300.s1263_minimum_moves_to_move_a_box_to_their_target_location;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue
// #2022_03_13_Time_16_ms_(76.00%)_Space_47.8_MB_(60.00%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private int n;
    private int m;
    private char[][] grid;
    private final int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int minPushBox(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        this.grid = grid;
        int[] box = new int[2];
        int[] target = new int[2];
        int[] player = new int[2];
        findLocations(box, target, player);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {box[0], box[1], player[0], player[1]});
        // for 4 directions
        boolean[][][] visited = new boolean[n][m][4];
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] cur = q.poll();
                if (cur != null && cur[0] == target[0] && cur[1] == target[1]) {
                    return steps;
                }
                for (int i = 0; i < 4; i++) {
                    if (cur != null) {
                        int[] newPlayerLoc = new int[] {cur[0] + dirs[i][0], cur[1] + dirs[i][1]};
                        int[] newBoxLoc = new int[] {cur[0] - dirs[i][0], cur[1] - dirs[i][1]};
                        if (visited[cur[0]][cur[1]][i]
                                || isOutOfBounds(newPlayerLoc, newBoxLoc)
                                || !isReachable(newPlayerLoc, cur)) {
                            continue;
                        }
                        visited[cur[0]][cur[1]][i] = true;
                        q.offer(new int[] {newBoxLoc[0], newBoxLoc[1], cur[0], cur[1]});
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private boolean isReachable(int[] targetPlayerLoc, int[] cur) {
        boolean[][] visited = new boolean[n][m];
        visited[cur[0]][cur[1]] = true;
        visited[cur[2]][cur[3]] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {cur[2], cur[3]});
        while (!q.isEmpty()) {
            int[] playerLoc = q.poll();
            if (playerLoc[0] == targetPlayerLoc[0] && playerLoc[1] == targetPlayerLoc[1]) {
                return true;
            }
            for (int[] d : dirs) {
                int x = playerLoc[0] + d[0];
                int y = playerLoc[1] + d[1];
                if (isOutOfBounds(x, y) || visited[x][y]) {
                    continue;
                }
                visited[x][y] = true;
                q.offer(new int[] {x, y});
            }
        }
        return false;
    }

    private boolean isOutOfBounds(int[] player, int[] box) {
        return isOutOfBounds(player[0], player[1]) || isOutOfBounds(box[0], box[1]);
    }

    private boolean isOutOfBounds(int x, int y) {
        return (x < 0 || y < 0 || x == n || y == m || grid[x][y] == '#');
    }

    private void findLocations(int[] box, int[] target, int[] player) {
        boolean p = false;
        boolean t = false;
        boolean b = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'S') {
                    player[0] = i;
                    player[1] = j;
                    p = true;
                } else if (grid[i][j] == 'T') {
                    target[0] = i;
                    target[1] = j;
                    t = true;
                } else if (grid[i][j] == 'B') {
                    box[0] = i;
                    box[1] = j;
                    b = true;
                }
                if (p && b && t) {
                    // found all
                    return;
                }
            }
        }
    }
}
