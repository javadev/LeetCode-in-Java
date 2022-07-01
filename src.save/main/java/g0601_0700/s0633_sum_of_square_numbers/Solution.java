package g0601_0700.s0633_sum_of_square_numbers;

// #Medium #Math #Binary_Search #Two_Pointers #Binary_Search_I_Day_10
// #2022_03_21_Time_4_ms_(82.92%)_Space_40.6_MB_(62.43%)

public class Solution {
    public boolean judgeSquareSum(int c) {
        int right = (int) Math.sqrt(c);
        int left = (int) Math.sqrt((double) c / 2);
        for (int i = left; i <= right; i++) {
            int j = (int) Math.sqrt(c - (double) (i * i));
            if (i * i + j * j == c) {
                return true;
            }
        }
        return false;
    }
}
