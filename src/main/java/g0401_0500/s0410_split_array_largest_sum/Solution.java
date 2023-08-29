package g0401_0500.s0410_split_array_largest_sum;

// #Hard #Array #Dynamic_Programming #Greedy #Binary_Search
// #2022_07_16_Time_1_ms_(86.51%)_Space_41.4_MB_(68.72%)

public class Solution {
    public int splitArray(int[] nums, int m) {
        int maxVal = 0;
        int minVal = nums[0];
        for (int num : nums) {
            maxVal += num;
            minVal = Math.max(minVal, num);
        }
        while (minVal < maxVal) {
            int midVal = minVal + (maxVal - minVal) / 2;
            // if we can split, try to reduce the midVal so decrease maxVal
            if (canSplit(midVal, nums, m)) {
                maxVal = midVal;
            } else {
                // if we can't split, then try to increase midVal by increasing minVal
                minVal = midVal + 1;
            }
        }
        return minVal;
    }

    private boolean canSplit(int maxSubArrSum, int[] nums, int m) {
        int currSum = 0;
        int currSplits = 1;
        for (int num : nums) {
            currSum += num;
            if (currSum > maxSubArrSum) {
                currSum = num;
                currSplits++;
                // if maxSubArrSum was TOO high that we can split the array into more that 'm' parts
                // then its not ideal
                if (currSplits > m) {
                    return false;
                }
            }
        }
        return true;
    }
}
