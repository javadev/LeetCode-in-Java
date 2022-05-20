package g1901_2000.s1962_remove_stones_to_minimize_the_total;

// #Medium #Array #Heap_Priority_Queue #2022_05_20_Time_761_ms_(48.67%)_Space_124.8_MB_(24.78%)

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> descendingQueue = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        int newValue;
        int currentValue;
        int half;
        for (int stones : piles) {
            sum += stones;
            descendingQueue.offer(stones);
        }
        while (k > 0) {
            currentValue = descendingQueue.poll();
            half = currentValue / 2;
            newValue = currentValue - half;
            descendingQueue.offer(newValue);
            sum -= half;
            k--;
        }
        return sum;
    }
}
