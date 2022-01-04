package g0501_0600.s0557_reverse_words_in_a_string_iii;

// #Easy #String #Two_Pointers

public class Solution {
    public String reverseWords(String s) {
        int l = 0;
        int r = 0;
        int len = s.length();
        char[] ch = s.toCharArray();
        for (int i = 0; i <= len; i++) {
            if (i == len || ch[i] == ' ') {
                l = r;
                r = i;
                reverse(ch, l, r - 1);
                r++;
            }
        }
        return new String(ch);
    }

    private void reverse(char[] s, int l, int r) {
        char c;
        while (r > l) {
            c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }
}
