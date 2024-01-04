package g0001_0100.s0006_zigzag_conversion;

// #Medium #String #2024_01_04_Time_2_ms_(99.60%)_Space_44.7_MB_(38.67%)

public class Solution {
    public String convert(String s, int numRows) {
        int sLen = s.length();
        if (numRows == 1) {
            return s;
        }
        int maxDist = numRows * 2 - 2;
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int index = i;
            if (i == 0 || i == numRows - 1) {
                while (index < sLen) {
                    buf.append(s.charAt(index));
                    index += maxDist;
                }
            } else {
                while (index < sLen) {
                    buf.append(s.charAt(index));
                    index += maxDist - i * 2;
                    if (index >= sLen) {
                        break;
                    }
                    buf.append(s.charAt(index));
                    index += i * 2;
                }
            }
        }
        return buf.toString();
    }
}
