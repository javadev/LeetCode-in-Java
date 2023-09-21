package g2701_2800.s2772_apply_operations_to_make_all_array_elements_equal_to_zero;

// #Medium #Array #Prefix_Sum #2023_09_21_Time_1_ms_(100.00%)_Space_58.1_MB_(54.11%)

public class Solution {
    public boolean checkArray(int[] nums, int k) {
        int cur = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (cur > nums[i]) {
                return false;
            }
            nums[i] -= cur;
            cur += nums[i];
            if (i >= k - 1) {
                cur -= nums[i - k + 1];
            }
        }
        return cur == 0;
    }
}
