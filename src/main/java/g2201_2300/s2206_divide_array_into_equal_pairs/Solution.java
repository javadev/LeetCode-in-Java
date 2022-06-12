package g2201_2300.s2206_divide_array_into_equal_pairs;

// #Easy #Array #Hash_Table #Bit_Manipulation #Counting
// #2022_06_12_Time_4_ms_(68.10%)_Space_46.3_MB_(52.44%)

import java.util.Arrays;

public class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i = i + 2) {
            if (nums[i] != nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
