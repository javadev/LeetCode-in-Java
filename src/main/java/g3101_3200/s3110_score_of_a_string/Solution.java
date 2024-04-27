package g3101_3200.s3110_score_of_a_string;

// #Easy #String #2024_04_27_Time_1_ms_(99.93%)_Space_41.4_MB_(99.03%)

public class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs((s.charAt(i) - '0') - (s.charAt(i + 1) - '0'));
        }
        return sum;
    }
}
