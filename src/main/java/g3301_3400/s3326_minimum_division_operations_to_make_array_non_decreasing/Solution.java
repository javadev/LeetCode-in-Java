package g3301_3400.s3326_minimum_division_operations_to_make_array_non_decreasing;

// #Medium #Array #Math #Greedy #Number_Theory #2024_10_22_Time_20_ms_(97.34%)_Space_73.1_MB_(5.03%)

public class Solution {
    private static final int MAXI = 1000001;
    private static final int[] SIEVE = new int[MAXI];
    private static boolean precompute = false;

    private static void compute() {
        if (precompute) {
            return;
        }
        for (int i = 2; i < MAXI; i++) {
            if (i * i > MAXI) {
                break;
            }
            for (int j = i * i; j < MAXI; j += i) {
                SIEVE[j] = Math.max(SIEVE[j], Math.max(i, j / i));
            }
        }
        precompute = true;
    }

    public int minOperations(int[] nums) {
        compute();
        int op = 0;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            while (nums[i] > nums[i + 1]) {
                if (SIEVE[nums[i]] == 0) {
                    return -1;
                }
                nums[i] /= SIEVE[nums[i]];
                op++;
            }
            if (nums[i] > nums[i + 1]) {
                return -1;
            }
        }
        return op;
    }
}
