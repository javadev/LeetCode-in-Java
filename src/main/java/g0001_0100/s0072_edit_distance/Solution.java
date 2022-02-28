package g0001_0100.s0072_edit_distance;

// #Hard #Top_100_Liked_Questions #String #Dynamic_Programming #Dynamic_Programming_I_Day_19
// #2022_02_19_Time_7_ms_(66.86%)_Space_43_MB_(33.29%)

@SuppressWarnings("java:S2234")
public class Solution {
    public int minDistance(String w1, String w2) {
        int n1 = w1.length();
        int n2 = w2.length();
        if (n2 > n1) {
            return minDistance(w2, w1);
        }
        int[] dp = new int[n2 + 1];
        for (int j = 0; j <= n2; j++) {
            dp[j] = j;
        }
        for (int i = 1; i <= n1; i++) {
            int pre = dp[0];
            dp[0] = i;
            for (int j = 1; j <= n2; j++) {
                int tmp = dp[j];
                dp[j] =
                        w1.charAt(i - 1) != w2.charAt(j - 1)
                                ? 1 + Math.min(pre, Math.min(dp[j], dp[j - 1]))
                                : pre;
                pre = tmp;
            }
        }
        return dp[n2];
    }
}
