package g2401_2500.s2462_total_cost_to_hire_k_workers;

// #Medium #Array #Two_Pointers #Heap_Priority_Queue #Simulation #LeetCode_75_Heap/Priority_Queue
// #2026_10_22_Time_26_ms_(99.83%)_Space_78.37_MB_(36.12%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        long res = 0;
        if (candidates * 2 + k > n) {
            Arrays.sort(costs);
            for (int i = 0; i < k; i++) {
                res += costs[i];
            }
            return res;
        }
        PriorityQueue<Integer> pre = new PriorityQueue<>();
        PriorityQueue<Integer> suf = new PriorityQueue<>();
        for (int i = 0; i < candidates; i++) {
            pre.offer(costs[i]);
            suf.offer(costs[n - 1 - i]);
        }
        int i = candidates;
        int j = n - 1 - candidates;
        while (k-- > 0) {
            if (pre.peek() <= suf.peek()) {
                res += pre.poll();
                pre.offer(costs[i++]);
            } else {
                res += suf.poll();
                suf.offer(costs[j--]);
            }
        }
        return res;
    }
}
