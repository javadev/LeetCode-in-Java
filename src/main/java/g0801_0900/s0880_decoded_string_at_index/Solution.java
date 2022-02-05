package g0801_0900.s0880_decoded_string_at_index;

// #Medium #String #Stack

public class Solution {
    public String decodeAtIndex(String s, int k) {
        long length = 0;
        for (char c : s.toCharArray()) {
            if (c >= 48 && c <= 57) {
                length *= c - '0';
            } else {
                ++length;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= length;
            if (c >= 48 && c <= 57) {
                length /= c - '0';
            } else if (k == 0) {
                return String.valueOf(c);
            } else {
                --length;
            }
        }
        return "";
    }
}
