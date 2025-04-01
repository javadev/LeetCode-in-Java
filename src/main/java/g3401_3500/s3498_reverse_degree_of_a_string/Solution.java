package g3401_3500.s3498_reverse_degree_of_a_string;

// #Easy #String #Simulation #2025_04_01_Time_1_ms_(100.00%)_Space_42.64_MB_(92.21%)

public class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            ans += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
        return ans;
    }
}
