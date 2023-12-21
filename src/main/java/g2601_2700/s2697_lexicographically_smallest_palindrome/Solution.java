package g2601_2700.s2697_lexicographically_smallest_palindrome;

// #Easy #String #Two_Pointers #2023_09_13_Time_6_ms_(93.45%)_Space_44.3_MB_(45.92%)

public class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (ch[i] != ch[j]) {
                if (ch[i] < ch[j]) {
                    ch[j] = ch[i];
                } else {
                    ch[i] = ch[j];
                }
            }
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
}
