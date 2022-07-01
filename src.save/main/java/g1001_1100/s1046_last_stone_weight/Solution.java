package g1001_1100.s1046_last_stone_weight;

// #Easy #Array #Heap_Priority_Queue #Level_1_Day_15_Heap
// #2022_02_27_Time_2_ms_(73.81%)_Space_42.3_MB_(5.13%)

import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            heap.offer(stone);
        }
        while (!heap.isEmpty()) {
            if (heap.size() >= 2) {
                int one = heap.poll();
                int two = heap.poll();
                int diff = one - two;
                heap.offer(diff);
            } else {
                return heap.poll();
            }
        }
        return -1;
    }
}
