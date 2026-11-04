package g3901_4000.s3981_count_distinct_ways_to_form_target_from_two_strings;

// #Hard #String #Dynamic_Programming #Prefix_Sum #Senior_Staff #Biweekly_Contest_186
// #2026_11_03_Time_28_ms_(100.00%)_Space_45.96_MB_(95.35%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int interleaveCharacters(String word1, String word2, String target) {
        int wl1 = word1.length();
        int wl2 = word2.length();
        int tl = target.length();
        int[][] dp = initializeDP(wl1, wl2);
        int[][] nextDp = new int[wl1 + 1][wl2 + 1];
        int[][] s1 = new int[wl1 + 1][wl2 + 1];
        int[][] s2 = new int[wl1 + 1][wl2 + 1];
        boolean[] m1 = new boolean[wl1];
        boolean[] m2 = new boolean[wl2];
        for (int i = tl - 1; i >= 0; i--) {
            char tc = target.charAt(i);
            updateMatches(word1, m1, tc);
            updateMatches(word2, m2, tc);
            calculateS1(s1, dp, m1, wl1, wl2);
            calculateS2(s2, s1, nextDp, dp, m2, wl1, wl2);
            int[][] temp = dp;
            dp = nextDp;
            nextDp = temp;
        }
        long[] dp1 = helper(word1, target, tl, wl1);
        long[] dp2 = helper(word2, target, tl, wl2);
        long ans = (dp[0][0] - dp1[0] - dp2[0]) % MOD;
        return (int) ((ans + MOD) % MOD);
    }

    private int[][] initializeDP(int wl1, int wl2) {
        int[][] dp = new int[wl1 + 1][wl2 + 1];
        for (int i = 0; i <= wl1; i++) {
            Arrays.fill(dp[i], 1);
        }
        return dp;
    }

    private void updateMatches(String word, boolean[] matches, char targetChar) {
        for (int i = 0; i < word.length(); i++) {
            matches[i] = word.charAt(i) == targetChar;
        }
    }

    private void calculateS1(int[][] s1, int[][] dp, boolean[] m1, int wl1, int wl2) {
        Arrays.fill(s1[wl1], 0);
        for (int j = wl1 - 1; j >= 0; j--) {
            int[] current = s1[j];
            int[] next = s1[j + 1];
            if (m1[j]) {
                calculateS1Row(current, next, dp[j + 1], wl2);
            } else {
                System.arraycopy(next, 0, current, 0, wl2 + 1);
            }
        }
    }

    private void calculateS1Row(int[] current, int[] next, int[] dpNext, int wl2) {
        for (int k = wl2; k >= 0; k--) {
            current[k] = (next[k] + dpNext[k]) % MOD;
        }
    }

    private void calculateS2(
            int[][] s2, int[][] s1, int[][] nextDp, int[][] dp, boolean[] m2, int wl1, int wl2) {
        for (int j = 0; j <= wl1; j++) {
            calculateS2Row(s2[j], s1[j], nextDp[j], dp[j], m2, wl2);
        }
    }

    private void calculateS2Row(
            int[] s2Row, int[] s1Row, int[] nextDpRow, int[] dpRow, boolean[] m2, int wl2) {
        s2Row[wl2] = 0;
        for (int k = wl2 - 1; k >= 0; k--) {
            int val = s2Row[k + 1];
            if (m2[k]) {
                val = (val + dpRow[k + 1]) % MOD;
            }
            s2Row[k] = val;
            nextDpRow[k] = (s1Row[k] + val) % MOD;
        }
        nextDpRow[wl2] = s1Row[wl2];
    }

    private long[] helper(String word1, String target, int tl, int wl1) {
        long[] ans = new long[wl1 + 1];
        Arrays.fill(ans, 1);
        for (int i = tl - 1; i >= 0; i--) {
            ans = calculateHelperRow(word1, target.charAt(i), ans, wl1);
        }
        return ans;
    }

    private long[] calculateHelperRow(String word, char targetChar, long[] ans, int length) {
        long[] next = new long[length + 1];
        long sum = 0;
        for (int j = length - 1; j >= 0; j--) {
            if (word.charAt(j) == targetChar) {
                sum = (sum + ans[j + 1]) % MOD;
            }
            next[j] = sum;
        }
        return next;
    }
}
