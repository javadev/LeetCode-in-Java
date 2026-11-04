package g3901_4000.s3980_minimum_operations_to_transform_binary_string;

// #Medium #String #Dynamic_Programming #Greedy #Staff #Biweekly_Contest_186
// #2026_11_03_Time_10_ms_(100.00%)_Space_47.23_MB_(95.24%)

public class Solution {
    public int minOperations(String s1, String s2) {
        int n = s1.length();
        int sumDiff = 0;
        int pairs = 0;
        boolean isCovered = false;
        for (int i = 0; i < n; i++) {
            int diff = s1.charAt(i) - s2.charAt(i);
            sumDiff += diff;
            if (diff == 1 && !isCovered) {
                if (i + 1 < n) {
                    pairs++;
                    isCovered = true;
                } else {
                    if (i > 0) {
                        pairs++;
                    } else {
                        return -1;
                    }
                }
            } else {
                isCovered = false;
            }
        }
        return 3 * pairs - sumDiff;
    }
}
