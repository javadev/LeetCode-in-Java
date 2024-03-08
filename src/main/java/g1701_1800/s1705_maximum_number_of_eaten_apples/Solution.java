package g1701_1800.s1705_maximum_number_of_eaten_apples;

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2022_04_24_Time_53_ms_(77.63%)_Space_45.2_MB_(80.26%)

import java.util.PriorityQueue;

public class Solution {
    public int eatenApples(int[] apples, int[] days) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int eatenApples = 0;
        for (int i = 0; i < apples.length || !minHeap.isEmpty(); i++) {
            if (i < apples.length) {
                minHeap.offer(new int[] {i + days[i], apples[i]});
            }
            while (!minHeap.isEmpty() && (minHeap.peek()[0] <= i || minHeap.peek()[1] <= 0)) {
                minHeap.poll();
            }
            if (!minHeap.isEmpty()) {
                eatenApples++;
                minHeap.peek()[1]--;
            }
        }
        return eatenApples;
    }
}
