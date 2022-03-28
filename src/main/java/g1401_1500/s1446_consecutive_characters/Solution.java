package g1401_1500.s1446_consecutive_characters;

// #Easy #String #2022_03_28_Time_3_ms_(30.50%)_Space_42.3_MB_(69.58%)

public class Solution {
    public int maxPower(String s) {
        int max = 0;
        int i = 0;
        while (i < s.length()) {
            int start = i;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
            }
            max = Math.max(max, i - start + 1);
            i++;
        }
        return max;
    }
}
