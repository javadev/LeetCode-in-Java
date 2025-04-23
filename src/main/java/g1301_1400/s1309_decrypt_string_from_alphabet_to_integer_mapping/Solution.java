package g1301_1400.s1309_decrypt_string_from_alphabet_to_integer_mapping;

// #Easy #String #Programming_Skills_I_Day_9_String
// #2025_04_23_Time_0_ms_(100.00%)_Space_41.42_MB_(89.95%)

public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                decryptor(builder, i - 1, i - 2, s);
                i -= 3;
            } else {
                char ch = (char) (s.charAt(i) - '0' + 96);
                builder.append(ch);
                i--;
            }
        }
        return builder.reverse().toString();
    }

    private void decryptor(StringBuilder builder, int a, int b, String s) {
        builder.append((char) (((s.charAt(b) - '0') * 10 + s.charAt(a) - '0') + 96));
    }
}
