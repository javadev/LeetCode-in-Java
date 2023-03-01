package g0701_0800.s0724_find_pivot_index;

// #Easy #Array #Prefix_Sum #Level_1_Day_1_Prefix_Sum
// #2022_03_24_Time_2_ms_(69.67%)_Space_52.1_MB_(59.19%)

public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = sums[nums.length - 1] - sums[i];
            if (i == 0 && 0 == temp || (i > 0 && sums[i - 1] == temp)) {
                return i;
            }
        }
        return -1;
    }
}
