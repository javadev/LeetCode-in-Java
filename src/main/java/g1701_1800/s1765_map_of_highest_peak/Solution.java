package g1701_1800.s1765_map_of_highest_peak;

// #Medium #Array #Breadth_First_Search #Matrix
// #2022_04_30_Time_64_ms_(85.40%)_Space_139.8_MB_(98.14%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private final int[] dir = {0, 1, 0, -1, 0};

    public int[][] highestPeak(int[][] isWater) {
        int h = 1;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[0].length; j++) {
                isWater[i][j] = isWater[i][j] == 1 ? 0 : -1;
                if (isWater[i][j] == 0) {
                    q.add(new int[] {i, j});
                }
            }
        }
        while (!q.isEmpty()) {
            Queue<int[]> q1 = new LinkedList<>();
            for (int[] cur : q) {
                int x = cur[0];
                int y = cur[1];
                for (int i = 0; i < 4; i++) {
                    int nx = x + dir[i];
                    int ny = y + dir[i + 1];
                    if (nx >= 0
                            && nx < isWater.length
                            && ny >= 0
                            && ny < isWater[0].length
                            && isWater[nx][ny] == -1) {
                        isWater[nx][ny] = h;
                        q1.add(new int[] {nx, ny});
                    }
                }
            }
            h++;
            q = q1;
        }
        return isWater;
    }
}
