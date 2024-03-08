package g1401_1500.s1422_maximum_score_after_splitting_a_string;

// #Easy #String #2022_03_28_Time_1_ms_(96.45%)_Space_42_MB_(57.42%)

public class Solution {
    public int maxScore(String s) {
        int zeroes = s.charAt(0) == '0' ? 1 : 0;
        int ones = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        int maxScore = zeroes + ones;
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroes++;
            } else {
                ones--;
            }
            maxScore = Math.max(maxScore, zeroes + ones);
        }
        return maxScore;
    }
}
