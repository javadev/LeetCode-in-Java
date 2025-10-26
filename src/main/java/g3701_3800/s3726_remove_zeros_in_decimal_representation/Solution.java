package g3701_3800.s3726_remove_zeros_in_decimal_representation;

// #Easy #Weekly_Contest_473 #2025_10_26_Time_9_ms_(_%)_Space_41.93_MB_(_%)

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
