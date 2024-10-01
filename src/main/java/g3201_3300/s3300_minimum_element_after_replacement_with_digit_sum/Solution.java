package g3201_3300.s3300_minimum_element_after_replacement_with_digit_sum;

// #Easy #Array #Math #2024_10_01_Time_1_ms_(100.00%)_Space_42.9_MB_(75.97%)

public class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int x : nums) {
            min = Math.min(min, solve(x));
        }
        return min;
    }

    private int solve(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
