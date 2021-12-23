package g0401_0500.s0453_minimum_moves_to_equal_array_elements;

// #Medium #Array #Math

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
