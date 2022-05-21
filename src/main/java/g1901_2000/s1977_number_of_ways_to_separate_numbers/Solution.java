package g1901_2000.s1977_number_of_ways_to_separate_numbers;

// #Hard #String #Dynamic_Programming #Suffix_Array
// #2022_05_21_Time_150_ms_(94.52%)_Space_101.1_MB_(90.41%)

import java.util.Arrays;

public class Solution {
    private static final int P = 1_000_000_007;

    public int numberOfCombinations(String num) {
        int n = num.length();
        if (num.charAt(0) == '0') {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = num.charAt(i) - '0' + 1;
        }

        int[] suffixArray = new SuffixArrayTools().buildSuffixArray(arr, 10);
        int[] invSuffixArray = new SuffixArrayTools().inverseSuffixArray(suffixArray);
        int[] lcp =
                SuffixArrayTools.buildLongestCommonPrefixArray(arr, suffixArray, invSuffixArray);
        int[][] lcpMat = new int[n - 1][n - 1];
        for (int i = 0; i < n - 1; i++) {
            lcpMat[i][i] = lcp[i];
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                lcpMat[i][j] = Math.min(lcpMat[i][j - 1], lcpMat[j][j]);
            }
        }

        long[] prev = new long[n + 1];
        long[] next = new long[n + 1];
        long[] tmp;
        prev[0] = 1;
        next[0] = 1;

        for (int d = 1; d <= n; d++) {
            System.arraycopy(prev, 1, next, 1, n);
            for (int j1 = 0, i1 = j1 - d, j2 = j1 + d; j2 <= n; j1++, j2++, i1++) {
                if (arr[j1] != 1) {
                    if (i1 < 0 || arr[i1] != 1 && ok(i1, j1, d, invSuffixArray, lcpMat))
                        next[j2] += next[j1];
                    else next[j2] += prev[j1];
                    if (next[j2] >= P) next[j2] -= P;
                }
            }
            tmp = prev;
            prev = next;
            next = tmp;
        }
        return (int) prev[n];
    }

    private boolean ok(int start1, int start2, int len, int[] inv, int[][] lcpMat) {
        return inv[start1] < inv[start2] || lcpMat[inv[start2]][inv[start1] - 1] >= len;
    }

    static class SuffixArrayTools {
        int[] buildSuffixArray(int[] arr, int K) {
            int n = arr.length;
            int[] s = Arrays.copyOf(arr, n + 3);
            int[] SA = new int[n];
            suffixArray(s, SA, n, K);
            return SA;
        }

        private int[] inverseSuffixArray(int[] suffixArray) {
            int n = suffixArray.length;
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) ans[suffixArray[i]] = i;
            return ans;
        }

        static int[] buildLongestCommonPrefixArray(
                int[] arr, int[] suffixArray, int[] invSuffixArray) {
            int n = arr.length;
            int[] lcp = new int[n - 1];
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (k > 0) k--;
                if (invSuffixArray[i] == n - 1) {
                    k = 0;
                } else {
                    int j = suffixArray[invSuffixArray[i] + 1];
                    while (i + k < n && j + k < n && arr[i + k] == arr[j + k]) k++;
                    lcp[invSuffixArray[i]] = k;
                }
            }
            return lcp;
        }

        private boolean leq(int a1, int a2, int b1, int b2) {
            return (a1 < b1 || (a1 == b1 && a2 <= b2));
        }

        private boolean leq(int a1, int a2, int a3, int b1, int b2, int b3) {
            return (a1 < b1 || (a1 == b1 && leq(a2, a3, b2, b3)));
        }

        private void suffixArray(int[] s, int[] sa, int n, int k) {
            int n0 = (n + 2) / 3, n1 = (n + 1) / 3, n2 = n / 3, n02 = n0 + n2;
            int[] s12 = new int[n02 + 3];
            int[] sa12 = new int[n02 + 3];
            int[] s0 = new int[n0];
            int[] sa0 = new int[n0];

            for (int i = 0, j = 0; i < n + (n0 - n1); i++) if (i % 3 != 0) s12[j++] = i;

            radixPass(s12, sa12, s, 2, n02, k);
            radixPass(sa12, s12, s, 1, n02, k);
            radixPass(s12, sa12, s, 0, n02, k);

            int name = 0, c0 = -1, c1 = -1, c2 = -1;
            for (int i = 0; i < n02; i++) {
                if (s[sa12[i]] != c0 || s[sa12[i] + 1] != c1 || s[sa12[i] + 2] != c2) {
                    name++;
                    c0 = s[sa12[i]];
                    c1 = s[sa12[i] + 1];
                    c2 = s[sa12[i] + 2];
                }
                if (sa12[i] % 3 == 1) {
                    s12[sa12[i] / 3] = name;
                } else {
                    s12[sa12[i] / 3 + n0] = name;
                }
            }

            if (name < n02) {
                suffixArray(s12, sa12, n02, name);
                for (int i = 0; i < n02; i++) s12[sa12[i]] = i + 1;
            } else for (int i = 0; i < n02; i++) sa12[s12[i] - 1] = i;

            for (int i = 0, j = 0; i < n02; i++) {
                if (sa12[i] < n0) {
                    s0[j++] = 3 * sa12[i];
                }
            }
            radixPass(s0, sa0, s, 0, n0, k);

            for (int p = 0, t = n0 - n1, i1 = 0; i1 < n; i1++) {
                int i = getI(sa12, n0, t);
                int j = sa0[p];
                if (sa12[t] < n0
                        ? leq(s[i], s12[sa12[t] + n0], s[j], s12[j / 3])
                        : leq(
                                s[i],
                                s[i + 1],
                                s12[sa12[t] - n0 + 1],
                                s[j],
                                s[j + 1],
                                s12[j / 3 + n0])) {
                    sa[i1] = i;
                    t++;
                    if (t == n02)
                        for (i1++; p < n0; p++, i1++) {
                            sa[i1] = sa0[p];
                        }
                } else {
                    sa[i1] = j;
                    p++;
                    if (p == n0) {
                        for (i1++; t < n02; t++, i1++) {
                            sa[i1] = getI(sa12, n0, t);
                        }
                    }
                }
            }
        }

        private int getI(int[] SA12, int n0, int t) {
            return SA12[t] < n0 ? SA12[t] * 3 + 1 : (SA12[t] - n0) * 3 + 2;
        }

        private void radixPass(int[] a, int[] b, int[] r, int shift, int n, int K) {
            int[] c = new int[K + 1];
            for (int i = 0; i < n; i++) {
                c[r[a[i] + shift]]++;
            }
            for (int i = 0, sum = 0; i <= K; i++) {
                int t = c[i];
                c[i] = sum;
                sum += t;
            }
            for (int i = 0; i < n; i++) {
                b[c[r[a[i] + shift]]++] = a[i];
            }
        }
    }
}
