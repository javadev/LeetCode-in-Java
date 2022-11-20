package g2401_2500.s2414_length_of_the_longest_alphabetical_continuous_substring;

// #Medium #String #2022_11_15_Time_28_ms_(36.44%)_Space_53.9_MB_(81.43%)

public class Solution {
    public int longestContinuousSubstring(String s) {
        int ans = 0;
        int cnt = 1;
        int j = 1;
        while (j < s.length()) {
            if (s.charAt(j) == s.charAt(j - 1) + 1) {
                cnt++;
            } else {
                ans = Math.max(ans, cnt);
                cnt = 1;
            }
            j++;
        }
        return Math.max(ans, cnt);
    }
}
