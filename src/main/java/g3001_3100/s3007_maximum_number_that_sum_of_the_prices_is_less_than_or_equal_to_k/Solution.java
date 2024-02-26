package g3001_3100.s3007_maximum_number_that_sum_of_the_prices_is_less_than_or_equal_to_k;

// #Medium #Dynamic_Programming #Binary_Search #Bit_Manipulation
// #2024_02_26_Time_1_ms_(100.00%)_Space_41_MB_(47.71%)

public class Solution {
    private long count(long k, int bit, int x) {
        if (k < bit) {
            return 0;
        }
        long n = 1;
        long bits = bit;
        long p = 1;
        while (2 * bits + (p % x == 0 ? n : 0) <= k) {
            bits = 2 * bits + (p % x == 0 ? n : 0);
            n *= 2;
            ++p;
        }
        return n + count(k - bits, bit + (p % x == 0 ? 1 : 0), x);
    }

    public long findMaximumNumber(long k, int x) {
        return count(k, 0, x) - 1;
    }
}
