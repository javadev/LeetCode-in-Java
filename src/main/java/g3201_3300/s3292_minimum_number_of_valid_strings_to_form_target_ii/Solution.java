package g3201_3300.s3292_minimum_number_of_valid_strings_to_form_target_ii;

// #Hard #2024_09_16_Time_103_ms_(100.00%)_Space_94.7_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minValidStrings(String[] words, String target) {
        int n = target.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        List<List<Integer>> matches = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            matches.add(new ArrayList<>());
        }
        char[] targetChars = target.toCharArray();
        for (String word : words) {
            char[] wordChars = word.toCharArray();
            int m = wordChars.length;
            int[] pi = new int[m];
            int i1 = 1;
            int j1 = 0;
            while (i1 < m) {
                while (j1 > 0 && wordChars[i1] != wordChars[j1]) {
                    j1 = pi[j1 - 1];
                }
                if (wordChars[i1] == wordChars[j1]) {
                    j1++;
                }
                pi[i1] = j1;
                i1++;
            }
            int i = 0;
            int j = 0;
            while (i < n) {
                while (j > 0 && targetChars[i] != wordChars[j]) {
                    j = pi[j - 1];
                }
                if (targetChars[i] == wordChars[j]) {
                    j++;
                }
                if (j > 0) {
                    matches.get(i - j + 1).add(j);
                    if (j == m) {
                        j = pi[j - 1];
                    }
                }
                i++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }
            for (int len : matches.get(i)) {
                if (i + len <= n) {
                    dp[i + len] = Math.min(dp[i + len], dp[i] + 1);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
}
