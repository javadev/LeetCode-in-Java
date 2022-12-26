package g0001_0100.s0006_zigzag_conversion;

// #Medium #String #2022_06_13_Time_3_ms_(98.64%)_Space_42.5_MB_(95.79%)

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
