package g1601_1700.s1608_special_array_with_x_elements_greater_than_or_equal_x;

// #Easy #Array #Sorting #Binary_Search #Binary_Search_I_Day_7
// #2022_04_13_Time_2_ms_(61.14%)_Space_40.5_MB_(81.84%)

import java.util.Arrays;

public class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        for (int x = 1; x <= max; x++) {
            int found = 0;
            int i = nums.length - 1;
            while (i >= 0 && nums[i] >= x) {
                i--;
                found++;
            }
            if (found == x) {
                return x;
            }
        }
        return -1;
    }
}
