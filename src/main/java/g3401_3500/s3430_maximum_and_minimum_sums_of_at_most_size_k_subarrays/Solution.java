package g3401_3500.s3430_maximum_and_minimum_sums_of_at_most_size_k_subarrays;

// #Hard #Array #Math #Stack #Monotonic_Stack #2025_01_22_Time_27_(99.40%)_Space_56.05_(94.64%)

public class Solution {
    public long minMaxSubarraySum(int[] nums, int k) {
        long sum = solve(nums, k);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }
        return sum - solve(nums, k);
    }

    private long solve(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] st = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            while (top != -1 && num < nums[st[top]]) {
                right[st[top--]] = i;
            }
            left[i] = top == -1 ? -1 : st[top];
            st[++top] = i;
        }
        while (0 <= top) {
            right[st[top--]] = n;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int l = Math.min(i - left[i], k);
            int r = Math.min(right[i] - i, k);
            if (l + r - 1 <= k) {
                ans += (long) num * l * r;
            } else {
                long cnt = (long) (k - r + 1) * r + (long) (l + r - k - 1) * (r + k - l) / 2;
                ans += num * cnt;
            }
        }
        return ans;
    }
}
