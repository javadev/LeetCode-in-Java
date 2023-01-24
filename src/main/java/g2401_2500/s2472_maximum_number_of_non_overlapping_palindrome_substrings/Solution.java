package g2401_2500.s2472_maximum_number_of_non_overlapping_palindrome_substrings;

// #Hard #String #Dynamic_Programming #2023_01_24_Time_2_ms_(91.04%)_Space_42.2_MB_(64.93%)

import java.util.Arrays;

public class Solution {
    public int maxPalindromes(String s, int k) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return dfs(s, dp, k, 0);
    }

    private int dfs(String s, int[] dp, int k, int start) {
        if (start >= s.length()) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        int ans = 0;
        for (int n = 0; n <= 1; n++) {
            for (int i = start; i <= s.length() - k - n; i++) {
                int left = i;
                int right = i + k + n - 1;
                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        break;
                    }
                    left++;
                    right--;
                }
                if (left >= right) {
                    ans = Math.max(ans, 1 + dfs(s, dp, k, i + k + n));
                    break;
                }
            }
        }
        dp[start] = ans;
        return ans;
    }
}
