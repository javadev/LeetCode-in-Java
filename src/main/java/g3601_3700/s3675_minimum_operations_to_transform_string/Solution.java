package g3601_3700.s3675_minimum_operations_to_transform_string;

// #Medium #Weekly_Contest_466 #2025_09_14_Time_5_ms_(100.00%)_Space_47.93_MB_(95.06%)

public class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            final char c = s.charAt(i);
            if (c != 'a') {
                int ops = 'z' - c + 1;
                if (ops > ans) {
                    ans = ops;
                }
                if (ops == 25) {
                    break;
                }
            }
        }
        return ans;
    }
}
