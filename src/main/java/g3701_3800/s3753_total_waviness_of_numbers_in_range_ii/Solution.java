package g3701_3800.s3753_total_waviness_of_numbers_in_range_ii;

// #Hard #Dynamic_Programming #Math #Senior_Staff #Biweekly_Contest_170
// #2026_04_26_Time_52_ms_(96.83%)_Space_46.46_MB_(98.41%)

public class Solution {
    private static class Pair {
        long count;
        long sum;

        Pair(long count, long sum) {
            this.count = count;
            this.sum = sum;
        }
    }

    private char[] digits;
    private Pair[][][][][] memo;
    private boolean[][][][][] seen;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x) {
        if (x <= 0) {
            return 0;
        }
        digits = Long.toString(x).toCharArray();
        int n = digits.length;
        memo = new Pair[n][2][2][11][11];
        seen = new boolean[n][2][2][11][11];
        return dfs(0, 1, 0, 10, 10).sum;
    }

    private Pair dfs(int pos, int tight, int started, int prev2, int prev1) {
        if (pos == digits.length) {
            return new Pair(1, 0);
        }
        if (seen[pos][tight][started][prev2][prev1]) {
            return memo[pos][tight][started][prev2][prev1];
        }
        seen[pos][tight][started][prev2][prev1] = true;
        int limit = tight == 1 ? digits[pos] - '0' : 9;
        long totalCount = 0;
        long totalSum = 0;
        for (int d = 0; d <= limit; d++) {
            int nextTight = (tight == 1 && d == limit) ? 1 : 0;
            if (started == 0 && d == 0) {
                // still leading zeros, number not started
                Pair nxt = dfs(pos + 1, nextTight, 0, 10, 10);
                totalCount += nxt.count;
                totalSum += nxt.sum;
            } else if (started == 0) {
                // first real digit
                Pair nxt = dfs(pos + 1, nextTight, 1, 10, d);
                totalCount += nxt.count;
                totalSum += nxt.sum;
            } else if (prev2 == 10) {
                // second real digit
                Pair nxt = dfs(pos + 1, nextTight, 1, prev1, d);
                totalCount += nxt.count;
                totalSum += nxt.sum;
            } else {
                // now prev1 is an interior candidate, decide if it is peak/valley
                int add = 0;
                if ((prev1 > prev2 && prev1 > d) || (prev1 < prev2 && prev1 < d)) {
                    add = 1;
                }
                Pair nxt = dfs(pos + 1, nextTight, 1, prev1, d);
                totalCount += nxt.count;
                totalSum += nxt.sum + add * nxt.count;
            }
        }
        memo[pos][tight][started][prev2][prev1] = new Pair(totalCount, totalSum);
        return memo[pos][tight][started][prev2][prev1];
    }
}
