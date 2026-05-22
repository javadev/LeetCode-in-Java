package g3701_3800.s3798_largest_even_number;

// #Easy #String #Mid_Level #Weekly_Contest_483
// #2026_05_22_Time_0_ms_(100.00%)_Space_43.67_MB_(94.28%)

public class Solution {
    public String largestEven(String s) {
        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                break;
            }
        }
        return s.substring(0, i + 1);
    }
}
