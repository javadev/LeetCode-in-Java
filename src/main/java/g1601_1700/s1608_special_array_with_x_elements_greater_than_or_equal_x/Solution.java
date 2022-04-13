package g1601_1700.s1608_special_array_with_x_elements_greater_than_or_equal_x;

// #Easy #Array #Sorting #Binary_Search #Binary_Search_I_Day_7
// #2022_04_13_Time_1_ms_(90.88%)_Space_40.3_MB_(82.63%)

import java.util.Arrays;

public class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length; i > 0; i--) {
            int size = nums.length - i;
            if ((nums[size] > i || nums[size] == i) && (i == nums.length || nums[size - 1] < i)) {
                return i;
            }
        }
        return -1;
    }
}
