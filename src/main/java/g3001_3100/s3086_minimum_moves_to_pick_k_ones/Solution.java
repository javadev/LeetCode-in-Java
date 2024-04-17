package g3001_3100.s3086_minimum_moves_to_pick_k_ones;

// #Hard #Array #Greedy #Prefix_Sum #Sliding_Window
// #2024_04_17_Time_4_ms_(97.63%)_Space_61_MB_(7.12%)

public class Solution {
    public long minimumMoves(int[] nums, int k, int maxChanges) {
        int maxAdjLen = 0;
        int n = nums.length;
        int numOne = 0;
        int l = 0;
        int r = 0;
        for (; r < n; r++) {
            if (nums[r] != 1) {
                maxAdjLen = Math.max(maxAdjLen, r - l);
                l = r + 1;
            } else {
                numOne++;
            }
        }
        maxAdjLen = Math.min(3, Math.max(maxAdjLen, r - l));
        if (maxAdjLen + maxChanges >= k) {
            if (maxAdjLen >= k) {
                return k - 1L;
            } else {
                return Math.max(0, maxAdjLen - 1) + (k - maxAdjLen) * 2L;
            }
        }
        int[] ones = new int[numOne];
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                ones[ind++] = i;
            }
        }
        long[] preSum = new long[ones.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + ones[i - 1];
        }
        int target = k - maxChanges;
        l = 0;
        long res = Long.MAX_VALUE;
        for (; l <= ones.length - target; l++) {
            r = l + target - 1;
            int mid = (l + r) / 2;
            int median = ones[mid];
            long sum1 = preSum[mid + 1] - preSum[l];
            long sum2 = preSum[r + 1] - preSum[mid + 1];
            long area1 = (long) (mid - l + 1) * median;
            long area2 = (long) (r - mid) * median;
            long curRes = area1 - sum1 + sum2 - area2;
            res = Math.min(res, curRes);
        }
        res += 2L * maxChanges;
        return res;
    }
}
