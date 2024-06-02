package g3101_3200.s3163_string_compression_iii;

// #Medium #String #2024_06_02_Time_17_ms_(88.10%)_Space_45.7_MB_(71.08%)

public class Solution {
    public String compressedString(String word) {
        StringBuilder builder = new StringBuilder();
        char last = word.charAt(0);
        int count = 1;
        for (int i = 1, l = word.length(); i < l; i++) {
            if (word.charAt(i) == last) {
                count++;
                if (count == 10) {
                    builder.append(9).append(last);
                    count = 1;
                }
            } else {
                builder.append(count).append(last);
                last = word.charAt(i);
                count = 1;
            }
        }
        builder.append(count).append(last);
        return builder.toString();
    }
}
