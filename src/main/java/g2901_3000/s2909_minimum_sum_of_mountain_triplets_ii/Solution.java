package g2901_3000.s2909_minimum_sum_of_mountain_triplets_ii;

// #Medium #Array #2023_12_27_Time_2_ms_(99.79%)_Space_57.3_MB_(69.77%)

public class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] leftSmallest = new int[n];
        int[] rightSmallest = new int[n];
        int currSmallest = nums[0];
        leftSmallest[0] = -1;
        for (int i = 1; i < n; i++) {
            if (currSmallest >= nums[i]) {
                leftSmallest[i] = -1;
                currSmallest = nums[i];
            } else {
                leftSmallest[i] = currSmallest;
            }
        }
        currSmallest = nums[n - 1];
        rightSmallest[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (currSmallest >= nums[i]) {
                rightSmallest[i] = -1;
                currSmallest = nums[i];
            } else {
                rightSmallest[i] = currSmallest;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (leftSmallest[i] != -1 && rightSmallest[i] != -1) {
                ans = Math.min(ans, leftSmallest[i] + rightSmallest[i] + nums[i]);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}
