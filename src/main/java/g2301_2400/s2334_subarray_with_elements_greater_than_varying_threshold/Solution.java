package g2301_2400.s2334_subarray_with_elements_greater_than_varying_threshold;

// #Hard #Array #Stack #Union_Find #Monotonic_Stack
// #2022_07_12_Time_385_ms_(31.56%)_Space_135.2_MB_(5.78%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Solution {
    public int validSubarraySize(int[] nums, int threshold) {
        int n = nums.length;
        int[] min = new int[n];
        // base case
        TreeSet<Integer> dead = new TreeSet<>(Arrays.asList(n, -1));
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.comparingInt(o -> -min[o]));
        for (int i = 0; i < n; i++) {
            min[i] = threshold / nums[i] + 1;
            if (min[i] > nums.length) {
                // dead, this element should never appear in the answer
                dead.add(i);
            } else {
                maxheap.offer(i);
            }
        }
        while (!maxheap.isEmpty()) {
            int cur = maxheap.poll();
            if (dead.higher(cur) - dead.lower(cur) - 1 < min[cur]) {
                // widest open range < minimum required length, this index is also bad.
                dead.add(cur);
            } else {
                // otherwise we've found it!
                return min[cur];
            }
        }
        return -1;
    }
}
