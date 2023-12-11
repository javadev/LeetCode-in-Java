package g1301_1400.s1389_create_target_array_in_the_given_order;

// #Easy #Array #Simulation #2022_03_17_Time_0_ms_(100.00%)_Space_40.5_MB_(71.67%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
