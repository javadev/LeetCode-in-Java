package g2401_2500.s2441_largest_positive_integer_that_exists_with_its_negative;

// #Easy #Array #Hash_Table #2022_12_13_Time_8_ms_(79.93%)_Space_42.7_MB_(84.42%)

import java.util.Arrays;

public class Solution {
    public int findMaxK(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr[j++] = nums[i];
            }
        }
        Arrays.sort(arr);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if ((arr[i] * -1) == num) {
                    return num;
                }
            }
        }
        return -1;
    }
}
