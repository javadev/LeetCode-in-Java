package g2501_2600.s2535_difference_between_element_sum_and_digit_sum_of_an_array;

// #Easy #Array #Math #2023_04_21_Time_3_ms_(77.42%)_Space_42.7_MB_(64.58%)

public class Solution {
    private int getsum(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        for (int j : nums) {
            if (j >= 10) {
                int sumC = getsum(j);
                digitSum += sumC;
            } else {
                digitSum += j;
            }
        }
        for (int num : nums) {

            eleSum += num;
        }
        int max = Math.max(eleSum, digitSum);
        int min = Math.min(eleSum, digitSum);
        return max - min;
    }
}
