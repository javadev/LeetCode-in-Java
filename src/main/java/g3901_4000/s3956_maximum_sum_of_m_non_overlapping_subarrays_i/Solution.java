package g3901_4000.s3956_maximum_sum_of_m_non_overlapping_subarrays_i;

// #Hard #Array #Dynamic_Programming #Binary_Search #Prefix_Sum #Sliding_Window #Queue
// #Monotonic_Queue #Senior_Staff #Weekly_Contest_505
// #2026_10_20_Time_61_ms_(91.07%)_Space_46.56_MB_(83.93%)

public class Solution {
    public long maximumSum(int[] nums, int m, int l, int r) {
        int n = nums.length;
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        long neg = -(long) 4e18;
        long[] prev = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            prev[i] = 0;
        }
        long res = neg;
        for (int t = 1; t <= m; t++) {
            long[] curr = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                curr[i] = neg;
            }
            int[] dq = new int[n + 1];
            int head = 0;
            int tail = 0;
            for (int i = 1; i <= n; i++) {
                curr[i] = curr[i - 1];
                int add = i - l;
                if (add >= 0 && prev[add] != neg) {
                    long val = prev[add] - pre[add];
                    while (head < tail) {
                        int idx = dq[tail - 1];
                        long last = prev[idx] - pre[idx];
                        if (last <= val) {
                            tail--;
                        } else {
                            break;
                        }
                    }
                    dq[tail++] = add;
                }
                int left = i - r;
                while (head < tail && dq[head] < left) {
                    head++;
                }
                if (head < tail) {
                    int s = dq[head];
                    curr[i] = Math.max(curr[i], pre[i] + prev[s] - pre[s]);
                }
            }
            res = Math.max(res, curr[n]);
            prev = curr;
        }
        return res;
    }
}
