package g2301_2400.s2357_make_array_zero_by_subtracting_equal_amounts;

// #Easy #Array #Hash_Table #Sorting #Heap_Priority_Queue #Simulation
// #2022_08_07_Time_1_ms_(98.24%)_Space_41.9_MB_(50.08%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (a > 0) {
                set.add(a);
            }
        }
        return set.size();
    }
}
