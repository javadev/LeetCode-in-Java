package g2801_2900.s2864_maximum_odd_binary_number;

// #Easy #String #Math #Greedy #2023_12_20_Time_1_ms_(100.00%)_Space_41.8_MB_(93.74%)

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        if (count == len) {
            return s;
        }
        len -= count;
        while (count > 1) {
            sb.append('1');
            count--;
        }
        while (len > 0) {
            sb.append('0');
            len--;
        }
        sb.append('1');
        return sb.toString();
    }
}
