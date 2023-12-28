package g2901_3000.s2914_minimum_number_of_changes_to_make_binary_string_beautiful;

// #Medium #String #2023_12_28_Time_3_ms_(99.56%)_Space_44.7_MB_(6.68%)

public class Solution {
    public int minChanges(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ans++;
            }
        }
        return ans;
    }
}
