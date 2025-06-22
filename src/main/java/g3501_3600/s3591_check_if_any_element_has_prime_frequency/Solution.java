package g3501_3600.s3591_check_if_any_element_has_prime_frequency;

// #Easy #2025_06_22_Time_1_ms_(98.70%)_Space_42.32_MB_(99.67%)

public class Solution {
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return false;
        }
        int maxi = Integer.MIN_VALUE;
        for (int val : nums) {
            maxi = Math.max(val, maxi);
        }
        int[] hash = new int[maxi + 1];
        for (int num : nums) {
            hash[num]++;
        }
        for (int j : hash) {
            if (isPrime(j)) {
                return true;
            }
        }
        return false;
    }
}
