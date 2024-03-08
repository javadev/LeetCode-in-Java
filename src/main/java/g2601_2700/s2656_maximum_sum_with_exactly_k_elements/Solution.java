package g2601_2700.s2656_maximum_sum_with_exactly_k_elements;

// #Easy #Array #Greedy #2023_09_07_Time_1_ms_(100.00%)_Space_43.8_MB_(40.39%)

public class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        for (int i = 0; i < k; i++) {
            sum += max;
            max++;
        }
        return sum;
    }
}
