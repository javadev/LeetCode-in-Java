package g3301_3400.s3348_smallest_divisible_digit_product_ii;

// #Hard #String #Math #Greedy #Backtracking #Number_Theory
// #2024_11_13_Time_21_ms_(100.00%)_Space_47_MB_(65.91%)

public class Solution {
    public String smallestNumber(String num, long t) {
        long tmp = t;
        for (int i = 9; i > 1; i--) {
            while (tmp % i == 0) {
                tmp /= i;
            }
        }
        if (tmp > 1) {
            return "-1";
        }

        char[] s = num.toCharArray();
        int n = s.length;
        long[] leftT = new long[n + 1];
        leftT[0] = t;
        int i0 = n - 1;
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') {
                i0 = i;
                break;
            }
            leftT[i + 1] = leftT[i] / gcd(leftT[i], (long) s[i] - '0');
        }
        if (leftT[n] == 1) {
            return num;
        }
        for (int i = i0; i >= 0; i--) {
            while (++s[i] <= '9') {
                long tt = leftT[i] / gcd(leftT[i], (long) s[i] - '0');
                for (int j = n - 1; j > i; j--) {
                    if (tt == 1) {
                        s[j] = '1';
                        continue;
                    }
                    for (int k = 9; k > 1; k--) {
                        if (tt % k == 0) {
                            s[j] = (char) ('0' + k);
                            tt /= k;
                            break;
                        }
                    }
                }
                if (tt == 1) {
                    return new String(s);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 9; i > 1; i--) {
            while (t % i == 0) {
                ans.append((char) ('0' + i));
                t /= i;
            }
        }
        while (ans.length() <= n) {
            ans.append('1');
        }
        return ans.reverse().toString();
    }

    private long gcd(long a, long b) {
        while (a != 0) {
            long tmp = a;
            a = b % a;
            b = tmp;
        }
        return b;
    }
}
