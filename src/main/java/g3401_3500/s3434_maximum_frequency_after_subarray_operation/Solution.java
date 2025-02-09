package g3401_3500.s3434_maximum_frequency_after_subarray_operation;

// #Medium #Array #Hash_Table #Dynamic_Programming #Greedy #Prefix_Sum
// #2025_01_27_Time_47_ms_(100.00%)_Space_56.03_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxFrequency(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : nums) {
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
        int res = 0;
        for (int b : count.keySet()) {
            res = Math.max(res, kadane(nums, k, b));
        }
        return count.getOrDefault(k, 0) + res;
    }

    private int kadane(int[] nums, int k, int b) {
        int res = 0;
        int cur = 0;
        for (int a : nums) {
            if (a == k) {
                cur--;
            }
            if (a == b) {
                cur++;
            }
            if (cur < 0) {
                cur = 0;
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
