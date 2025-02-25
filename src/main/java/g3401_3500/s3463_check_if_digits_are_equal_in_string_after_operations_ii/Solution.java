package g3401_3500.s3463_check_if_digits_are_equal_in_string_after_operations_ii;

// #Hard #String #Math #Number_Theory #Combinatorics
// #2025_02_25_Time_43_ms_(99.64%)_Space_49.40_MB_(10.02%)

public class Solution {
    private int powMod10(int a, int n) {
        int x = 1;
        while (n >= 1) {
            if (n % 2 == 1) {
                x = (x * a) % 10;
            }
            a = (a * a) % 10;
            n /= 2;
        }
        return x;
    }

    private int[] f(int n) {
        int[] ns = new int[n + 1];
        int[] n2 = new int[n + 1];
        int[] n5 = new int[n + 1];
        ns[0] = 1;
        for (int i = 1; i <= n; ++i) {
            int m = i;
            n2[i] = n2[i - 1];
            n5[i] = n5[i - 1];
            while (m % 2 == 0) {
                m /= 2;
                n2[i]++;
            }
            while (m % 5 == 0) {
                m /= 5;
                n5[i]++;
            }
            ns[i] = (ns[i - 1] * m) % 10;
        }
        int[] inv = new int[10];
        for (int i = 1; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (i * j % 10 == 1) {
                    inv[i] = j;
                }
            }
        }
        int[] xs = new int[n + 1];
        for (int k = 0; k <= n; ++k) {
            int a = 0;
            int s2 = n2[n] - n2[n - k] - n2[k];
            int s5 = n5[n] - n5[n - k] - n5[k];
            if (s2 == 0 || s5 == 0) {
                a = (ns[n] * inv[ns[n - k]] * inv[ns[k]] * powMod10(2, s2) * powMod10(5, s5)) % 10;
            }
            xs[k] = a;
        }
        return xs;
    }

    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] xs = f(n - 2);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - '0';
        }
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < n - 1; i++) {
            num1 = (num1 + xs[i] * arr[i]) % 10;
            num2 = (num2 + xs[i] * arr[i + 1]) % 10;
        }
        return num1 == num2;
    }
}
