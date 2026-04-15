package g3701_3800.s3736_minimum_moves_to_equal_array_elements_iii;

// #Easy #Array #Math #Biweekly_Contest_169

public class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        return max * nums.length - sum;
    }
}
