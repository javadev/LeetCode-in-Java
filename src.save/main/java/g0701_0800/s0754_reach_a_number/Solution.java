package g0701_0800.s0754_reach_a_number;

// #Medium #Math #Binary_Search #2022_03_25_Time_0_ms_(100.00%)_Space_38.8_MB_(86.55%)

public class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int val = (((int) Math.sqrt(1.0 + 8 * ((long) target))) - 1) / 2;
        int sum = (val * (val + 1)) / 2;
        while (sum < target || (sum - target) % 2 != 0) {
            val++;
            sum = sum + val;
        }
        return val;
    }
}
