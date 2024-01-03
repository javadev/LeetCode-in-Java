package g2901_3000.s2938_separate_black_and_white_balls;

// #Medium #String #Greedy #Two_Pointers #2024_01_03_Time_7_ms_(99.65%)_Space_45.1_MB_(16.43%)

public class Solution {
    public long minimumSteps(String s) {
        int left = 0;
        int right = s.length() - 1;
        long total = 0;
        while (left < right) {
            while (left < right && s.charAt(left) == '0') {
                left++;
            }
            while (left < right && s.charAt(right) == '1') {
                right--;
            }
            if (left < right) {
                total += (right - left);
                left++;
                right--;
            }
        }
        return total;
    }
}
