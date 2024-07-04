package g3201_3300.s3202_find_the_maximum_length_of_valid_subsequence_ii;

// #Medium #Array #Dynamic_Programming #2024_07_04_Time_34_ms_(92.46%)_Space_51_MB_(45.95%)

public class Solution {
    public int maximumLength(int[] nums, int k) {
        // dp array to store the index against each possible modulo
        int[][] dp = new int[nums.length + 1][k + 1];
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                // Checking the modulo with each previous number
                int val = (nums[i] + nums[j]) % k;
                // storing the number of pairs that have the same modulo.
                // it would be one more than the number of pairs with the same modulo at the last
                // index
                dp[i][val] = dp[j][val] + 1;
                // Calculating the max seen till now
                longest = Math.max(longest, dp[i][val]);
            }
        }
        // total number of elements in the subsequence would be 1 more than the number of pairs
        return longest + 1;
    }
}
