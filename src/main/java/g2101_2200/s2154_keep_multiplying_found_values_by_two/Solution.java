package g2101_2200.s2154_keep_multiplying_found_values_by_two;

// #Easy #Array #Hash_Table #Sorting #Simulation
// #2022_06_01_Time_1_ms_(93.21%)_Space_44.1_MB_(61.27%)

public class Solution {
    public int findFinalValue(int[] nums, int original) {
        while (linearSearch(nums, original)) {
            original *= 2;
        }
        return original;
    }

    boolean linearSearch(int[] nums, int target) {
        for (int i : nums) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}
