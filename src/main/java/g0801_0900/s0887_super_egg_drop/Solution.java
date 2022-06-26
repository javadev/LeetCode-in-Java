package g0801_0900.s0887_super_egg_drop;

// #Hard #Dynamic_Programming #Math #Binary_Search
// #2022_03_28_Time_0_ms_(100.00%)_Space_38.7_MB_(99.74%)

public class Solution {
    public int superEggDrop(int k, int n) {
        int e = k;
        int f = n;
        int[] dp = new int[e + 1];
        int counter = 1;
        while (true) {
            int temp = dp[0];
            for (int i = 1; i < dp.length; i++) {
                int val = dp[i] + temp + 1;
                temp = dp[i];
                dp[i] = val;
                if (val >= f) {
                    return counter;
                }
            }
            counter = counter + 1;
        }
    }
}
