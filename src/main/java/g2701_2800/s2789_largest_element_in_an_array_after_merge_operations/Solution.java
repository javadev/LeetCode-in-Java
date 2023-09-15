package g2701_2800.s2789_largest_element_in_an_array_after_merge_operations;

// #Medium #Array #Greedy #Prefix_Sum #2023_09_15_Time_1_ms_(100.00%)_Space_58_MB_(58.92%)

public class Solution {
    public long maxArrayValue(int[] nums) {
        long ans = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; --i) {
            if (ans >= nums[i - 1]) {
                ans += nums[i - 1];
            } else {
                ans = nums[i - 1];
            }
        }
        return ans;
    }
}
