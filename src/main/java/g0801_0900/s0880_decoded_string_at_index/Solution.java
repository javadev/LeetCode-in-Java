package g0801_0900.s0880_decoded_string_at_index;

// #Medium #String #Stack

public class Solution {
    public String decodeAtIndex(String S, int K) {
        long length = 0;
        for (char c : S.toCharArray()) {
            if (c >= 48 && c <= 57) {
                length *= c - '0';
            } else {
                ++length;
            }
        }
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            K %= length;
            if (c >= 48 && c <= 57) {
                length /= c - '0';
            } else if (K == 0) {
                return String.valueOf(c);
            } else {
                --length;
            }
        }
        return "";
    }
}
