package g3101_3200.s3144_minimum_substring_partition_of_equal_character_frequency;

// #Medium #String #Hash_Table #Dynamic_Programming #Counting
// #2024_05_15_Time_37_ms_(100.00%)_Space_44.9_MB_(72.95%)

import java.util.Arrays;

public class Solution {
    public int minimumSubstringsInPartition(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            int[] count = new int[26];
            int distinct = 0;
            int maxCount = 0;
            for (int j = i - 1; j >= 0; --j) {
                int index = cs[j] - 'a';
                if (++count[index] == 1) {
                    distinct++;
                }
                if (count[index] > maxCount) {
                    maxCount = count[index];
                }
                if (maxCount * distinct == i - j) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n];
    }
}
