package g2401_2500.s2455_average_value_of_even_numbers_that_are_divisible_by_three;

// #Easy #Array #Math #2022_12_15_Time_1_ms_(100.00%)_Space_42.6_MB_(82.41%)

public class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                count++;
                sum += num;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
}
