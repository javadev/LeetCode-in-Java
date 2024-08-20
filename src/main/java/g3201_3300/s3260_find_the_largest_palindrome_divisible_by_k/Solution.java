package g3201_3300.s3260_find_the_largest_palindrome_divisible_by_k;

// #Hard #String #Dynamic_Programming #Math #Greedy #Number_Theory
// #2024_08_20_Time_4_ms_(97.21%)_Space_45.1_MB_(73.49%)

import java.util.Arrays;

public class Solution {
    public String largestPalindrome(int n, int k) {
        char[] sc = new char[n];
        if (k == 1 || k == 3 || k == 9) {
            Arrays.fill(sc, '9');
        } else if (k == 7) {
            if (n == 1) {
                return "7";
            } else if (n == 2) {
                return "77";
            }
            int mod = n % 12;
            checkValues(n, mod, sc);
        } else if (k == 2) {
            Arrays.fill(sc, '9');
            sc[0] = '8';
            sc[n - 1] = '8';
        } else if (k == 4) {
            Arrays.fill(sc, '8');
            int i = 2;
            int j = n - 3;
            while (i <= j) {
                sc[i] = '9';
                sc[j] = '9';
                ++i;
                --j;
            }
        } else if (k == 5) {
            Arrays.fill(sc, '9');
            sc[0] = '5';
            sc[n - 1] = '5';
        } else if (k == 6) {
            String number = getString(n, sc);
            if (number != null) return number;
        } else if (k == 8) {
            Arrays.fill(sc, '8');
            int i = 3;
            int j = n - 4;
            while (i <= j) {
                sc[i] = '9';
                sc[j] = '9';
                ++i;
                --j;
            }
        }
        return new String(sc);
    }

    private void checkValues(int n, int mod, char[] sc) {
        if (mod == 6 || mod == 0) {
            Arrays.fill(sc, '9');
        } else if (mod == 3) {
            Arrays.fill(sc, '9');
            sc[n / 2] = '5';
        } else if (mod == 4 || mod == 5 || mod == 1 || mod == 2) {
            Arrays.fill(sc, '7');
            int i = 0;
            int j = n - 1;
            while (i + 1 < j) {
                sc[i] = '9';
                sc[j] = '9';
                ++i;
                --j;
            }
        } else if (mod == 7 || mod == 8 || mod == 10 || mod == 11) {
            Arrays.fill(sc, '4');
            int i = 0;
            int j = n - 1;
            while (i + 1 < j) {
                sc[i] = '9';
                sc[j] = '9';
                ++i;
                --j;
            }
        } else if (mod == 9) {
            Arrays.fill(sc, '9');
            sc[n / 2] = '6';
        }
    }

    private String getString(int n, char[] sc) {
        if (n == 1) {
            return "6";
        } else if (n == 2) {
            return "66";
        } else {
            if (n % 2 == 1) {
                Arrays.fill(sc, '9');
                sc[0] = '8';
                sc[n - 1] = '8';
                sc[n / 2] = '8';
            } else {
                Arrays.fill(sc, '9');
                sc[0] = '8';
                sc[n - 1] = '8';
                sc[n / 2] = '7';
                sc[n / 2 - 1] = '7';
            }
        }
        return null;
    }
}
