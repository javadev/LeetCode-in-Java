package g1601_1700.s1680_concatenation_of_consecutive_binary_numbers;

// #Medium #Math #Bit_Manipulation #Simulation
// #2022_04_15_Time_70_ms_(95.05%)_Space_39.2_MB_(98.02%)

public class Solution {
    private static final long MOD = 1000_000_007;

    public int concatenatedBinary(int n) {
        // calculate the length of binary string
        int length = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & i - 1) == 0) {
                length++;
            }
            sum <<= length;
            sum += i;
            if (sum > MOD) {
                sum %= MOD;
            }
        }
        return (int) (sum % MOD);
    }
}
