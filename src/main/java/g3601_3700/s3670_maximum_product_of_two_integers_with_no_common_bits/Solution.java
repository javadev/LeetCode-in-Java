package g3601_3700.s3670_maximum_product_of_two_integers_with_no_common_bits;

// #Medium #Weekly_Contest_465 #2025_09_06_Time_151_ms_(99.28%)_Space_64.23_MB_(47.58%)

public class Solution {
    public long maxProduct(int[] nums) {
        // Find highest value to limit DP size
        int maxVal = 0;
        for (int v : nums) {
            if (v > maxVal) {
                maxVal = v;
            }
        }
        // If all numbers are >=1, maxVal > 0; compute needed bit-width
        // in [1..20]
        int maxBits = 32 - Integer.numberOfLeadingZeros(maxVal);
        int size = 1 << maxBits;
        // ---- store input midway, as required ----
        // dp[mask] = largest number present whose bitmask == mask (later becomes: max over all
        // submasks)
        int[] dp = new int[size];
        for (int x : nums) {
            // numbers themselves are their masks
            if (dp[x] < x) {
                dp[x] = x;
            }
        }
        // SOS DP: for each bit b, propagate lower-half block maxima to upper-half block
        // (branch-light)
        for (int b = 0; b < maxBits; b++) {
            int half = 1 << b;
            int step = half << 1;
            for (int base = 0; base < size; base += step) {
                int upper = base + half;
                for (int m = 0; m < half; m++) {
                    int u = upper + m;
                    int l = base + m;
                    if (dp[u] < dp[l]) {
                        dp[u] = dp[l];
                    }
                }
            }
        }
        // Now dp[mask] = max value among all submasks of 'mask'
        long ans = 0;
        int full = size - 1;
        for (int x : nums) {
            // masks with no bits in common with x
            int complement = (~x) & full;
            // best partner disjoint with x
            int y = dp[complement];
            if (y > 0) {
                long prod = (long) x * y;
                if (prod > ans) {
                    ans = prod;
                }
            }
        }
        // 0 if no valid pair
        return ans;
    }
}
