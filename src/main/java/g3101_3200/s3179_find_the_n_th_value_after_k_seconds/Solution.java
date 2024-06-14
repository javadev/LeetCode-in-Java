package g3101_3200.s3179_find_the_n_th_value_after_k_seconds;

// #Medium #Array #Math #Simulation #Prefix_Sum #Combinatorics
// #2024_06_14_Time_2_ms_(99.86%)_Space_40.9_MB_(85.18%)

public class Solution {
    private final int mod = (int) (Math.pow(10, 9) + 7);

    public int valueAfterKSeconds(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return combination(k + n - 1, k);
    }

    private int combination(int a, int b) {
        long numerator = 1;
        long denominator = 1;
        for (int i = 0; i < b; i++) {
            numerator = (numerator * (a - i)) % mod;
            denominator = (denominator * (i + 1)) % mod;
        }
        // Calculate the modular inverse of denominator
        long denominatorInverse = power(denominator, mod - 2);
        return (int) ((numerator * denominatorInverse) % mod);
    }

    // Function to calculate power
    private long power(long x, int y) {
        long result = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % mod;
            }
            y = y >> 1;
            x = (x * x) % mod;
        }
        return result;
    }
}
