package g1801_1900.s1834_single_threaded_cpu;

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2022_05_07_Time_134_ms_(83.22%)_Space_100.6_MB_(75.23%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[] getOrder(int[][] tasks1) {
        int n = tasks1.length;
        int[][] tasks = new int[n][3];
        for (int i = 0; i < n; i++) {
            tasks[i] = new int[] {tasks1[i][0], tasks1[i][1], i};
        }
        Arrays.sort(tasks, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>(
                        (a, b) -> {
                            if (a[1] == b[1]) {
                                return a[2] - b[2];
                            } else {
                                return a[1] - b[1];
                            }
                        });
        int time = tasks[0][0];
        int[] taskOrderResult = new int[n];
        int i = 0;
        int index = 0;
        while (!minHeap.isEmpty() || i < n) {
            while (i < n && time >= tasks[i][0]) {
                minHeap.add(tasks[i++]);
            }
            if (!minHeap.isEmpty()) {
                int[] task = minHeap.remove();
                taskOrderResult[index++] = task[2];
                time += task[1];
            } else {
                time = tasks[i][0];
            }
        }
        return taskOrderResult;
    }
}
