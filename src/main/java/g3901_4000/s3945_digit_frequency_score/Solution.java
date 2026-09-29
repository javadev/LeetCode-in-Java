package g3901_4000.s3945_digit_frequency_score;

// #Easy #Hash_Table #Math #Mid_Level #Weekly_Contest_504
// #2026_09_29_Time_1_ms_(98.46%)_Space_42.42_MB_(81.44%)

public class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}
