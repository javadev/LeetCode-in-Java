package g3501_3600.s3579_minimum_steps_to_convert_string_with_operations;

// #Hard #String #Dynamic_Programming #Greedy
// #2025_06_10_Time_50_ms_(98.37%)_Space_45.06_MB_(98.37%)

public class Solution {
    public int minOperations(String word1, String word2) {
        int[] dp = new int[word1.length()];
        int[][] count = new int[26][26];
        for (int i = 0; i < word1.length(); i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < word1.length(); i++) {
            for (int j = i; j >= 0; j--) {
                int c1 = 0;
                int c2 = 0;
                for (int k1 = j, k2 = j; k1 <= i && k2 <= i; k1++, k2++) {
                    int[] ints = count[word2.charAt(k2) - 'a'];
                    if (ints[word1.charAt(k1) - 'a'] > 0) {
                        ints[word1.charAt(k1) - 'a']--;
                    } else if (word1.charAt(k1) != word2.charAt(k2)) {
                        count[word1.charAt(k1) - 'a'][word2.charAt(k2) - 'a']++;
                        c1++;
                    }
                }
                for (int k1 = j, k2 = j; k1 <= i && k2 <= i; k1++, k2++) {
                    count[word1.charAt(k1) - 'a'][word2.charAt(k2) - 'a'] = 0;
                }
                dp[i] = Math.min(dp[i], j - 1 < 0 ? c1 : dp[j - 1] + c1);
                for (int k1 = j, k2 = i; k1 <= i && k2 >= j; k1++, k2--) {
                    int[] ints = count[word2.charAt(k2) - 'a'];
                    if (ints[word1.charAt(k1) - 'a'] > 0) {
                        ints[word1.charAt(k1) - 'a']--;
                    } else if (word1.charAt(k1) - 'a' != word2.charAt(k2) - 'a') {
                        count[word1.charAt(k1) - 'a'][word2.charAt(k2) - 'a']++;
                        c2++;
                    }
                }
                for (int k1 = j, k2 = i; k1 <= i && k2 >= j; k1++, k2--) {
                    count[word1.charAt(k1) - 'a'][word2.charAt(k2) - 'a'] = 0;
                }
                dp[i] = Math.min(dp[i], j - 1 < 0 ? c2 + 1 : dp[j - 1] + c2 + 1);
            }
        }
        return dp[word1.length() - 1];
    }
}
