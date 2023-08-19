package g2501_2600.s2555_maximize_win_from_two_segments;

// #Medium #Array #Binary_Search #Sliding_Window
// #2023_08_19_Time_5_ms_(90.10%)_Space_55.4_MB_(45.54%)

public class Solution {
    public int maximizeWin(int[] a, int k) {
        int j = 0;
        int i;
        int n = a.length;
        int[] dp = new int[n + 1];
        int ans = 0;
        for (i = 0; i < a.length; i++) {
            while (a[i] - a[j] > k) {
                j++;
            }
            dp[i + 1] = Math.max(dp[i], i - j + 1);
            ans = Math.max(ans, dp[j] + i - j + 1);
        }
        return ans;
    }
}
