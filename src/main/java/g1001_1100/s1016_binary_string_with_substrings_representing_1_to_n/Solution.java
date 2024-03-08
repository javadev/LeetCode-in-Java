package g1001_1100.s1016_binary_string_with_substrings_representing_1_to_n;

// #Medium #String #2022_02_25_Time_0_ms_(100.00%)_Space_42.1_MB_(23.40%)

public class Solution {
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            String str = Integer.toBinaryString(i);
            if (!s.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
