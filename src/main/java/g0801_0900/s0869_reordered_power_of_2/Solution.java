package g0801_0900.s0869_reordered_power_of_2;

// #Medium #Math #Sorting #Counting #Enumeration
// #2024_12_19_Time_1_ms_(89.02%)_Space_40.9_MB_(44.51%)

import java.util.Arrays;

public class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] originalDigits = countDigits(n);
        int num = 1;
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(originalDigits, countDigits(num))) {
                return true;
            }
            num <<= 1;
        }
        return false;
    }

    private int[] countDigits(int num) {
        int[] digitCount = new int[10];
        while (num > 0) {
            digitCount[num % 10]++;
            num /= 10;
        }
        return digitCount;
    }
}
