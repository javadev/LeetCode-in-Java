package g3501_3600.s3574_maximize_subarray_gcd_score;

// #Hard #2025_06_08_Time_364_ms_(100.00%)_Space_44.70_MB_(100.00%)

public class Solution {
    public long maxGCDScore(int[] nums, int k) {
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            long countGCD = 0;
            long oddCount = 0;
            long ongoingGCD = 0;
            for (int j = i; j < n; j++) {
                long currentGCD = gcd(ongoingGCD, nums[j]);
                if (currentGCD != ongoingGCD) {
                    ongoingGCD = currentGCD;
                    countGCD = 1;
                } else if (nums[j] == ongoingGCD) {
                    countGCD++;
                }
                if (nums[j] % 2 != 0) {
                    oddCount++;
                }
                int len = j - i + 1;
                long res = ongoingGCD * len;
                if (ongoingGCD % 2 != 0) {
                    if (k >= oddCount) {
                        res *= 2L;
                    }
                } else if (k >= countGCD) {
                    res *= 2L;
                }
                ans = Math.max(ans, res);
            }
        }
        return ans;
    }

    private long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
