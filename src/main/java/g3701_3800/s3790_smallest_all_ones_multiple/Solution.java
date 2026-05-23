package g3701_3800.s3790_smallest_all_ones_multiple;

// #Medium #Hash_Table #Math #Staff #Weekly_Contest_482
// #2026_05_22_Time_8_ms_(100.00%)_Space_42.48_MB_(81.03%)

public class Solution {
    public int minAllOneMultiple(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int rem = 0;
        for (int i = 1; i <= k; i++) {
            rem = (rem * 10 + 1) % k;
            if (rem == 0) {
                return i;
            }
        }
        return -1;
    }
}
