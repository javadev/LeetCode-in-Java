package g2201_2300.s2208_minimum_operations_to_halve_array_sum;

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2022_06_12_Time_237_ms_(89.24%)_Space_57.9_MB_(95.06%)

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> queue = new PriorityQueue<>(nums.length, Collections.reverseOrder());
        double sum = 0.0;
        int count = 0;
        for (double num : nums) {
            queue.add(num);
            sum += num;
        }
        double hsum = sum;
        while (hsum > sum / 2) {
            double maxElement = queue.poll();
            maxElement = maxElement / 2;
            count++;
            hsum -= maxElement;
            queue.add(maxElement);
        }
        return count;
    }
}
