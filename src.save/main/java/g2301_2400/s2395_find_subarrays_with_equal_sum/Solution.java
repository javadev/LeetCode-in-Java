package g2301_2400.s2395_find_subarrays_with_equal_sum;

// #Easy #Array #Hash_Table #2022_09_14_Time_0_ms_(100.00%)_Space_40.3_MB_(93.74%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length; ++i) {
            if (!set.add(nums[i] + nums[i - 1])) {
                return true;
            }
        }
        return false;
    }
}
