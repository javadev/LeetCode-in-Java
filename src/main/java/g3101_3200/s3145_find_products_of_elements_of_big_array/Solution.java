package g3101_3200.s3145_find_products_of_elements_of_big_array;

// #Hard #Array #Binary_Search #Bit_Manipulation
// #2024_05_15_Time_3_ms_(98.41%)_Space_44.5_MB_(96.83%)

public class Solution {
    public int[] findProductsOfElements(long[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long[] q = queries[i];
            long er = sumE(q[1] + 1);
            long el = sumE(q[0]);
            ans[i] = pow(2, er - el, q[2]);
        }
        return ans;
    }

    private long sumE(long k) {
        long res = 0;
        long n = 0;
        long cnt1 = 0;
        long sumI = 0;
        for (long i = 63 - Long.numberOfLeadingZeros(k + 1); i > 0; i--) {
            long c = (cnt1 << i) + (i << (i - 1));
            if (c <= k) {
                k -= c;
                res += (sumI << i) + ((i * (i - 1) / 2) << (i - 1));
                sumI += i;
                cnt1++;
                n |= 1L << i;
            }
        }
        if (cnt1 <= k) {
            k -= cnt1;
            res += sumI;
            n++;
        }
        while (k-- > 0) {
            res += Long.numberOfTrailingZeros(n);
            n &= n - 1;
        }
        return res;
    }

    private int pow(long x, long n, long mod) {
        long res = 1 % mod;
        for (; n > 0; n /= 2) {
            if (n % 2 == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
        }
        return (int) res;
    }
}
