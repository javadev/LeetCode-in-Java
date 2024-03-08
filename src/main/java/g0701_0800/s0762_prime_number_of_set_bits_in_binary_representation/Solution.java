package g0701_0800.s0762_prime_number_of_set_bits_in_binary_representation;

// #Easy #Math #Bit_Manipulation #2022_03_26_Time_4_ms_(98.39%)_Space_39.1_MB_(86.38%)

public class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        boolean[] notPrime = new boolean[33];
        notPrime[0] = true;
        notPrime[1] = true;
        sieve(notPrime);
        for (int i = left; i <= right; i++) {
            int num = i;
            int setBits = 0;
            while (num > 0) {
                num = num & (num - 1);
                setBits++;
            }
            if (!notPrime[setBits]) {
                count++;
            }
        }
        return count;
    }

    private void sieve(boolean[] notPrime) {
        for (int i = 2; i <= 32; i++) {
            if (!notPrime[i]) {
                for (int j = 2 * i; j <= 32; j += i) {
                    notPrime[j] = true;
                }
            }
        }
    }
}
