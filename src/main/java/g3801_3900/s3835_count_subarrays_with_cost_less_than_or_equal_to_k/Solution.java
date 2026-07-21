package g3801_3900.s3835_count_subarrays_with_cost_less_than_or_equal_to_k;

// #Medium #Array #Queue #Monotonic_Queue #Staff #Weekly_Contest_488
// #2026_07_21_Time_53_ms_(79.87%)_Space_134.00_MB_(91.28%)

import java.util.ArrayDeque;

public class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        ArrayDeque<Integer> maxq = new ArrayDeque<>();
        ArrayDeque<Integer> minq = new ArrayDeque<>();
        long res = 0;
        int l = 0;
        for (int r = 0; r < n; r++) {
            pushMax(maxq, nums, r);
            pushMin(minq, nums, r);
            while (l <= r && rangeTooLarge(nums, maxq, minq, l, r, k)) {
                l = shrinkWindow(maxq, minq, l);
            }
            res += (r - l + 1);
        }
        return res;
    }

    private void pushMax(ArrayDeque<Integer> maxq, int[] nums, int r) {
        while (!maxq.isEmpty() && nums[maxq.peekLast()] <= nums[r]) {
            maxq.pollLast();
        }
        maxq.addLast(r);
    }

    private void pushMin(ArrayDeque<Integer> minq, int[] nums, int r) {
        while (!minq.isEmpty() && nums[minq.peekLast()] >= nums[r]) {
            minq.pollLast();
        }
        minq.addLast(r);
    }

    private boolean rangeTooLarge(
            int[] nums, ArrayDeque<Integer> maxq, ArrayDeque<Integer> minq, int l, int r, long k) {
        long range = (long) nums[maxq.peekFirst()] - (long) nums[minq.peekFirst()];
        return (r - l + 1) * range > k;
    }

    private int shrinkWindow(ArrayDeque<Integer> maxq, ArrayDeque<Integer> minq, int l) {
        if (!maxq.isEmpty() && maxq.peekFirst() == l) {
            maxq.pollFirst();
        }
        if (!minq.isEmpty() && minq.peekFirst() == l) {
            minq.pollFirst();
        }
        return l + 1;
    }
}
