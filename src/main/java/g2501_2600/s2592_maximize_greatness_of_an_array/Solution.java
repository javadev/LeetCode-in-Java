package g2501_2600.s2592_maximize_greatness_of_an_array;

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2023_08_23_Time_8_ms_(100.00%)_Space_57.2_MB_(41.49%)

import java.util.Arrays;

public class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int perm = 0;
        for (int num : nums) {
            if (nums[perm] < num) {
                perm++;
            }
        }
        return perm;
    }
}
