package g0801_0900.s0801_minimum_swaps_to_make_sequences_increasing;

// #Hard #Array #Dynamic_Programming #2022_03_23_Time_6_ms_(71.94%)_Space_87.4_MB_(76.67%)

public class Solution {
    public int minSwap(int[] listA, int[] listB) {
        int[] dp = new int[2];
        dp[1] = 1;
        for (int i = 1; i < listA.length; i++) {
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            if (listA[i] > listA[i - 1] && listB[i] > listB[i - 1]) {
                a = dp[0];
                b = dp[1];
            }
            if (listA[i] > listB[i - 1] && listB[i] > listA[i - 1]) {
                a = Math.min(a, dp[1]);
                b = Math.min(b, dp[0]);
            }
            dp[0] = a;
            dp[1] = b + 1;
        }
        return Math.min(dp[0], dp[1]);
    }
}
