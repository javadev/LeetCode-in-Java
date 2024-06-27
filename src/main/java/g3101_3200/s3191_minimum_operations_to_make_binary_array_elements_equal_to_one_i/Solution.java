package g3101_3200.s3191_minimum_operations_to_make_binary_array_elements_equal_to_one_i;

// #Medium #Array #Bit_Manipulation #Prefix_Sum #Sliding_Window #Queue
// #2024_06_26_Time_6_ms_(99.99%)_Space_57.2_MB_(62.07%)

public class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        // Iterate through the array up to the third-last element
        for (int i = 0; i < nums.length - 2; i++) {
            // If the current element is 0, perform an operation
            if (nums[i] == 0) {
                ans++;
                // Flip the current element and the next two elements
                nums[i] = 1;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
            }
        }
        // Check the last two elements if they are 0, return -1 as they cannot be flipped
        for (int i = nums.length - 2; i < nums.length; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }
        return ans;
    }
}
