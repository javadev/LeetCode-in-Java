package g3401_3500.s3445_maximum_difference_between_even_and_odd_frequency_ii;

// #Hard #2025_02_02_Time_97_(100.00%)_Space_52.67_(100.00%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {
    public int maxDifference(String s, int k) {
        int n = s.length();
        int[][] pre = new int[5][n];
        int[][] closestRight = new int[5][n];
        for (int x = 0; x < 5; x++) {
            Arrays.fill(closestRight[x], n);
            for (int i = 0; i < n; i++) {
                int num = s.charAt(i) - '0';
                pre[x][i] = (num == x) ? 1 : 0;
                if (i > 0) {
                    pre[x][i] += pre[x][i - 1];
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                int num = s.charAt(i) - '0';
                if (i < n - 1) {
                    closestRight[x][i] = closestRight[x][i + 1];
                }
                if (num == x) {
                    closestRight[x][i] = i;
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int a = 0; a <= 4; a++) {
            for (int b = 0; b <= 4; b++) {
                if (a != b) {
                    ans = Math.max(ans, go(k, a, b, pre, closestRight, n));
                }
            }
        }
        return ans;
    }

    private int go(int k, int odd, int even, int[][] pre, int[][] closestRight, int n) {
        int[][][] suf = new int[2][2][n];
        for (int[][] arr2D : suf) {
            for (int[] arr : arr2D) {
                Arrays.fill(arr, Integer.MIN_VALUE);
            }
        }
        for (int endIdx = 0; endIdx < n; endIdx++) {
            int oddParity = pre[odd][endIdx] % 2;
            int evenParity = pre[even][endIdx] % 2;
            if (pre[odd][endIdx] > 0 && pre[even][endIdx] > 0) {
                suf[oddParity][evenParity][endIdx] = pre[odd][endIdx] - pre[even][endIdx];
            }
        }
        for (int oddParity = 0; oddParity < 2; oddParity++) {
            for (int evenParity = 0; evenParity < 2; evenParity++) {
                for (int endIdx = n - 2; endIdx >= 0; endIdx--) {
                    suf[oddParity][evenParity][endIdx] =
                            Math.max(
                                    suf[oddParity][evenParity][endIdx],
                                    suf[oddParity][evenParity][endIdx + 1]);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int startIdx = 0; startIdx < n; startIdx++) {
            int minEndIdx = startIdx + k - 1;
            if (minEndIdx >= n) {
                break;
            }
            int oddBelowI = (startIdx == 0 ? 0 : pre[odd][startIdx - 1]);
            int evenBelowI = (startIdx == 0 ? 0 : pre[even][startIdx - 1]);
            int goodOddParity = (oddBelowI + 1) % 2;
            int goodEvenParity = evenBelowI % 2;
            int query =
                    Math.max(
                            Math.max(startIdx + k - 1, closestRight[odd][startIdx]),
                            closestRight[even][startIdx]);
            if (query >= n) {
                continue;
            }
            int val = suf[goodOddParity][goodEvenParity][query];
            if (val == Integer.MIN_VALUE) {
                continue;
            }
            ans = Math.max(ans, val - oddBelowI + evenBelowI);
        }
        return ans;
    }
}
