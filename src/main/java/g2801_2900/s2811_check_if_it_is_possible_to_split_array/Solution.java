package g2801_2900.s2811_check_if_it_is_possible_to_split_array;

// #Medium #Array #Dynamic_Programming #Greedy #2023_11_20_Time_1_ms_(98.31%)_Space_43_MB_(50.00%)

import java.util.List;

public class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        if (nums.size() < 3 && !nums.isEmpty()) {
            return true;
        }
        boolean ans = false;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) + nums.get(i + 1) >= m) {
                ans = true;
            }
        }
        return ans;
    }
}
