package s0005_longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        char[] cs = s.toCharArray();
        for (int i = 0, max = 0, prev = 0; i < cs.length; ++i) {
            if (i - max - 1 >= 0
                    && cs[i - max - 1] == cs[i]
                    && (prev == i - 1 || isPalindrome(cs, i - max, i))) {
                start = i - max - 1;
                end = i + 1;
                max += 2;
                prev = i;
            } else if (isPalindrome(cs, i - max, i + 1)) {
                start = i - max;
                end = i + 1;
                ++max;
                prev = i;
            }
        }
        return s.substring(start, end);
    }

    private static boolean isPalindrome(char[] cs, int start, int end) {
        for (int i = start, j = end - 1; i < j; ++i, --j) {
            if (cs[i] != cs[j]) {
                return false;
            }
        }
        return true;
    }
}
