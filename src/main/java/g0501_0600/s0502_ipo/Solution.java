package g0501_0600.s0502_ipo;

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue

import java.util.PriorityQueue;

public class Solution {
    public int findMaximizedCapital(int k, int W, int[] profits, int[] capital) {
        PriorityQueue<int[]> minCapital =
                new PriorityQueue<>(
                        (int[] a, int[] b) -> {
                            return a[1] - b[1];
                        });
        PriorityQueue<int[]> maxProfit =
                new PriorityQueue<>(
                        (int[] a, int[] b) -> {
                            return b[0] - a[0];
                        });
        for (int i = 0; i < profits.length; i++) {
            if (W >= capital[i]) {
                maxProfit.offer(new int[] {profits[i], capital[i]});
            } else {
                minCapital.offer(new int[] {profits[i], capital[i]});
            }
        }
        int count = 0;
        while (count < k && !maxProfit.isEmpty()) {
            int[] temp = maxProfit.poll();
            W += temp[0];
            count += 1;
            while (!minCapital.isEmpty() && minCapital.peek()[1] <= W) {
                maxProfit.offer(minCapital.poll());
            }
        }
        return W;
    }
}
