package g3301_3400.s3367_maximize_sum_of_weights_after_edge_removals;

// #Hard #2024_11_24_Time_147_ms_(100.00%)_Space_142.2_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public long maximizeSumOfWeights(int[][] edges, int k) {
        HashMap<Integer, ArrayList<int[]>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], t -> new ArrayList<>()).add(new int[] {edge[1], edge[2]});
            map.computeIfAbsent(edge[1], t -> new ArrayList<>()).add(new int[] {edge[0], edge[2]});
        }
        return maximizeSumOfWeights(0, -1, k, map)[0];
    }

    private long[] maximizeSumOfWeights(
            int v, int from, int k, HashMap<Integer, ArrayList<int[]>> map) {
        long sum = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int[] i : map.get(v)) {
            if (i[0] != from) {
                long[] next = maximizeSumOfWeights(i[0], v, k, map);
                next[1] += i[1];
                sum += Math.max(next[0], next[1]);
                if (next[0] < next[1]) {
                    queue.offer(next[1] - next[0]);
                    sum -= queue.size() > k ? queue.poll() : 0;
                }
            }
        }
        return new long[] {sum, sum - (queue.size() < k ? 0 : queue.peek())};
    }
}
