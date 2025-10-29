package g3701_3800.s3726_remove_zeros_in_decimal_representation;

// #Easy #Math #Simulation #Weekly_Contest_473
// #2025_10_29_Time_1_ms_(98.59%)_Space_40.46_MB_(99.88%)

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
