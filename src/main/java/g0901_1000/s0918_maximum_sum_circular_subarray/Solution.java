package g0901_1000.s0918_maximum_sum_circular_subarray;

// #Medium #Array #Dynamic_Programming #Divide_and_Conquer #Queue #Monotonic_Queue
// #Dynamic_Programming_I_Day_5 #2022_03_29_Time_3_ms_(92.86%)_Space_64.3_MB_(40.27%)

public class Solution {
    private int kadane(int[] nums, int sign) {
        int currSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i : nums) {
            currSum = sign * i + Math.max(currSum, 0);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sumOfArray = 0;
        for (int i : nums) {
            sumOfArray += i;
        }
        int maxSumSubarray = kadane(nums, 1);
        int minSumSubarray = kadane(nums, -1) * -1;
        if (sumOfArray == minSumSubarray) {
            return maxSumSubarray;
        } else {
            return Math.max(maxSumSubarray, sumOfArray - minSumSubarray);
        }
    }
}
