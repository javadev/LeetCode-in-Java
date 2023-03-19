package g0401_0500.s0453_minimum_moves_to_equal_array_elements;

// #Medium #Array #Math #2022_07_18_Time_2_ms_(89.66%)_Space_54.4_MB_(32.48%)

public class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = nums[0];
        // determining the total sum and smallest element of the input array
        for (int i = 1; i <= nums.length - 1; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
        }
        return sum - (min * nums.length);
    }
}
