package g3501_3600.s3503_longest_palindrome_after_substring_concatenation_i;

// #Medium #2025_03_30_Time_389_ms_(56.95%)_Space_45.18_MB_(96.47%)

public class Solution {
    public int longestPalindrome(String s, String t) {
        int result = 0;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String subStrS = s.substring(i, j);
                for (int k = 0; k <= t.length(); k++) {
                    for (int l = k; l <= t.length(); l++) {
                        String subStrT = t.substring(k, l);
                        String combineStr = subStrS + subStrT;
                        if (isPalindrome(combineStr)) {
                            result = Math.max(result, combineStr.length());
                        }
                    }
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
