package g0201_0300.s0204_count_primes;

// #Medium #Top_Interview_Questions #Array #Math #Enumeration #Number_Theory
// #2022_03_04_Time_146_ms_(72.74%)_Space_68.8_MB_(22.63%)

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
