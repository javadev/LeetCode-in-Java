package g0201_0300.s0204_count_primes;

public class Solution {
    public int countPrimes(int n) {
        boolean[] isprime = new boolean[n];
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (!isprime[i]) {
                for (int j = i * 2; j < n; j += i) {
                    isprime[j] = true;
                }
            }
        }
        for (int i = 2; i < isprime.length; i++) {
            if (!isprime[i]) {
                count++;
            }
        }
        return count;
    }
}
