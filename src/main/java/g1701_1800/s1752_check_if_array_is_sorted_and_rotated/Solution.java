package g1701_1800.s1752_check_if_array_is_sorted_and_rotated;

// #Easy #Array #2022_04_30_Time_3_ms_(5.38%)_Space_42.8_MB_(6.77%)

import java.util.Arrays;

public class Solution {
    public boolean check(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        for (int i = 1; i <= nums.length; i++) {
            int[] rotated = rotate(nums, i);
            if (Arrays.equals(rotated, copy)) {
                return true;
            }
        }
        return false;
    }

    private int[] rotate(int[] nums, int start) {
        int[] rotated = new int[nums.length];
        int j = 0;
        for (int i = start; i < nums.length; i++, j++) {
            rotated[j] = nums[i];
        }
        for (int i = 0; i < start; i++) {
            rotated[j++] = nums[i];
        }
        return rotated;
    }
}
