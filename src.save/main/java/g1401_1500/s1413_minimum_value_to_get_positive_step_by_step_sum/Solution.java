package g1401_1500.s1413_minimum_value_to_get_positive_step_by_step_sum;

// #Easy #Array #Prefix_Sum #2022_03_26_Time_0_ms_(100.00%)_Space_41.7_MB_(40.67%)

public class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(sum, min);
        }
        return min > 0 ? 1 : Math.abs(min) + 1;
    }
}
