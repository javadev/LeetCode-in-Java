package g1701_1800.s1800_maximum_ascending_subarray_sum;

// #Easy #Array #2022_04_19_Time_0_ms_(100.00%)_Space_42.1_MB_(22.29%)

public class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        for (int i = 0, j = i + 1; i < nums.length - 1 && j < nums.length; j++) {
            int sum = nums[j - 1];
            while (j < nums.length && nums[j] - nums[j - 1] > 0) {
                sum += nums[j];
                j++;
            }
            i = j;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
