package g0801_0900.s0864_shortest_path_to_get_all_keys;

import java.util.LinkedList;

public class Solution {
    class Status {
        int key;
        int i;
        int j;

        public Status(int key, int i, int j) {
            this.key = key;
            this.i = i;
            this.j = j;
        }
    }

    public int shortestPathAllKeys(String[] grid) {
        int success = 0;
        int startI = 0;
        int startJ = 0;
        int rows = grid.length;
        int cols = grid[0].length();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char c = grid[i].charAt(j);
                if (c >= 'A' && c <= 'F') {
                    success |= 1 << (c - 'A');
                }

                if (c == '@') {
                    startI = i;
                    startJ = j;
                }
            }
        }
        int[][][] dist = new int[1 << 6][rows][cols];
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                for (int k = 0; k < dist[0][0].length; k++) {
                    dist[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }
        LinkedList<Status> queue = new LinkedList<>();
        queue.offer(new Status(0, startI, startJ));
        dist[0][startI][startJ] = 0;
        int path = 0;
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Status status = queue.poll();
                int key = status.key;
                int x = status.i;
                int y = status.j;
                if (key == success) {
                    return path;
                }
                for (int[] dir : dirs) {
                    int xx = x + dir[0];
                    int yy = y + dir[1];
                    if (xx >= 0
                            && xx < rows
                            && yy >= 0
                            && yy < cols
                            && grid[xx].charAt(yy) != '#') {
                        int nextKey = key;
                        char c = grid[xx].charAt(yy);
                        if (c >= 'a' && c <= 'f') {
                            nextKey = key | (1 << (c - 'a'));
                        }

                        if (c >= 'A' && c <= 'F' && (nextKey & (1 << (c - 'A'))) == 0) {
                            continue;
                        }
                        if (path + 1 < dist[nextKey][xx][yy]) {
                            dist[nextKey][xx][yy] = path + 1;
                            queue.offer(new Status(nextKey, xx, yy));
                        }
                    }
                }
            }
            path++;
        }
        return -1;
    }
}
