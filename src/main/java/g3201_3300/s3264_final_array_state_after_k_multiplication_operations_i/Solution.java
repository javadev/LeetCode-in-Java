package g3201_3300.s3264_final_array_state_after_k_multiplication_operations_i;

// #Easy #2024_08_28_Time_1_ms_(100.00%)_Space_44.9_MB_(31.20%)

public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k-- > 0) {
            int min = nums[0];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (min > nums[i]) {
                    min = nums[i];
                    index = i;
                }
            }
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }
}
