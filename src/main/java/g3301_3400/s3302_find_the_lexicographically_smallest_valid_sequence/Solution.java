package g3301_3400.s3302_find_the_lexicographically_smallest_valid_sequence;

// #Medium #String #Dynamic_Programming #Greedy #Two_Pointers
// #2024_10_01_Time_21_ms_(97.32%)_Space_74.3_MB_(74.55%)

public class Solution {
    public int[] validSequence(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int[] dp = new int[c1.length + 1];
        int j = c2.length - 1;
        for (int i = c1.length - 1; i >= 0; i--) {
            if (j >= 0 && c1[i] == c2[j]) {
                dp[i] = dp[i + 1] + 1;
                j--;
            } else {
                dp[i] = dp[i + 1];
            }
        }
        int[] ans = new int[c2.length];
        int i = 0;
        j = 0;
        while (i < c1.length && j < c2.length) {
            if (c1[i] == c2[j]) {
                ans[j] = i;
                j++;
            } else {
                if (dp[i + 1] >= c2.length - 1 - j) {
                    ans[j] = i;
                    j++;
                    i++;
                    break;
                }
            }
            i++;
        }
        if (j < c2.length && i == c1.length) {
            return new int[0];
        }
        while (j < c2.length && i < c1.length) {
            if (c2[j] == c1[i]) {
                ans[j] = i;
                j++;
            }
            i++;
        }
        return ans;
    }
}
