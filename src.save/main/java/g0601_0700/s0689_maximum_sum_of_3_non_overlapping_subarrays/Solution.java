package g0601_0700.s0689_maximum_sum_of_3_non_overlapping_subarrays;

// #Hard #Array #Dynamic_Programming #2022_03_22_Time_5_ms_(64.24%)_Space_54.4_MB_(64.44%)

public class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int len = nums.length;
        if (len < 3 * k) {
            return new int[] {};
        }
        int[] res = new int[3];
        int[][] left = new int[2][len];
        int[][] right = new int[2][len];
        int s = 0;
        for (int i = 0; i < k; i++) {
            s += nums[i];
        }
        left[0][k - 1] = s;
        for (int i = k; i + 2 * k <= len; i++) {
            s = s + nums[i] - nums[i - k];
            if (s > left[0][i - 1]) {
                left[0][i] = s;
                left[1][i] = i - k + 1;
            } else {
                left[0][i] = left[0][i - 1];
                left[1][i] = left[1][i - 1];
            }
        }
        s = 0;
        for (int i = len - 1; i >= len - k; i--) {
            s += nums[i];
        }
        right[0][len - k] = s;
        right[1][len - k] = len - k;
        for (int i = len - k - 1; i >= 0; i--) {
            s = s + nums[i] - nums[i + k];
            if (s >= right[0][i + 1]) {
                right[0][i] = s;
                right[1][i] = i;
            } else {
                right[0][i] = right[0][i + 1];
                right[1][i] = right[1][i + 1];
            }
        }
        int mid = 0;
        for (int i = k; i < 2 * k; i++) {
            mid += nums[i];
        }
        int max = 0;
        for (int i = k; i + 2 * k <= len; i++) {
            int total = left[0][i - 1] + right[0][i + k] + mid;
            if (total > max) {
                res[0] = left[1][i - 1];
                res[1] = i;
                res[2] = right[1][i + k];
                max = total;
            }
            mid = mid + nums[i + k] - nums[i];
        }
        return res;
    }
}
