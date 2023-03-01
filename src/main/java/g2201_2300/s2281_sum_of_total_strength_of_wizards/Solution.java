package g2201_2300.s2281_sum_of_total_strength_of_wizards;

// #Hard #Array #Stack #Prefix_Sum #Monotonic_Stack
// #2022_06_18_Time_142_ms_(68.92%)_Space_141.5_MB_(13.66%)

import java.util.Deque;
import java.util.LinkedList;

@SuppressWarnings("java:S107")
public class Solution {
    private static int mod = (int) 1e9 + 7;

    public int totalStrength(int[] nums) {
        int n = nums.length;
        long[] forward = new long[n];
        long[] backward = new long[n];
        long[] prefix = new long[n + 1];
        long[] suffix = new long[n + 1];
        forward[0] = prefix[1] = nums[0];
        backward[n - 1] = suffix[n - 1] = nums[n - 1];
        for (int i = 1; i < n; ++i) {
            forward[i] = nums[i] + forward[i - 1];
            prefix[i + 1] = prefix[i] + forward[i];
        }
        for (int i = n - 2; 0 <= i; --i) {
            backward[i] = nums[i] + backward[i + 1];
            suffix[i] = suffix[i + 1] + backward[i];
        }
        long res = 0;
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            while (!dq.isEmpty() && nums[dq.peekLast()] >= nums[i]) {
                int cur = dq.pollLast();
                int prev = dq.isEmpty() ? -1 : dq.peekLast();
                res =
                        (res
                                        + getSum(
                                                        nums, forward, prefix, backward, suffix,
                                                        prev, cur, i)
                                                * nums[cur])
                                % mod;
            }
            dq.add(i);
        }
        while (!dq.isEmpty()) {
            int cur = dq.pollLast();
            int prev = dq.isEmpty() ? -1 : dq.peekLast();
            res =
                    (res
                                    + getSum(nums, forward, prefix, backward, suffix, prev, cur, n)
                                            * nums[cur])
                            % mod;
        }
        return (int) res;
    }

    private long getSum(
            int[] nums,
            long[] forward,
            long[] prefix,
            long[] backward,
            long[] suffix,
            int prev,
            int cur,
            int next) {
        long sum = ((cur - prev) * (long) nums[cur] % mod) * (next - cur) % mod;
        long preSum = getPresum(backward, suffix, prev + 1, cur - 1, next - cur);
        long postSum = getPostsum(forward, prefix, cur + 1, next - 1, cur - prev);
        return (sum + preSum + postSum) % mod;
    }

    private long getPresum(long[] backward, long[] suffix, int from, int to, int m) {
        int n = backward.length;
        long cnt = to - from + 1L;
        return (suffix[from] - suffix[to + 1] - cnt * (to + 1 == n ? 0 : backward[to + 1]) % mod)
                % mod
                * m
                % mod;
    }

    private long getPostsum(long[] forward, long[] prefix, int from, int to, int m) {
        long cnt = to - from + 1L;
        return (prefix[to + 1] - prefix[from] - cnt * (0 == from ? 0 : forward[from - 1]) % mod)
                % mod
                * m
                % mod;
    }
}
