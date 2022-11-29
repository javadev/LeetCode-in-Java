package g2301_2400.s2317_maximum_xor_after_operations;

// #Medium #Array #Math #Bit_Manipulation #2022_06_26_Time_1_ms_(100.00%)_Space_53.3_MB_(100.00%)

public class Solution {
    public int maximumXOR(int[] nums) {
        int max = 0;
        for (int n : nums) {
            max |= n;
        }
        return max;
    }
}
