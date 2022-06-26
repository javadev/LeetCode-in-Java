package g0301_0400.s0334_increasing_triplet_subsequence;

// #Medium #Top_Interview_Questions #Array #Greedy #Data_Structure_II_Day_5_Array
// #2022_03_15_Time_3_ms_(61.85%)_Space_94.1_MB_(22.67%)

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int i = 0;
        int low = Integer.MAX_VALUE;
        int high = Integer.MAX_VALUE;
        while (i < n) {
            if (low >= nums[i]) {
                low = nums[i++];
            } else if (high >= nums[i]) {
                high = nums[i++];
            } else {
                return true;
            }
        }
        return false;
    }
}
