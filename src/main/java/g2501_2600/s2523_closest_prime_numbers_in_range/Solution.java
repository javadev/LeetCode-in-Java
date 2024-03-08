package g2501_2600.s2523_closest_prime_numbers_in_range;

// #Medium #Math #Number_Theory #2023_04_19_Time_1_ms_(100.00%)_Space_39.9_MB_(97.74%)

public class Solution {
    public int[] closestPrimes(int left, int right) {
        int diff = -1;
        int x = -1;
        int y = -1;
        int prev = -1;
        for (int i = left; i <= right; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                if (prev != -1) {
                    int d = i - prev;
                    if (diff == -1 || d < diff) {
                        diff = d;
                        x = prev;
                        y = i;
                        if (diff <= 2) {
                            return new int[] {x, y};
                        }
                    }
                }
                prev = i;
            }
        }
        return new int[] {x, y};
    }

    private boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        double sqrt = Math.sqrt(x);
        for (int i = 2; i <= sqrt; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
