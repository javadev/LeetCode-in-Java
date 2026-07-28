package g3801_3900.s3855_sum_of_k_digit_numbers_in_a_range;

// #Hard #Math #Divide_and_Conquer #Number_Theory #Combinatorics #Senior_Staff #Biweekly_Contest_177
// #2026_07_27_Time_2_ms_(90.59%)_Space_43.08_MB_(36.47%)

public class Solution {
    private static final int MOD = 1000000007;

    public int sumOfNumbers(int l, int r, int k) {
        long count = r - (long) l + 1;
        long sumRange = (l + r) * count / 2;

        long t1 = sumRange % MOD;
        long t2 = power(count, (long) k - 1);

        long repunit = (power(10, k) - 1 + MOD) % MOD;
        long inv9 = power(9, (long) MOD - 2);
        long t3 = (repunit * inv9) % MOD;

        long ans = (t1 * t2) % MOD;
        ans = (ans * t3) % MOD;

        return (int) ans;
    }

    private long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }
}
