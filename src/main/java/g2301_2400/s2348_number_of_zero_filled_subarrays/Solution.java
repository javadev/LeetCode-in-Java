package g2301_2400.s2348_number_of_zero_filled_subarrays;

// #Medium #Array #Math #2022_07_30_Time_3_ms_(99.90%)_Space_59.8_MB_(95.67%)

public class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0L;
        long local = 0L;
        for (int n : nums) {
            if (n == 0) {
                cnt += ++local;
            } else {
                local = 0;
            }
        }
        return cnt;
    }
}
