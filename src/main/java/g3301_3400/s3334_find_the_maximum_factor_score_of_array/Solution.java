package g3301_3400.s3334_find_the_maximum_factor_score_of_array;

// #Medium #2024_10_27_Time_4_ms_(100.00%)_Space_43.9_MB_(100.00%)

public class Solution {
    public long maxScore(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return (long) nums[0] * nums[0];
        }
        long[][] lToR = new long[n][2];
        long[][] rToL = new long[n][2];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                lToR[i][0] = lToR[i][1] = nums[i];
                rToL[n - i - 1][0] = rToL[n - i - 1][1] = nums[n - i - 1];
            } else {
                rToL[n - i - 1][0] = gcd(nums[n - i - 1], rToL[n - i][0]);
                lToR[i][0] = gcd(nums[i], lToR[i - 1][0]);

                rToL[n - i - 1][1] = lcm(nums[n - i - 1], rToL[n - i][1]);
                lToR[i][1] = lcm(nums[i], lToR[i - 1][1]);
            }
        }
        long max = 0;
        for (int i = 0; i < n; i++) {
            long gcd = i == 0 ? rToL[i + 1][0] : getLong(i, n, lToR, rToL);
            max = Math.max(max, gcd * (i == 0 ? rToL[i + 1][1] : getaLong(i, n, lToR, rToL)));
        }
        return Math.max(max, rToL[0][0] * rToL[0][1]);
    }

    private long getaLong(int i, int n, long[][] lToR, long[][] rToL) {
        return i == n - 1 ? lToR[i - 1][1] : lcm(rToL[i + 1][1], lToR[i - 1][1]);
    }

    private long getLong(int i, int n, long[][] lToR, long[][] rToL) {
        return i == n - 1 ? lToR[i - 1][0] : gcd(rToL[i + 1][0], lToR[i - 1][0]);
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
