package g4001_4100.s4006_count_valid_prefixes;

// #Easy #String #Counting #Mid_Level #Biweekly_Contest_188
// #2026_11_17_Time_2_ms_(55.11%)_Space_43.18_MB_(90.05%)

public class Solution {
    public int countValidPrefixes(String s) {
        int one = 0;
        int zero = 0;
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            } else {
                zero++;
            }

            if (Math.abs(one - zero) <= 1) {
                ans++;
            }
        }
        return ans;
    }
}
