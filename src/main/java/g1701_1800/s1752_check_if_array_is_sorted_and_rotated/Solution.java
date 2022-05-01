package g1701_1800.s1752_check_if_array_is_sorted_and_rotated;

// #Easy #Array #2022_05_01_Time_0_ms_(100.00%)_Space_42.4_MB_(9.86%)

public class Solution {
    public boolean check(int[] nums) {
        int checker = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                checker++;
            }
        }
        // checking if the last element is greater than the first
        if (nums[nums.length - 1] > nums[0]) {
            checker++;
        }
        return checker <= 1;
    }
}
