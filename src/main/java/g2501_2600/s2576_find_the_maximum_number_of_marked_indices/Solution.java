package g2501_2600.s2576_find_the_maximum_number_of_marked_indices;

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers
// #2023_08_22_Time_27_ms_(95.36%)_Space_54.9_MB_(88.74%)

import java.util.Arrays;

public class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length / 2;
        long count = 0;
        while (i < nums.length / 2 && j < nums.length) {
            if (nums[i] * 2 <= nums[j]) {
                i++;
                j++;
                count = count + 2;
            } else {
                j++;
            }
        }
        return (int) count;
    }
}
