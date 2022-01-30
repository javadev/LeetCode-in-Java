package g0801_0900.s0801_minimum_swaps_to_make_sequences_increasing;

// #Hard #Array #Dynamic_Programming

public class Solution {
    public int minSwap(int[] A, int[] B) {
        int[] dp = new int[2];
        dp[1] = 1;
        for (int i = 1; i < A.length; i++) {
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
                a = dp[0];
                b = dp[1];
            }
            if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
                a = Math.min(a, dp[1]);
                b = Math.min(b, dp[0]);
            }
            dp[0] = a;
            dp[1] = b + 1;
        }
        return Math.min(dp[0], dp[1]);
    }
}
