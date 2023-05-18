package g1301_1400.s1317_convert_integer_to_the_sum_of_two_no_zero_integers;

// #Easy #Math #2022_03_19_Time_1_ms_(84.36%)_Space_42.4_MB_(12.73%)

public class Solution {
    public int[] getNoZeroIntegers(int n) {
        int left = 1;
        int right = n - 1;
        while (left <= right) {
            if (noZero(left) && noZero(right)) {
                return new int[] {left, right};
            } else {
                left++;
                right--;
            }
        }
        return new int[] {};
    }

    private boolean noZero(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                return false;
            } else {
                num /= 10;
            }
        }
        return true;
    }
}
