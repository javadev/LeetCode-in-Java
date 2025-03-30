package g3401_3500.s3498_reverse_degree_of_a_string;

// #Easy #2025_03_30_Time_1_ms_(100.00%)_Space_43.05_MB_(100.00%)

public class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            ans += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
        return ans;
    }
}
