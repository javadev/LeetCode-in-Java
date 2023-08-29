package g1001_1100.s1017_convert_to_base_2;

// #Medium #Math #2022_05_02_Time_1_ms_(89.45%)_Space_39.8_MB_(84.40%)

public class Solution {
    public String baseNeg2(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        int carry = 0;
        int sum;
        int pos = 0;
        while (pos < sb.length()) {
            sum = carry + sb.charAt(pos) - '0';
            sb.setCharAt(pos, sum % 2 == 0 ? '0' : '1');
            carry = sum / 2;
            if (pos % 2 == 1 && sb.charAt(pos) == '1') {
                carry += 1;
            }
            pos++;
            if (pos >= sb.length() && carry > 0) {
                sb.append(Integer.toBinaryString(carry));
                carry = 0;
            }
        }
        return sb.reverse().toString();
    }
}
