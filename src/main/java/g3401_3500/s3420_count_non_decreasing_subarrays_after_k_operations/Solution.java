package g3401_3500.s3420_count_non_decreasing_subarrays_after_k_operations;

// #Hard #2025_01_14_Time_29_(92.59%)_Space_62.14_(57.41%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public long countNonDecreasingSubarrays(int[] nums, long k) {
        int n = nums.length;
        for (int i = 0; i < n / 2; ++i) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
        long res = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int j = 0, i = 0; j < nums.length; ++j) {
            while (!q.isEmpty() && nums[q.peekLast()] < nums[j]) {
                int r = q.pollLast();
                int l = q.isEmpty() ? i - 1 : q.peekLast();
                k -= (long) (r - l) * (nums[j] - nums[r]);
            }
            q.addLast(j);
            while (k < 0) {
                k += nums[q.peekFirst()] - nums[i];
                if (q.peekFirst() == i) {
                    q.pollFirst();
                }
                ++i;
            }
            res += j - i + 1;
        }
        return res;
    }
}
