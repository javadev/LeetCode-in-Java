package g0301_0400.s0345_reverse_vowels_of_a_string;

// #Easy #String #Two_Pointers

public class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private StringBuilder swap(StringBuilder s, int l, int r) {
        char tmp = s.charAt(l);
        s.setCharAt(l, s.charAt(r));
        s.setCharAt(r, tmp);
        return s;
    }

    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        StringBuilder res = new StringBuilder(s);
        while (l < r) {
            while (l < r && !isVowel(s.charAt(l))) {
                l++;
            }
            while (l < r && !isVowel(s.charAt(r))) {
                r--;
            }
            res = swap(res, l, r);
            l++;
            r--;
        }
        return res.toString();
    }
}
