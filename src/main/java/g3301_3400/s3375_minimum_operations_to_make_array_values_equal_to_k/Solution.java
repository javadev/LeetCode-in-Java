package g3301_3400.s3375_minimum_operations_to_make_array_values_equal_to_k;

// #Easy #2024_12_07_Time_3_ms_(100.00%)_Space_44.5_MB_(100.00%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }
        int res = 0;
        for (int i : s) {
            if (i > k) {
                res++;
            } else if (i < k) {
                return -1;
            }
        }
        return res;
    }
}
