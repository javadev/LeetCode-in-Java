package g0201_0300.s0217_contains_duplicate;

// #Easy #Top_Interview_Questions #Array #Hash_Table #Sorting

import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
