package g2801_2900.s2855_minimum_right_shifts_to_sort_the_array;

// #Easy #Array #2023_12_15_Time_1_ms_(100.00%)_Space_42.6_MB_(5.66%)

import java.util.List;

public class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int i;
        for (i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                break;
            }
        }
        if (nums.size() == i) {
            return 0;
        } else {
            int k;
            for (k = i + 1; k < nums.size(); k++) {
                if (nums.get(k) <= nums.get(k - 1)) {
                    break;
                }
            }
            if (k == nums.size() && nums.get(k - 1) < nums.get(0)) {
                return nums.size() - i;
            }
            return -1;
        }
    }
}
