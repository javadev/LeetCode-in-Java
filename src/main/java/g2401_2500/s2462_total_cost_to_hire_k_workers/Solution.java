package g2401_2500.s2462_total_cost_to_hire_k_workers;

// #Medium #Array #Two_Pointers #Heap_Priority_Queue #Simulation
// #2023_01_07_Time_57_ms_(96.24%)_Space_54_MB_(92.26%)

import java.util.PriorityQueue;

public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        // Hint: Maintain two minheaps, one for the left end and one for the right end
        // This problem is intentionally made complex but actually we don't have to record the
        // indices
        int n = costs.length;
        PriorityQueue<Integer> leftMinHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();
        long res = 0;
        if (2 * candidates >= n) {
            for (int i = 0; i <= n / 2; i++) {
                leftMinHeap.add(costs[i]);
            }
            for (int i = n / 2 + 1; i < n; i++) {
                rightMinHeap.add(costs[i]);
            }
            while (!leftMinHeap.isEmpty() && !rightMinHeap.isEmpty() && k > 0) {
                if (leftMinHeap.peek() <= rightMinHeap.peek()) {
                    res += leftMinHeap.poll();
                } else {
                    res += rightMinHeap.poll();
                }
                k -= 1;
            }
        } else {
            int left = candidates;
            int right = n - candidates - 1;
            for (int i = 0; i < candidates; i++) {
                leftMinHeap.add(costs[i]);
            }
            for (int i = n - candidates; i < n; i++) {
                rightMinHeap.add(costs[i]);
            }
            while (!leftMinHeap.isEmpty() && !rightMinHeap.isEmpty() && k > 0) {
                if (leftMinHeap.peek() <= rightMinHeap.peek()) {
                    res += leftMinHeap.poll();
                    if (left <= right) {
                        leftMinHeap.add(costs[left]);
                    }
                    left += 1;
                } else {
                    res += rightMinHeap.poll();
                    if (right >= left) {
                        rightMinHeap.add(costs[right]);
                    }
                    right -= 1;
                }
                k -= 1;
            }
        }
        if (k > 0 && leftMinHeap.isEmpty()) {
            while (k > 0) {
                res += rightMinHeap.poll();
                k -= 1;
            }
        }
        if (k > 0 && rightMinHeap.isEmpty()) {
            while (k > 0) {
                res += leftMinHeap.poll();
                k -= 1;
            }
        }
        return res;
    }
}
