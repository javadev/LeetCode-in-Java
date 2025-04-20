package g3501_3600.s3523_make_array_non_decreasing;

// #Medium #2025_04_20_Time_2_ms_(100.00%)_Space_73.11_MB_(39.22%)

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
