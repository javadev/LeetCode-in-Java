package g1001_1100.s1017_convert_to_base_2;

// #Medium #Math #2022_02_25_Time_2_ms_(34.15%)_Space_41.8_MB_(11.58%)

public class Solution {
    public String baseNeg2(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        int carry = 0, sum;
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
