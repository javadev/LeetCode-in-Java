package g2701_2800.s2766_relocate_marbles;

// #Medium #Array #Hash_Table #Sorting #Simulation
// #2023_09_24_Time_47_ms_(91.67%)_Space_60.2_MB_(36.33%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < moveTo.length; i++) {
            if (set.contains(moveFrom[i])) {
                set.remove(moveFrom[i]);
                set.add(moveTo[i]);
            }
        }
        List<Integer> result = new ArrayList<>(set);
        result.sort(null);
        return result;
    }
}
