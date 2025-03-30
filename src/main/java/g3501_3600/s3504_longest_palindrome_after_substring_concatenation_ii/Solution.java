package g3501_3600.s3504_longest_palindrome_after_substring_concatenation_ii;

// #Hard #2025_03_30_Time_21_ms_(100.00%)_Space_56.36_MB_(57.78%)

public class Solution {
    private int[] sPa;
    private int[] tPa;
    private char[] ss;
    private char[] tt;

    public int longestPalindrome(String s, String t) {
        final int sLen = s.length();
        final int tLen = t.length();
        ss = s.toCharArray();
        tt = t.toCharArray();
        int[][] palindrome = new int[sLen][tLen + 1];
        sPa = new int[sLen];
        tPa = new int[tLen];
        int maxLen = 1;
        for (int j = 0; j < tLen; j++) {
            if (ss[0] == tt[j]) {
                palindrome[0][j] = 2;
                sPa[0] = 2;
                tPa[j] = 2;
                maxLen = 2;
            }
        }
        for (int i = 1; i < sLen; i++) {
            for (int j = 0; j < tLen; j++) {
                if (ss[i] == tt[j]) {
                    palindrome[i][j] = 2 + palindrome[i - 1][j + 1];
                    sPa[i] = Math.max(sPa[i], palindrome[i][j]);
                    tPa[j] = Math.max(tPa[j], palindrome[i][j]);
                    maxLen = Math.max(maxLen, palindrome[i][j]);
                }
            }
        }
        for (int i = 0; i < sLen - 1; i++) {
            int len = maxS(i, i + 1);
            maxLen = Math.max(maxLen, len);
        }
        for (int i = 1; i < sLen; i++) {
            int len = maxS(i - 1, i + 1) + 1;
            maxLen = Math.max(maxLen, len);
        }
        for (int j = 0; j < tLen - 1; j++) {
            int len = maxT(j, j + 1);
            maxLen = Math.max(maxLen, len);
        }
        for (int j = 0; j < tLen - 1; j++) {
            int len = maxT(j - 1, j + 1) + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    private int maxS(int left, int right) {
        int len = 0;
        while (left >= 0 && right < ss.length && ss[left] == ss[right]) {
            len += 2;
            left--;
            right++;
        }
        if (left >= 0) {
            len += sPa[left];
        }
        return len;
    }

    private int maxT(int left, int right) {
        int len = 0;
        while (left >= 0 && right < tt.length && tt[left] == tt[right]) {
            len += 2;
            left--;
            right++;
        }
        if (right < tt.length) {
            len += tPa[right];
        }
        return len;
    }
}
