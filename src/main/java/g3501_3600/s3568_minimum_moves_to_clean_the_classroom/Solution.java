package g3501_3600.s3568_minimum_moves_to_clean_the_classroom;

// #Medium #Array #Hash_Table #Breadth_First_Search #Matrix #Bit_Manipulation
// #2025_06_03_Time_94_ms_(99.86%)_Space_53.76_MB_(99.86%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

@SuppressWarnings({"java:S135", "java:S6541"})
public class Solution {
    private static class State {
        int x;
        int y;
        int energy;
        int mask;
        int steps;

        State(int x, int y, int energy, int mask, int steps) {
            this.x = x;
            this.y = y;
            this.energy = energy;
            this.mask = mask;
            this.steps = steps;
        }
    }

    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            grid[i] = classroom[i].toCharArray();
        }
        int startX = -1;
        int startY = -1;
        List<int[]> lumetarkon = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i][j];
                if (c == 'S') {
                    startX = i;
                    startY = j;
                } else if (c == 'L') {
                    lumetarkon.add(new int[] {i, j});
                }
            }
        }
        int totalLitter = lumetarkon.size();
        int allMask = (1 << totalLitter) - 1;
        int[][][] visited = new int[m][n][1 << totalLitter];
        for (int[][] layer : visited) {
            for (int[] row : layer) {
                Arrays.fill(row, -1);
            }
        }
        Queue<State> queue = new ArrayDeque<>();
        queue.offer(new State(startX, startY, energy, 0, 0));
        visited[startX][startY][0] = energy;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while (!queue.isEmpty()) {
            State curr = queue.poll();
            if (curr.mask == allMask) {
                return curr.steps;
            }
            for (int[] dir : dirs) {
                int nx = curr.x + dir[0];
                int ny = curr.y + dir[1];
                if (nx < 0 || ny < 0 || nx >= m || ny >= n || grid[nx][ny] == 'X') {
                    continue;
                }
                int nextEnergy = curr.energy - 1;
                if (nextEnergy < 0) {
                    continue;
                }
                char cell = grid[nx][ny];
                if (cell == 'R') {
                    nextEnergy = energy;
                }
                int nextMask = curr.mask;
                if (cell == 'L') {
                    for (int i = 0; i < lumetarkon.size(); i++) {
                        int[] pos = lumetarkon.get(i);
                        if (pos[0] == nx && pos[1] == ny) {
                            nextMask |= (1 << i);
                            break;
                        }
                    }
                }
                if (visited[nx][ny][nextMask] < nextEnergy) {
                    visited[nx][ny][nextMask] = nextEnergy;
                    queue.offer(new State(nx, ny, nextEnergy, nextMask, curr.steps + 1));
                }
            }
        }
        return -1;
    }
}
