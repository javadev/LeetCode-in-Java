package g2101_2200.s2108_find_first_palindromic_string_in_the_array;

class Solution {
    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0, j = len - 1; i <= len / 2 && j >= len / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }
}
