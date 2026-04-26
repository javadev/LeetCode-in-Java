package g3701_3800.s3743_maximize_cyclic_partition_score;

// #Hard #Array #Dynamic_Programming #Weekly_Contest_475 #Principal
// #2026_04_26_Time_40_ms_(96.15%)_Space_120.45_MB_(7.69%)

public class Solution {
    public long maximumScore(int[] nums, int k) {
        // Find index of minimum element
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[j]) {
                j = i;
            }
        }
        // Build array 'a'
        int n = nums.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nums[(j + i) % n];
        }
        // Build array 'b' (rotated and reversed)
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = nums[(j + 1 + i) % n];
        }
        reverse(b);
        // Compute and return max of f(a, k) and f(b, k)
        return Math.max(f(a, k), f(b, k));
    }

    private long f(int[] a, int k) {
        int n = a.length;
        long[][] dp = new long[k + 1][n + 1];
        long mn = Long.MAX_VALUE;
        long mx = Long.MIN_VALUE;
        // Initialize dp[1][j+1]
        for (int j = 0; j < n; j++) {
            mn = Math.min(mn, a[j]);
            mx = Math.max(mx, a[j]);
            dp[1][j + 1] = mx - mn;
        }
        long res = dp[1][n];
        for (int i = 2; i <= k; i++) {
            long x = Long.MIN_VALUE;
            long y = Long.MIN_VALUE;
            for (int j = i - 1; j < n; j++) {
                x = Math.max(x, dp[i - 1][j] - a[j]);
                y = Math.max(y, dp[i - 1][j] + a[j]);
                dp[i][j + 1] = Math.max(dp[i][j], Math.max(x + a[j], y - a[j]));
            }
            res = Math.max(res, dp[i][n]);
        }
        return res;
    }

    private void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
