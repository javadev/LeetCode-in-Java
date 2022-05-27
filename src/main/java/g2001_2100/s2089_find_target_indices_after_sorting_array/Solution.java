package g2001_2100.s2089_find_target_indices_after_sorting_array;

// #Easy #Array #Sorting #Binary_Search #2022_05_27_Time_1_ms_(97.90%)_Space_42.5_MB_(83.38%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int lessthan = 0;
        for (int n : nums) {
            if (n == target) {
                count++;
            }
            if (n < target) {
                lessthan++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        return result;
    }
}
