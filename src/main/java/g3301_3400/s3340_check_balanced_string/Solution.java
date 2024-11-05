package g3301_3400.s3340_check_balanced_string;

// #Easy #2024_11_04_Time_0_ms_(100.00%)_Space_42.1_MB_(100.00%)

public class Solution {
    public boolean isBalanced(String num) {
        int diff = 0;
        int sign = 1;
        int n = num.length();
        for (int i = 0; i < n; ++i) {
            diff += sign * (num.charAt(i) - '0');
            sign = -sign;
        }
        return diff == 0;
    }
}
