package g3801_3900.s3848_check_digitorial_permutation;

// #Medium #Math #Counting #Senior #Weekly_Contest_490
// #2026_07_22_Time_2_ms_(84.89%)_Space_42.70_MB_(97.48%)

import java.util.Arrays;

public class Solution {
    static int[] digitFrequencies(int x) {
        int[] c = new int[10];
        do {
            c[x % 10]++;
            x /= 10;
        } while (x != 0);
        return c;
    }

    public boolean isDigitorialPermutation(int n) {
        int[] factorials = new int[10];
        factorials[0] = 1;
        for (int d = 1; d < 10; ++d) {
            factorials[d] = factorials[d - 1] * d;
        }
        int digitsSum = 0;
        int x = n;
        do {
            digitsSum += factorials[x % 10];
            x /= 10;
        } while (x != 0);
        return Arrays.equals(digitFrequencies(digitsSum), digitFrequencies(n));
    }
}
