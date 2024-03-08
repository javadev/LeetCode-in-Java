package g1601_1700.s1626_best_team_with_no_conflicts;

// #Medium #Array #Dynamic_Programming #Sorting
// #2022_04_18_Time_38_ms_(92.31%)_Space_42.2_MB_(93.12%)

import java.util.Arrays;

public class Solution {
    private static class Pair {
        int score;
        int age;

        Pair(int score, int age) {
            this.score = score;
            this.age = age;
        }
    }

    private final int[][] memo = new int[1001][1001];

    public int bestTeamScore(int[] scores, int[] ages) {
        int n = ages.length;
        Pair[] p = new Pair[n];
        for (int[] x : memo) {
            Arrays.fill(x, -1);
        }
        for (int i = 0; i < n; i++) {
            p[i] = new Pair(scores[i], ages[i]);
        }
        Arrays.sort(p, (a, b) -> (a.score == b.score) ? (a.age - b.age) : a.score - b.score);
        return find(p, 0, 0, n);
    }

    private int find(Pair[] p, int i, int max, int n) {
        if (i >= n) {
            return 0;
        }
        if (memo[i][max] != -1) {
            return memo[i][max];
        }
        if (p[i].age >= max) {
            int x1 = p[i].score + find(p, i + 1, p[i].age, n);
            int x2 = find(p, i + 1, max, n);
            memo[i][max] = Math.max(x1, x2);
        } else {
            memo[i][max] = find(p, i + 1, max, n);
        }
        return memo[i][max];
    }
}
