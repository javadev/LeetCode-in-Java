package g3701_3800.s3726_remove_zeros_in_decimal_representation;

// #Easy #Weekly_Contest_473 #2025_10_28_Time_1_ms_(98.76%)_Space_40.81_MB_(93.77%)

public class Solution {
    public long removeZeros(long n) {
        StringBuilder x = new StringBuilder();
        String s = Long.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                x.append(s.charAt(i));
            }
        }
        return Long.parseLong(x.toString());
    }
}
