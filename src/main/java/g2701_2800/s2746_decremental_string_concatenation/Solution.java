package g2701_2800.s2746_decremental_string_concatenation;

// #Medium #Array #String #Dynamic_Programming
// #2023_09_24_Time_34_ms_(85.89%)_Space_50.1_MB_(44.78%)

public class Solution {
    private Integer[][][] dp;

    public int minimizeConcatenatedLength(String[] words) {
        int n = words.length;
        dp = new Integer[n][26][26];
        String curWord = words[0];
        int curLen = curWord.length();
        char curFirst = curWord.charAt(0);
        char curLast = curWord.charAt(curLen - 1);
        return curLen + solve(1, curFirst, curLast, n, words);
    }

    private int solve(int idx, char prevFirst, char prevLast, int n, String[] words) {
        if (idx == n) {
            return 0;
        }
        if (dp[idx][prevFirst - 'a'][prevLast - 'a'] != null) {
            return dp[idx][prevFirst - 'a'][prevLast - 'a'];
        }
        String curWord = words[idx];
        int curLen = curWord.length();
        char curFirst = curWord.charAt(0);
        char curLast = curWord.charAt(curLen - 1);
        int ans = (int) 1e9;
        if (prevFirst == curLast) {
            ans = Math.min(ans, curLen - 1 + solve(idx + 1, curFirst, prevLast, n, words));
        } else {
            ans = Math.min(ans, curLen + solve(idx + 1, curFirst, prevLast, n, words));
        }
        if (prevLast == curFirst) {
            ans = Math.min(ans, curLen - 1 + solve(idx + 1, prevFirst, curLast, n, words));
        } else {
            ans = Math.min(ans, curLen + solve(idx + 1, prevFirst, curLast, n, words));
        }
        dp[idx][prevFirst - 'a'][prevLast - 'a'] = ans;
        return ans;
    }
}
