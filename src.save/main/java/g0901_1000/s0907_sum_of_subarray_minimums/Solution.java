package g0901_1000.s0907_sum_of_subarray_minimums;

// #Medium #Array #Dynamic_Programming #Stack #Monotonic_Stack
// #2022_03_28_Time_20_ms_(95.88%)_Space_64_MB_(76.91%)

public class Solution {
    private static final int MOD = 1_000_000_007;

    private int calculateRight(int i, int start, int[] right, int[] arr, int len) {
        if (start >= len) {
            return 0;
        }
        if (arr[start] < arr[i]) {
            return 0;
        }
        return (1 + right[start] + calculateRight(i, start + right[start] + 1, right, arr, len))
                % MOD;
    }

    private int calculateLeft(int i, int start, int[] left, int[] arr, int len) {
        if (start < 0) {
            return 0;
        }
        if (arr[start] <= arr[i]) {
            return 0;
        }
        return (1 + left[start] + calculateLeft(i, start - left[start] - 1, left, arr, len)) % MOD;
    }

    public int sumSubarrayMins(int[] arr) {
        int len = arr.length;
        int[] right = new int[len];
        int[] left = new int[len];

        right[len - 1] = 0;
        for (int i = len - 2; i >= 0; --i) {
            right[i] = calculateRight(i, i + 1, right, arr, len);
        }
        left[0] = 0;
        for (int i = 1; i < len; ++i) {
            left[i] = calculateLeft(i, i - 1, left, arr, len);
        }
        int answer = 0;
        for (int i = 0; i < len; ++i) {
            long modl = 1_000_000_007;
            answer += (int) (((((1 + left[i]) * (long) (1 + right[i])) % modl) * arr[i]) % modl);
            answer %= MOD;
        }
        return answer;
    }
}
