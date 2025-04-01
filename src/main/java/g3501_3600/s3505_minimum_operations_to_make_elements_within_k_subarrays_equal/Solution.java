package g3501_3600.s3505_minimum_operations_to_make_elements_within_k_subarrays_equal;

// #Hard #Array #Hash_Table #Dynamic_Programming #Math #Heap_Priority_Queue #Sliding_Window
// #2025_04_01_Time_547_ms_(77.95%)_Space_82.16_MB_(16.92%)

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    private static class SlidingMedian {
        // max-heap for smaller half
        PriorityQueue<Integer> leftHeap;
        // min-heap for larger half
        PriorityQueue<Integer> rightHeap;
        Map<Integer, Integer> delayedRemovals;
        long sumLeft;
        long sumRight;
        int sizeLeft;
        int sizeRight;

        public SlidingMedian() {
            leftHeap = new PriorityQueue<>(Collections.reverseOrder());
            rightHeap = new PriorityQueue<>();
            delayedRemovals = new HashMap<>();
            sumLeft = sumRight = 0;
            sizeLeft = sizeRight = 0;
        }

        public void add(int num) {
            if (leftHeap.isEmpty() || num <= leftHeap.peek()) {
                leftHeap.offer(num);
                sumLeft += num;
                sizeLeft++;
            } else {
                rightHeap.offer(num);
                sumRight += num;
                sizeRight++;
            }
            balanceHeaps();
        }

        public void remove(int num) {
            delayedRemovals.put(num, delayedRemovals.getOrDefault(num, 0) + 1);
            if (!leftHeap.isEmpty() && num <= leftHeap.peek()) {
                sumLeft -= num;
                sizeLeft--;
            } else {
                sumRight -= num;
                sizeRight--;
            }
            balanceHeaps();
            pruneHeap(leftHeap);
            pruneHeap(rightHeap);
        }

        private void balanceHeaps() {
            if (sizeLeft > sizeRight + 1) {
                int num = leftHeap.poll();
                sumLeft -= num;
                sizeLeft--;
                rightHeap.offer(num);
                sumRight += num;
                sizeRight++;
            } else if (sizeRight > sizeLeft) {
                int num = rightHeap.poll();
                sumRight -= num;
                sizeRight--;
                leftHeap.offer(num);
                sumLeft += num;
                sizeLeft++;
            }
        }

        private void pruneHeap(PriorityQueue<Integer> heap) {
            while (!heap.isEmpty() && delayedRemovals.containsKey(heap.peek())) {
                int num = heap.peek();
                if (delayedRemovals.get(num) > 0) {
                    heap.poll();
                    delayedRemovals.put(num, delayedRemovals.get(num) - 1);
                    if (delayedRemovals.get(num) == 0) {
                        delayedRemovals.remove(num);
                    }
                } else {
                    break;
                }
            }
        }

        public int getMedian() {
            return leftHeap.peek();
        }

        public long getCost() {
            int median = getMedian();
            return (long) median * sizeLeft - sumLeft + sumRight - (long) median * sizeRight;
        }
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        int windowCount = n - x + 1;
        long[] costs = new long[windowCount];
        SlidingMedian sm = new SlidingMedian();
        // Compute costs for all windows
        for (int i = 0; i < x; i++) {
            sm.add(nums[i]);
        }
        costs[0] = sm.getCost();
        for (int i = 1; i < windowCount; i++) {
            sm.remove(nums[i - 1]);
            sm.add(nums[i + x - 1]);
            costs[i] = sm.getCost();
        }
        // Dynamic programming table
        long[][] dp = new long[windowCount][k + 1];
        for (long[] row : dp) {
            Arrays.fill(row, Long.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        for (int i = 0; i < windowCount; i++) {
            for (int j = 0; j <= k; j++) {
                if (i > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                }
                if (j > 0 && i >= x) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - x][j - 1] + costs[i]);
                } else if (j == 1) {
                    dp[i][j] = Math.min(dp[i][j], costs[i]);
                }
            }
        }
        return dp[windowCount - 1][k];
    }
}
