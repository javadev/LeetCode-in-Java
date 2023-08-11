package g0501_0600.s0502_ipo;

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2022_07_24_Time_51_ms_(89.62%)_Space_101.7_MB_(47.03%)

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minCapital =
                new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[1]));
        PriorityQueue<int[]> maxProfit = new PriorityQueue<>((int[] a, int[] b) -> b[0] - a[0]);
        for (int i = 0; i < profits.length; i++) {
            if (w >= capital[i]) {
                maxProfit.offer(new int[] {profits[i], capital[i]});
            } else {
                minCapital.offer(new int[] {profits[i], capital[i]});
            }
        }
        int count = 0;
        while (count < k && !maxProfit.isEmpty()) {
            int[] temp = maxProfit.poll();
            w += temp[0];
            count += 1;
            while (!minCapital.isEmpty() && minCapital.peek()[1] <= w) {
                maxProfit.offer(minCapital.poll());
            }
        }
        return w;
    }
}
