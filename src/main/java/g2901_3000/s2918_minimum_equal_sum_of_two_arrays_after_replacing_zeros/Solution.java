package g2901_3000.s2918_minimum_equal_sum_of_two_arrays_after_replacing_zeros;

// #Medium #Array #Greedy #2024_01_19_Time_1_ms_(100.00%)_Space_60.8_MB_(12.50%)

public class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long zero1Count = 0;
        long sum1 = 0;
        long zero2Count = 0;
        long sum2 = 0;
        for (int num : nums1) {
            zero1Count += num == 0 ? 1 : 0;
            sum1 += num;
        }
        for (int num : nums2) {
            zero2Count += num == 0 ? 1 : 0;
            sum2 += num;
        }
        if (zero1Count == 0 && zero2Count == 0) {
            return sum1 == sum2 ? sum1 : -1;
        }
        if (zero1Count == 0) {
            return (sum1 - sum2 >= zero2Count) ? sum1 : -1;
        }
        if (zero2Count == 0) {
            return (sum2 - sum1 >= zero1Count) ? sum2 : -1;
        }
        long ans = Long.MAX_VALUE;
        long p1 = zero1Count;
        long p2 = zero1Count - (sum2 - sum1);
        if (p2 >= zero2Count) {
            ans = Math.min(ans, sum1 + p1);
        }
        p1 = (sum2 - sum1) + zero2Count;
        if (p1 >= zero1Count) {
            ans = Math.min(ans, sum1 + p1);
        }
        return ans != Long.MAX_VALUE ? ans : -1;
    }
}
