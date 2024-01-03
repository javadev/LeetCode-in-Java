package g2901_3000.s2937_make_three_strings_equal;

// #Easy #String #2024_01_03_Time_1_ms_(100.00%)_Space_44.7_MB_(5.99%)

public class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        boolean pos = true;
        int n = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int ans = 0;
        for (int i = 0; i < n && pos; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
                ans++;
            } else {
                pos = false;
            }
        }
        return ans == 0 ? -1 : s1.length() + s2.length() + s3.length() - (3 * ans);
    }
}
