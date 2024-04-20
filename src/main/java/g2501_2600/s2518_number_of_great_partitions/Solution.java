package g2501_2600.s2518_number_of_great_partitions;

// #Hard #Array #Dynamic_Programming #2023_04_18_Time_4_ms_(100.00%)_Space_41.4_MB_(98.28%)

public class Solution {
    private static final int MOD = 1000000007;

    public int countPartitions(int[] nums, int k) {
        // edge cases
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < 2L * k) {
            return 0;
        }
        // normal cases
        int[] dp = new int[k];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = k - 1; i >= num; i--) {
                dp[i] = (dp[i] + dp[i - num]) % MOD;
            }
        }
        int smaller = 0;
        for (int i = 0; i < k; i++) {
            smaller = (smaller + dp[i]) % MOD;
        }
        return (pow(2, n) - (smaller * 2) % MOD + MOD) % MOD;
    }

    private int pow(long num, int pow) {
        long result = 1;
        while (pow != 0) {
            if (pow % 2 == 1) {
                result = (result * num) % MOD;
            }
            pow /= 2;
            num = (num * num) % MOD;
        }
        return (int) result;
    }
}
