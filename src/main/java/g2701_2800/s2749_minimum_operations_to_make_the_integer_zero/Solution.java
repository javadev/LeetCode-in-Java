package g2701_2800.s2749_minimum_operations_to_make_the_integer_zero;

// #Medium #Bit_Manipulation #Brainteaser #2023_09_24_Time_1_ms_(91.11%)_Space_40.2_MB_(9.63%)

public class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int i = 0; i <= 60; i++) {
            long target = num1 - (long) num2 * i;
            long noOfBits = Long.bitCount(target);
            if (i >= noOfBits && i <= target) {
                return i;
            }
        }
        return -1;
    }
}
