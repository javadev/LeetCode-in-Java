package g3501_3600.s3572_maximize_ysum_by_picking_a_triplet_of_distinct_xvalues;

// #Medium #2025_06_08_Time_51_ms_(100.00%)_Space_57.50_MB_(100.00%)

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i], 0), y[i]));
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : map.values()) {
            maxHeap.add(val);
        }
        if (maxHeap.size() < 3) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += maxHeap.poll();
        }
        return sum;
    }
}
