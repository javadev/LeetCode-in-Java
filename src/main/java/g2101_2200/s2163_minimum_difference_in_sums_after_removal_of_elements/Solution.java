package g2101_2200.s2163_minimum_difference_in_sums_after_removal_of_elements;

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue
// #2022_06_08_Time_298_ms_(57.14%)_Space_199.6_MB_(50.65%)

import java.util.PriorityQueue;

public class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        long[] leftMemo = new long[nums.length];
        long[] rightMemo = new long[nums.length];
        long current = 0L;
        for (int i = 0; i <= 2 * n - 1; i++) {
            current += nums[i];
            maxHeap.add(nums[i]);
            if (maxHeap.size() > n) {
                int removed = maxHeap.poll();
                current -= removed;
                leftMemo[i] = current;
            }
            if (maxHeap.size() == n) {
                leftMemo[i] = current;
            }
        }
        current = 0;
        for (int i = nums.length - 1; i >= n; i--) {
            current += nums[i];
            minHeap.add(nums[i]);
            if (minHeap.size() > n) {
                int removed = minHeap.poll();
                current -= removed;
            }
            if (minHeap.size() == n) {
                rightMemo[i] = current;
            }
        }
        long min = Long.MAX_VALUE;
        for (int i = n - 1; i <= 2 * n - 1; i++) {
            min = Math.min(min, leftMemo[i] - rightMemo[i + 1]);
        }
        return min;
    }
}
