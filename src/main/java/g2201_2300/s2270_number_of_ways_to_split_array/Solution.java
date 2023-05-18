package g2201_2300.s2270_number_of_ways_to_split_array;

// #Medium #Array #Prefix_Sum #2022_06_15_Time_4_ms_(77.55%)_Space_91.9_MB_(18.27%)

public class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0;
        long rightSum = 0;
        for (int i : nums) {
            rightSum += i;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            rightSum -= nums[i];
            leftSum += nums[i];
            if (leftSum >= rightSum) {
                count++;
            }
        }
        return count;
    }
}
