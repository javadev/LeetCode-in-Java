package g2501_2600.s2558_take_gifts_from_the_richest_pile;

// #Easy #Array #Heap_Priority_Queue #Simulation
// #2023_08_19_Time_5_ms_(97.80%)_Space_41.8_MB_(25.67%)

import java.util.PriorityQueue;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        long res = 0;
        for (int gift : gifts) {
            pq.add(gift);
        }
        while (!pq.isEmpty() && k > 0) {
            long val = pq.poll();
            int newVal = (int) Math.sqrt(val);
            pq.add(newVal);
            k--;
        }
        while (!pq.isEmpty()) {
            res += pq.poll();
        }
        return res;
    }
}
