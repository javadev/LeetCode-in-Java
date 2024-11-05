package g3301_3400.s3341_find_minimum_time_to_reach_last_room_i;

// #Medium #Array #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2024_11_05_Time_8_ms_(67.58%)_Space_45.4_MB_(19.79%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int rows = moveTime.length;
        int cols = moveTime[0].length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[][] time = new int[rows][cols];
        for (int[] row : time) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minHeap.offer(new int[] {0, 0, 0});
        time[0][0] = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentTime = current[0];
            int x = current[1];
            int y = current[2];
            if (x == rows - 1 && y == cols - 1) {
                return currentTime;
            }
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                    int waitTime = Math.max(moveTime[newX][newY] - currentTime, 0);
                    int newTime = currentTime + 1 + waitTime;
                    if (newTime < time[newX][newY]) {
                        time[newX][newY] = newTime;
                        minHeap.offer(new int[] {newTime, newX, newY});
                    }
                }
            }
        }
        return -1;
    }
}
