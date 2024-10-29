package g3301_3400.s3337_total_characters_in_string_after_transformations_ii;

// #Hard #String #Hash_Table #Dynamic_Programming #Math #Counting
// #2024_10_29_Time_67_ms_(99.31%)_Space_45.4_MB_(45.83%)

import java.util.List;

public class Solution {
    public static final int MOD = 1000000007;
    public static final long M2 = (long) MOD * MOD;
    public static final long BIG = 8L * M2;

    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        int[][] m = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j <= nums.get(i); j++) {
                m[(i + j) % 26][i]++;
            }
        }
        int[] v = new int[26];
        for (char c : s.toCharArray()) {
            v[c - 'a']++;
        }
        v = pow(m, v, t);
        long ans = 0;
        for (int x : v) {
            ans += x;
        }
        return (int) (ans % MOD);
    }

    // A^e*v
    private int[] pow(int[][] a, int[] v, long e) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= MOD) {
                v[i] %= MOD;
            }
        }
        int[][] mul = a;
        for (; e > 0; e >>>= 1) {
            if ((e & 1) == 1) {
                v = mul(mul, v);
            }
            mul = p2(mul);
        }
        return v;
    }

    // int matrix*int vector
    private int[] mul(int[][] a, int[] v) {
        int m = a.length;
        int n = v.length;
        int[] w = new int[m];
        for (int i = 0; i < m; i++) {
            long sum = 0;
            for (int k = 0; k < n; k++) {
                sum += (long) a[i][k] * v[k];
                if (sum >= BIG) {
                    sum -= BIG;
                }
            }
            w[i] = (int) (sum % MOD);
        }
        return w;
    }

    // int matrix^2 (be careful about negative value)
    private int[][] p2(int[][] a) {
        int n = a.length;
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            long[] sum = new long[n];
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    sum[j] += (long) a[i][k] * a[k][j];
                    if (sum[j] >= BIG) {
                        sum[j] -= BIG;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                c[i][j] = (int) (sum[j] % MOD);
            }
        }
        return c;
    }
}
