package g2201_2300.s2221_find_triangular_sum_of_an_array;

// #Medium #Array #Math #Simulation #Combinatorics
// #2022_06_09_Time_78_ms_(83.64%)_Space_42.4_MB_(85.99%)

public class Solution {
    public int triangularSum(int[] nums) {
        int len = nums.length;
        while (len-- > 1) {
            for (int i = 0; i < len; i++) {
                nums[i] += nums[i + 1];
                nums[i] %= 10;
            }
        }
        return nums[0];
    }
}
