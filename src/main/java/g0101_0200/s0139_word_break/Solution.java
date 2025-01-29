package g0101_0200.s0139_word_break;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table
// #Dynamic_Programming #Trie #Memoization #Algorithm_II_Day_15_Dynamic_Programming
// #Dynamic_Programming_I_Day_9 #Udemy_Dynamic_Programming #Top_Interview_150_1D_DP
// #Big_O_Time_O(M+max*N)_Space_O(M+N+max) #2024_11_15_Time_1_ms_(99.42%)_Space_42.1_MB_(80.42%)

import java.util.List;

public class Solution {
    private Boolean[] memo;

    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new Boolean[s.length() + 1];
        return dp(s, 0, wordDict);
    }

    public boolean dp(String s, int i, List<String> wordDict) {
        if (i == s.length()) {
            return true;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        for (String word : wordDict) {
            int len = word.length();
            if (i + len > s.length() || !s.substring(i, i + len).equals(word)) {
                continue;
            }
            if (dp(s, i + len, wordDict)) {
                memo[i] = true;
                return true;
            }
        }
        memo[i] = false;
        return false;
    }
}
