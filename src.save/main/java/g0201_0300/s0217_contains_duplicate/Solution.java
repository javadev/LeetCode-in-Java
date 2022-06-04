package g0201_0300.s0217_contains_duplicate;

// #Easy #Top_Interview_Questions #Array #Hash_Table #Sorting #Data_Structure_I_Day_1_Array
// #Programming_Skills_I_Day_11_Containers_and_Libraries
// #2022_06_04_Time_10_ms_(67.20%)_Space_68.1_MB_(64.97%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            } else {
                set.add(n);
            }
        }
        return false;
    }
}
