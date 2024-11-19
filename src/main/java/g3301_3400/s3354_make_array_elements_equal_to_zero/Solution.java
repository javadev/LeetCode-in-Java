package g3301_3400.s3354_make_array_elements_equal_to_zero;

// #Easy #Array #Simulation #Prefix_Sum #2024_11_19_Time_1_ms_(95.09%)_Space_41.9_MB_(92.55%)

public class Solution {
    public int countValidSelections(int[] nums) {
        int[] rightSum = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int result = 0;
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        for (int j = nums.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j + 1] + nums[j + 1];
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0 && Math.abs(rightSum[k] - leftSum[k]) == 1) {
                result++;
            }
            if (nums[k] == 0 && Math.abs(rightSum[k] - leftSum[k]) == 0) {
                result += 2;
            }
        }
        return result;
    }
}
