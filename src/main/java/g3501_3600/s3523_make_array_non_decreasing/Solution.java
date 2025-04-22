package g3501_3600.s3523_make_array_non_decreasing;

// #Medium #Array #Greedy #Stack #Monotonic_Stack
// #2025_04_22_Time_3_ms_(63.29%)_Space_73.02_MB_(45.43%)

public class Solution {
    public int maximumPossibleSize(int[] nums) {
        int res = 0;
        int prev = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x >= prev) {
                res++;
                prev = x;
            }
        }
        return res;
    }
}
