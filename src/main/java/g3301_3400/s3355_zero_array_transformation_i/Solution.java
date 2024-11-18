package g3301_3400.s3355_zero_array_transformation_i;

// #Medium #2024_11_18_Time_3_ms_(100.00%)_Space_94.7_MB_(100.00%)

public class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum == 0) {
            return true;
        }
        int[] diff = new int[n + 1];
        for (int[] q : queries) {
            int low = q[0];
            int high = q[1];
            diff[low] -= 1;
            if (high + 1 < n) {
                diff[high + 1] += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                diff[i] += diff[i - 1];
            }
            nums[i] += diff[i];
            sum += diff[i];
            if (nums[i] > 0) {
                return false;
            }
        }
        return sum <= 0;
    }
}
