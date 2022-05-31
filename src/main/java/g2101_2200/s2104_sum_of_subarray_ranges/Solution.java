package g2101_2200.s2104_sum_of_subarray_ranges;

// #Medium #Array #Stack #Monotonic_Stack #2022_05_31_Time_21_ms_(77.85%)_Space_46.4_MB_(23.68%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Deque<Integer> q = new ArrayDeque<>();

        q.add(-1);
        for (int i = 0; i <= n; i++) {
            while (q.peekLast() != -1 && (i == n || nums[q.peekLast()] <= nums[i])) {
                int cur = q.removeLast();
                int left = q.peekLast();
                int right = i;
                sum += 1L * (cur - left) * (right - cur) * nums[cur];
            }
            q.add(i);
        }

        q.clear();
        q.add(-1);
        for (int i = 0; i <= n; i++) {
            while (q.peekLast() != -1 && (i == n || nums[q.peekLast()] >= nums[i])) {
                int cur = q.removeLast();
                int left = q.peekLast();
                int right = i;
                sum -= 1L * (cur - left) * (right - cur) * nums[cur];
            }
            q.add(i);
        }
        return sum;
    }
}
