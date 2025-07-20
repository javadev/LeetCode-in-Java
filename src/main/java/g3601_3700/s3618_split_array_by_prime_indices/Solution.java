package g3601_3700.s3618_split_array_by_prime_indices;

// #Medium #2025_07_20_Time_3_ms_(100.00%)_Space_62.52_MB_(100.00%)

public class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        boolean[] isPrime = sieve(n);
        long sumA = 0;
        long sumB = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                sumA += nums[i];
            } else {
                sumB += nums[i];
            }
        }
        return Math.abs(sumA - sumB);
    }

    // Sieve of Eratosthenes to find all prime indices up to n
    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n];
        if (n > 2) {
            isPrime[2] = true;
        }
        for (int i = 3; i < n; i += 2) {
            isPrime[i] = true;
        }
        if (n > 2) {
            isPrime[2] = true;
        }
        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i * 2) {
                    isPrime[j] = false;
                }
            }
        }
        isPrime[0] = false;
        if (n > 1) {
            isPrime[1] = false;
        }
        return isPrime;
    }
}
