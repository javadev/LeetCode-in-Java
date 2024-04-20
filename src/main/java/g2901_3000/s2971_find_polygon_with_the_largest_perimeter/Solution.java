package g2901_3000.s2971_find_polygon_with_the_largest_perimeter;

// #Medium #Array #Sorting #Greedy #Prefix_Sum
// #2024_01_16_Time_21_ms_(98.77%)_Space_60.9_MB_(34.24%)

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public long largestPerimeter(int[] nums) {
        long sum = 0L;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            pq.add((long) i);
            sum = (sum + i);
        }
        while (pq.size() >= 3) {
            long curr = pq.poll();
            if (sum - curr > curr) {
                return sum;
            } else {
                sum = sum - curr;
            }
        }
        return -1;
    }
}
