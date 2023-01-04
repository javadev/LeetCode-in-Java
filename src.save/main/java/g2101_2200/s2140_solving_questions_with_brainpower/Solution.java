package g2101_2200.s2140_solving_questions_with_brainpower;

// #Medium #Array #Dynamic_Programming #2022_06_05_Time_5_ms_(98.77%)_Space_92.6_MB_(94.67%)

public class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] memo = new long[n];
        memo[n - 1] = questions[n - 1][0];
        for (int i = n - 2; i >= 0; i--) {
            if (i + questions[i][1] + 1 < n) {
                memo[i] = Math.max(memo[i + 1], questions[i][0] + memo[i + questions[i][1] + 1]);
            } else {
                memo[i] = Math.max(memo[i + 1], questions[i][0]);
            }
        }
        return memo[0];
    }
}
