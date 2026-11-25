package g4001_4100.s4032_longest_subarray_with_at_most_k_distinct_prime_factors;

// #Medium #Array #Hash_Table #Math #Sliding_Window #Number_Theory #Staff #Weekly_Contest_516
// #2026_11_25_Time_40_ms_(100.00%)_Space_84.33_MB_(76.79%)

import java.util.Arrays;

public class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxVal = 0;
        for (int x : nums) {
            if (x > maxVal) {
                maxVal = x;
            }
        }
        // 1. Sieve of Eratosthenes to compute Smallest Prime Factor (SPF)
        int[] spf = new int[maxVal + 1];
        for (int i = 2; i <= maxVal; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i <= maxVal; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= maxVal; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        // 2. Precompute distinct prime factors for each unique element present in nums
        int[][] primeFactors = new int[maxVal + 1][];
        for (int x : nums) {
            if (primeFactors[x] == null) {
                primeFactors[x] = getDistinctPrimeFactors(x, spf);
            }
        }
        // 3. Sliding Window (Two Pointers)
        int[] primeCount = new int[maxVal + 1];
        int distinctPrimes = 0;
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            // Add all prime factors of nums[right] to the window
            for (int prime : primeFactors[nums[right]]) {
                if (primeCount[prime] == 0) {
                    distinctPrimes++;
                }
                primeCount[prime]++;
            }
            // Shrink the window from the left if distinct prime factor count exceeds k
            while (distinctPrimes > k) {
                for (int prime : primeFactors[nums[left]]) {
                    primeCount[prime]--;
                    if (primeCount[prime] == 0) {
                        distinctPrimes--;
                    }
                }
                left++;
            }
            // If the valid window has length >= 1, update maxLen
            if (left <= right) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }

    private int[] getDistinctPrimeFactors(int n, int[] spf) {
        int[] temp = new int[7];
        int size = 0;
        while (n > 1) {
            int p = spf[n];
            temp[size++] = p;
            while (n % p == 0) {
                n /= p;
            }
        }
        return Arrays.copyOf(temp, size);
    }
}
