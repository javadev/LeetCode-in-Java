package g0301_0400.s0334_increasing_triplet_subsequence;

// #Medium #Array #Greedy #Data_Structure_II_Day_5_Array
// #2022_07_10_Time_2_ms_(99.33%)_Space_93.5_MB_(47.20%)

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
