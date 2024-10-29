package g3301_3400.s3336_find_the_number_of_subsequences_with_equal_gcd;

// #Hard #Array #Dynamic_Programming #Math #Number_Theory
// #2024_10_29_Time_408_ms_(50.28%)_Space_114.9_MB_(56.91%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1_000_000_007;

    private int[][][] dp;

    public int subsequencePairCount(int[] nums) {
        dp = new int[nums.length][201][201];
        for (int[][] each : dp) {
            for (int[] each1 : each) {
                Arrays.fill(each1, -1);
            }
        }
        return findPairs(nums, 0, 0, 0);
    }

    private int findPairs(int[] nums, int index, int gcd1, int gcd2) {
        if (index == nums.length) {
            if (gcd1 > 0 && gcd2 > 0 && gcd1 == gcd2) {
                return 1;
            }
            return 0;
        }
        if (dp[index][gcd1][gcd2] != -1) {
            return dp[index][gcd1][gcd2];
        }
        int currentNum = nums[index];
        long count = 0;
        count += findPairs(nums, index + 1, gcd(gcd1, currentNum), gcd2);
        count += findPairs(nums, index + 1, gcd1, gcd(gcd2, currentNum));
        count += findPairs(nums, index + 1, gcd1, gcd2);
        dp[index][gcd1][gcd2] = (int) ((count % MOD) % MOD);
        return dp[index][gcd1][gcd2];
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
