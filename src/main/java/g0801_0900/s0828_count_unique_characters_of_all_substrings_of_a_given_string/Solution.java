package g0801_0900.s0828_count_unique_characters_of_all_substrings_of_a_given_string;

// #Hard #String #Hash_Table #Dynamic_Programming
// #2022_07_10_Time_26_ms_(54.76%)_Space_54.2_MB_(42.85%)

import java.util.Arrays;

public class Solution {
    public int uniqueLetterString(String s) {
        // Store last index of a character.
        int[] lastCharIdx = new int[26];
        // Store last to last index of a character.
        // Eg. For ABA - lastCharIdx = 2, prevLastCharIdx = 0.
        int[] prevLastCharIdx = new int[26];
        Arrays.fill(lastCharIdx, -1);
        Arrays.fill(prevLastCharIdx, -1);
        int len = s.length();
        int[] dp = new int[len];
        int accumCount = 1;
        dp[0] = 1;
        lastCharIdx[s.charAt(0) - 'A'] = 0;
        prevLastCharIdx[s.charAt(0) - 'A'] = 0;
        for (int i = 1; i < len; i++) {
            char ch = s.charAt(i);
            int chIdx = ch - 'A';
            int lastSeenIdx = lastCharIdx[chIdx];
            int prevLastIdx = prevLastCharIdx[chIdx];
            dp[i] = dp[i - 1] + 1;
            if (lastSeenIdx == -1) {
                dp[i] += i;
            } else {
                // Add count for curr index from index of last char appearance.
                dp[i] += (i - lastSeenIdx - 1);
                if (prevLastIdx == lastSeenIdx) {
                    // if last char idx is the only appearance of the char from left so far,
                    // substrings that overlap [0, lastSeenIdx] will need count to be discounted, as
                    // current char will cause duplication.
                    dp[i] -= lastSeenIdx + 1;
                } else {
                    dp[i] -= (lastSeenIdx - prevLastIdx);
                }
            }
            prevLastCharIdx[chIdx] = lastSeenIdx;
            lastCharIdx[chIdx] = i;
            accumCount += dp[i];
        }
        return accumCount;
    }
}
