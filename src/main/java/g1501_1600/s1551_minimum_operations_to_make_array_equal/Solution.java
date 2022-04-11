package g1501_1600.s1551_minimum_operations_to_make_array_equal;

// #Medium #Math #2022_04_11_Time_7_ms_(12.93%)_Space_40.9_MB_(68.22%)

public class Solution {
    public int minOperations(int n) {
        int min = 1;
        int max = 2 * (n - 1) + 1;
        int equalNumber = (max + min) / 2;
        int ops = 0;
        for (int i = 0; i < n / 2; i++) {
            ops += equalNumber - (2 * i + 1);
        }
        return ops;
    }
}
