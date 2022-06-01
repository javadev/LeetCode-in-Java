package g2101_2200.s2154_keep_multiplying_found_values_by_two;

// #Easy #Array #Hash_Table #Sorting #Simulation #2022_06_01_Time_1_ms_(93.21%)_Space_44.1_MB_(61.27%)

public class Solution {
    public int findFinalValue(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == original) {
                original = original * 2;
                i = -1;
            }
        }
        return original;
    }
}