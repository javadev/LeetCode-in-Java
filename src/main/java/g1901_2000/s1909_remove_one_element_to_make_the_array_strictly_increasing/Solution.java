package g1901_2000.s1909_remove_one_element_to_make_the_array_strictly_increasing;

// #Easy #Array #2022_05_12_Time_0_ms_(100.00%)_Space_44.1_MB_(7.24%)

public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean removed = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (removed) {
                    return false;
                } else {
                    removed = true;
                }
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
