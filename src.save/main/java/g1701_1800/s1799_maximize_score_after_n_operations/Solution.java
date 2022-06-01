package g1701_1800.s1799_maximize_score_after_n_operations;

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Backtracking #Bitmask #Number_Theory
// #2022_04_25_Time_164_ms_(78.22%)_Space_41.5_MB_(98.02%)

public class Solution {
    public int maxScore(int[] nums) {
        int n = nums.length;
        Integer[] memo = new Integer[1 << n];
        return helper(1, 0, nums, memo);
    }

    private int helper(int operationNumber, int mask, int[] nums, Integer[] memo) {
        int n = nums.length;
        if (memo[mask] != null) {
            return memo[mask];
        }
        if (operationNumber > n / 2) {
            return 0;
        }
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) == 0) {
                for (int j = i + 1; j < n; j++) {
                    if ((mask & (1 << j)) == 0) {
                        int score = operationNumber * gcd(nums[i], nums[j]);
                        int score2 =
                                helper(operationNumber + 1, mask | (1 << i) | (1 << j), nums, memo);
                        maxScore = Math.max(maxScore, score + score2);
                    }
                }
            }
        }
        memo[mask] = maxScore;
        return maxScore;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
