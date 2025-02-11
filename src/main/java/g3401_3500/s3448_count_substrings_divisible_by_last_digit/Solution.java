package g3401_3500.s3448_count_substrings_divisible_by_last_digit;

// #Hard #String #Dynamic_Programming #2025_02_11_Time_23_ms_(83.08%)_Space_46.71_MB_(58.21%)

@SuppressWarnings("java:S107")
public class Solution {
    public long countSubstrings(String s) {
        int n = s.length();
        int[] p3 = new int[n];
        int[] p7 = new int[n];
        int[] p9 = new int[n];
        computeModArrays(s, p3, p7, p9);
        long[] freq3 = new long[3];
        long[] freq9 = new long[9];
        long[][] freq7 = new long[6][7];
        int[] inv7 = {1, 5, 4, 6, 2, 3};
        return countValidSubstrings(s, p3, p7, p9, freq3, freq9, freq7, inv7);
    }

    private void computeModArrays(String s, int[] p3, int[] p7, int[] p9) {
        p3[0] = (s.charAt(0) - '0') % 3;
        p7[0] = (s.charAt(0) - '0') % 7;
        p9[0] = (s.charAt(0) - '0') % 9;
        for (int i = 1; i < s.length(); i++) {
            int dig = s.charAt(i) - '0';
            p3[i] = (p3[i - 1] * 10 + dig) % 3;
            p7[i] = (p7[i - 1] * 10 + dig) % 7;
            p9[i] = (p9[i - 1] * 10 + dig) % 9;
        }
    }

    private long countValidSubstrings(
            String s,
            int[] p3,
            int[] p7,
            int[] p9,
            long[] freq3,
            long[] freq9,
            long[][] freq7,
            int[] inv7) {
        long ans = 0;
        for (int j = 0; j < s.length(); j++) {
            int d = s.charAt(j) - '0';
            if (d != 0) {
                ans += countDivisibilityCases(s, j, d, p3, p7, p9, freq3, freq9, freq7, inv7);
            }
            freq3[p3[j]]++;
            freq7[j % 6][p7[j]]++;
            freq9[p9[j]]++;
        }
        return ans;
    }

    private long countDivisibilityCases(
            String s,
            int j,
            int d,
            int[] p3,
            int[] p7,
            int[] p9,
            long[] freq3,
            long[] freq9,
            long[][] freq7,
            int[] inv7) {
        long ans = 0;
        if (d == 1 || d == 2 || d == 5) {
            ans += (j + 1);
        } else if (d == 4) {
            ans += countDivisibilityBy4(s, j);
        } else if (d == 8) {
            ans += countDivisibilityBy8(s, j);
        } else if (d == 3 || d == 6) {
            ans += (p3[j] == 0 ? 1L : 0L) + freq3[p3[j]];
        } else if (d == 7) {
            ans += countDivisibilityBy7(j, p7, freq7, inv7);
        } else if (d == 9) {
            ans += (p9[j] == 0 ? 1L : 0L) + freq9[p9[j]];
        }
        return ans;
    }

    private long countDivisibilityBy4(String s, int j) {
        if (j == 0) {
            return 1;
        }
        int num = (s.charAt(j - 1) - '0') * 10 + (s.charAt(j) - '0');
        return num % 4 == 0 ? j + 1 : 1;
    }

    private long countDivisibilityBy8(String s, int j) {
        if (j == 0) {
            return 1;
        }
        if (j == 1) {
            int num = (s.charAt(0) - '0') * 10 + 8;
            return (num % 8 == 0 ? 2 : 1);
        }
        int num3 = (s.charAt(j - 2) - '0') * 100 + (s.charAt(j - 1) - '0') * 10 + 8;
        int num2 = (s.charAt(j - 1) - '0') * 10 + 8;
        return (num3 % 8 == 0 ? j - 1 : 0) + (num2 % 8 == 0 ? 1 : 0) + 1L;
    }

    private long countDivisibilityBy7(int j, int[] p7, long[][] freq7, int[] inv7) {
        long ans = (p7[j] == 0 ? 1L : 0L);
        for (int m = 0; m < 6; m++) {
            int idx = ((j % 6) - m + 6) % 6;
            int req = (p7[j] * inv7[m]) % 7;
            ans += freq7[idx][req];
        }
        return ans;
    }
}
