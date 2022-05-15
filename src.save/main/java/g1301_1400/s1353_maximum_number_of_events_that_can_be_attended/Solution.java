package g1301_1400.s1353_maximum_number_of_events_that_can_be_attended;

// #Medium #Array #Greedy #Heap_Priority_Queue #Acceptance_33.4%
// #2022_03_21_Time_70_ms_(21.66%)_Space_99.6_MB_(39.91%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int maxEvents = 0;
        int i = 0;
        for (int day = 1; day <= 100000; day++) {
            while (i < events.length && events[i][0] == day) {
                heap.offer(events[i++][1]);
            }
            while (!heap.isEmpty() && heap.peek() < day) {
                heap.poll();
            }
            if (!heap.isEmpty()) {
                heap.poll();
                maxEvents++;
            }
        }
        return maxEvents;
    }
}
