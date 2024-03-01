package g1601_1700.s1642_furthest_building_you_can_reach;

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2022_04_21_Time_13_ms_(98.96%)_Space_58.5_MB_(75.89%)

import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i = 0;
        // we'll assume to use ladders for the first l jumps and adjust it afterwards
        for (; i < heights.length - 1 && minHeap.size() < ladders; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                minHeap.offer(diff);
            }
        }
        while (i < heights.length - 1) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                if (!minHeap.isEmpty() && minHeap.peek() < diff) {
                    bricks -= minHeap.poll();
                    minHeap.offer(diff);
                } else {
                    bricks -= diff;
                }
                if (bricks < 0) {
                    return i;
                }
            }
            i++;
        }
        return i;
    }
}
