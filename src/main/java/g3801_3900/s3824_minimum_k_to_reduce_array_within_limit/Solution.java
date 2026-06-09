package g3801_3900.s3824_minimum_k_to_reduce_array_within_limit;

// #Medium #Array #Binary_Search #Staff #Biweekly_Contest_175
// #2026_06_09_Time_16_ms_(100.00%)_Space_130.89_MB_(86.74%)

public class Solution {
    public int minimumK(int[] nums) {
        int n = nums.length;
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        long total = 0;
        for (int x : nums) {
            total += x;
        }
        int left = Math.max((int) Math.ceil(Math.sqrt(n)), (int) Math.ceil(Math.cbrt(total))) - 1;
        int right = (int) Math.ceil(Math.sqrt(nonPositive(nums, left + 1)));
        while (left + 1 < right) {
            int k = (left + right) / 2;
            if (nonPositive(nums, k) <= (long) k * k) {
                right = k;
            } else {
                left = k;
            }
        }
        return left + 1;
    }

    private long nonPositive(int[] nums, int k) {
        long sum = nums.length;
        for (int x : nums) {
            sum += (x - 1) / k;
        }
        return sum;
    }
}
