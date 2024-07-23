package g3201_3300.s3229_minimum_operations_to_make_array_equal_to_target;

// #Hard #Array #Dynamic_Programming #Greedy #Stack #Monotonic_Stack
// #2024_07_23_Time_2_ms_(100.00%)_Space_58.3_MB_(71.80%)

public class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        int n = nums.length;
        long incr = 0;
        long decr = 0;
        long ops = 0;
        for (int i = 0; i < n; i++) {
            int diff = target[i] - nums[i];
            if (diff > 0) {
                if (incr < diff) {
                    ops += diff - incr;
                }
                incr = diff;
                decr = 0;
            } else if (diff < 0) {
                if (decr < -diff) {
                    ops += -diff - decr;
                }
                decr = -diff;
                incr = 0;
            } else {
                incr = decr = 0;
            }
        }
        return ops;
    }
}
