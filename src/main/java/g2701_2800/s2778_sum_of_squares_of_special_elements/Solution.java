package g2701_2800.s2778_sum_of_squares_of_special_elements;

// #Easy #Array #Simulation #2023_09_21_Time_1_ms_(100.00%)_Space_42.8_MB_(94.54%)

public class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
}
