package g0301_0400.s0324_wiggle_sort_ii;

// #Medium #Array #Sorting #Divide_and_Conquer #Quickselect
// #2022_07_09_Time_4_ms_(93.22%)_Space_46.4_MB_(85.87%)

import java.util.Arrays;

public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        int i = 1;
        // Start filling all peaks (which is all at odd indexes) from start
        for (; i < nums.length; i += 2) {
            result[i] = nums[index];
            --index;
        }
        // Start filling all valleys (which is all at even indexes) from end
        // why from end, as the last peak index may have smallest largest value, so to
        // make sure, that is also '>', fill in the smallest element near it.
        i = ((nums.length - 1) % 2 == 0) ? nums.length - 1 : nums.length - 2;
        index = 0;
        for (; i >= 0; i -= 2) {
            result[i] = nums[index];
            ++index;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
