package g3501_3600.s3503_longest_palindrome_after_substring_concatenation_i;

// #Medium #String #Dynamic_Programming #Two_Pointers #Enumeration
// #2025_04_01_Time_30_ms_(97.15%)_Space_42.23_MB_(99.79%)

public class Solution {
    public int longestPalindrome(String s, String t) {
        int maxLen = 0;
        maxLen = Math.max(maxLen, longestPalindromicSubstring(s));
        maxLen = Math.max(maxLen, longestPalindromicSubstring(t));
        int sLen = s.length();
        int tLen = t.length();
        for (int i = 0; i < sLen; i++) {
            for (int j = i; j < sLen; j++) {
                int m = j - i + 1;
                for (int k = 0; k < tLen; k++) {
                    for (int l = k; l < tLen; l++) {
                        int n = l - k + 1;
                        int totalLength = m + n;
                        if (totalLength <= maxLen) {
                            continue;
                        }
                        boolean isPalindrome = true;
                        for (int p = 0; p < totalLength / 2; p++) {
                            int q = totalLength - 1 - p;
                            char c1, c2;
                            if (p < m) {
                                c1 = s.charAt(i + p);
                            } else {
                                c1 = t.charAt(k + (p - m));
                            }
                            if (q < m) {
                                c2 = s.charAt(i + q);
                            } else {
                                c2 = t.charAt(k + (q - m));
                            }
                            if (c1 != c2) {
                                isPalindrome = false;
                                break;
                            }
                        }
                        if (isPalindrome) {
                            maxLen = totalLength;
                        }
                    }
                }
            }
        }
        return maxLen;
    }

    private int longestPalindromicSubstring(String str) {
        int max = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                boolean isPalin = true;
                int left = i;
                int right = j;
                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        isPalin = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isPalin) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}
