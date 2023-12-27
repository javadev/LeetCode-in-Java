package g2901_3000.s2911_minimum_changes_to_make_k_semi_palindromes;

// #Hard #String #Dynamic_Programming #Two_Pointers
// #2023_12_27_Time_15_ms_(98.23%)_Space_45.2_MB_(45.13%)

public class Solution {
    private static final int INF = 200;
    private final Divisor[] divisors = getDivisors();
    private char[] cs;
    private int[][] cost;
    private int[][] dp;

    public int minimumChanges(String s, int k) {
        cs = s.toCharArray();
        int n = cs.length;
        cost = new int[n - 1][n + 1];
        dp = new int[n + 1][k + 1];
        return calc(n, k) - k;
    }

    private int calc(int i, int k) {
        if (k == 1) {
            return change(0, i);
        }
        if (dp[i][k] > 0) {
            return dp[i][k];
        }
        int min = INF;
        for (int j = (k - 1) * 2; j < i - 1; ++j) {
            min = Math.min(min, calc(j, k - 1) + change(j, i));
        }
        dp[i][k] = min;
        return min;
    }

    private int change(int start, int end) {
        if (cost[start][end] > 0) {
            return cost[start][end];
        }
        int min = INF;
        for (Divisor divisor = divisors[end - start]; divisor != null; divisor = divisor.next) {
            int d = divisor.value;
            int count = 0;
            for (int i = 0; i < d; ++i) {
                int left = start + i;
                int right = end - d + i;
                while (left + d <= right) {
                    if (cs[left] != cs[right]) {
                        count++;
                    }
                    left += d;
                    right -= d;
                }
            }
            if (count < min) {
                min = count;
            }
        }
        cost[start][end] = min + 1;
        return min + 1;
    }

    private Divisor[] getDivisors() {
        Divisor[] list = new Divisor[200 + 1];
        for (int d = 1; d < 200; ++d) {
            for (int len = d + d; len < 200 + 1; len += d) {
                list[len] = new Divisor(d, list[len]);
            }
        }
        return list;
    }

    private static class Divisor {
        int value;
        Divisor next;

        Divisor(int divisor, Divisor next) {
            this.value = divisor;
            this.next = next;
        }
    }
}
