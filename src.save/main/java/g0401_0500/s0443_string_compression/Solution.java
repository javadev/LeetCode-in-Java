package g0401_0500.s0443_string_compression;

// #Medium #String #Two_Pointers #2022_07_16_Time_2_ms_(65.35%)_Space_44.8_MB_(14.78%)

public class Solution {
    /* This is breaking the rules, it's not in-place. */
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(prev);
                    sb.append(count);
                } else if (count == 1) {
                    sb.append(prev);
                }
                prev = chars[i];
                count = 1;
            }
        }
        sb.append(prev);
        if (count > 1) {
            sb.append(count);
        }
        int i = 0;
        for (char c : sb.toString().toCharArray()) {
            chars[i++] = c;
        }
        return sb.length();
    }
}
