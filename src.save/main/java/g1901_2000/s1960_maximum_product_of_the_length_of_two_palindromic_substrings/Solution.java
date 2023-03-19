package g1901_2000.s1960_maximum_product_of_the_length_of_two_palindromic_substrings;

// #Hard #String #Hash_Function #Rolling_Hash #2022_05_20_Time_32_ms_(75.00%)_Space_44.7_MB_(91.67%)

public class Solution {
    public long maxProduct(String s) {
        int n = s.length();
        if (n == 2) {
            return 1;
        }
        int[] len = manaCherS(s);
        long[] left = new long[n];
        int max = 1;
        left[0] = max;
        for (int i = 1; i <= n - 1; i++) {
            if (len[(i - max - 1 + i) / 2] > max) {
                max += 2;
            }
            left[i] = max;
        }
        max = 1;
        long[] right = new long[n];
        right[n - 1] = max;
        for (int i = n - 2; i >= 0; i--) {
            if (len[(i + max + 1 + i) / 2] > max) {
                max += 2;
            }
            right[i] = max;
        }
        long res = 1;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, left[i - 1] * right[i]);
        }
        return res;
    }

    private int[] manaCherS(String s) {
        int len = s.length();
        int[] p = new int[len];
        int c = 0;
        int r = 0;
        for (int i = 0; i < len; i++) {
            int mirror = (2 * c) - i;
            if (i < r) {
                p[i] = Math.min(r - i, p[mirror]);
            }
            int a = i + (1 + p[i]);
            int b = i - (1 + p[i]);
            while (a < len && b >= 0 && s.charAt(a) == s.charAt(b)) {
                p[i]++;
                a++;
                b--;
            }
            if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }
        }
        for (int i = 0; i < len; i++) {
            p[i] = 1 + 2 * p[i];
        }
        return p;
    }
}
