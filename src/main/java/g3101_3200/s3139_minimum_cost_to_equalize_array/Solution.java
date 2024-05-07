package g3101_3200.s3139_minimum_cost_to_equalize_array;

// #Hard #Array #Greedy #Enumeration #2024_05_07_Time_1_ms_(100.00%)_Space_57.2_MB_(83.16%)

public class Solution {
    private static final int MOD = 1_000_000_007;
    private static final long LMOD = MOD;

    public int minCostToEqualizeArray(int[] nums, int cost1, int cost2) {
        long max = 0L;
        long min = Long.MAX_VALUE;
        long sum = 0L;
        for (long num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }
        final int n = nums.length;
        long total = (max * (long) n) - sum;
        // When operation one is always better:
        if ((cost1 << 1) <= cost2 || n <= 2) {
            return (int) ((total * (long) cost1) % LMOD);
        }
        // When operation two is moderately better:
        long op1 = Math.max(0L, ((max - min) << 1L) - total);
        long op2 = total - op1;
        long result = ((op1 + (op2 & 1L)) * (long) cost1) + ((op2 >> 1L) * (long) cost2);
        // When operation two is significantly better:
        total += op1 / ((long) n - 2L) * (long) n;
        op1 %= ((long) n - 2L);
        op2 = total - op1;
        result =
                Math.min(
                        result, ((op1 + (op2 & 1L)) * (long) cost1) + ((op2 >> 1L) * (long) cost2));
        // When operation two is always better:
        for (int i = 0; i < 2; ++i) {
            total += n;
            result =
                    Math.min(
                            result, ((total & 1L) * (long) cost1) + ((total >> 1L) * (long) cost2));
        }
        return (int) (result % LMOD);
    }
}
