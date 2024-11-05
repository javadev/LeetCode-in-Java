package g3301_3400.s3340_check_balanced_string;

// #Easy #String #2024_11_05_Time_1_ms_(99.60%)_Space_42_MB_(79.77%)

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
