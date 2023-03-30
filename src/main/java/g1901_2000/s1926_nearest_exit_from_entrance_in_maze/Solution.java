package g1901_2000.s1926_nearest_exit_from_entrance_in_maze;

// #Medium #Array #Breadth_First_Search #Matrix #Graph_Theory_I_Day_6_Matrix_Related_Problems
// #2022_05_14_Time_12_ms_(40.55%)_Space_43.3_MB_(92.19%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int[] directions = new int[] {0, 1, 0, -1, 0};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {entrance[0], entrance[1], 0});
        boolean[][] visited = new boolean[m][n];
        visited[entrance[0]][entrance[1]] = true;
        int shortestSteps = m * n;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currX = curr[0];
            int currY = curr[1];
            int currSteps = curr[2];
            for (int i = 0; i < directions.length - 1; i++) {
                int nextX = currX + directions[i];
                int nextY = currY + directions[i + 1];
                //Decompose conditional refactoring technique
                boolean isValidMove = isValidMove(nextX, nextY, maze, visited, m, n);
                if (isValidMove) {
                    visited[nextX][nextY] = true;
                    if (isExit(nextX, nextY, m, n)) {
                        shortestSteps = Math.min(shortestSteps, currSteps + 1);
                    } else {
                        queue.offer(new int[] {nextX, nextY, currSteps + 1});
                    }
                }
            }
        }
        return shortestSteps == m * n ? -1 : shortestSteps;
    }

    private boolean isValidMove(int x, int y, char[][] maze, boolean[][] visited, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == '.' && !visited[x][y];
    }

    private boolean isExit(int x, int y, int m, int n) {
        return x == 0 || x == m - 1 || y == 0 || y == n - 1;
    }
}

