package g3601_3700.s3680_generate_schedule;

// #Medium #Biweekly_Contest_165 #2025_09_14_Time_67_ms_(100.00%)_Space_45.58_MB_(100.00%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] generateSchedule(int n) {
        int[][] res = new int[n * (n - 1)][2];
        boolean[][] matches = new boolean[n][n];
        res[0] = new int[] {0, 1};
        matches[0][1] = true;
        int[] matchesCount = new int[n];
        matchesCount[0] = 1;
        matchesCount[1] = 1;
        if (backtrack(n, matches, res, 1, matchesCount)) {
            return res;
        }
        return new int[][] {};
    }

    private boolean backtrack(
            int n, boolean[][] matches, int[][] result, int cur, int[] matchesCount) {
        if (cur == result.length) {
            return true;
        }
        Integer[] teams = new Integer[n];
        for (int i = 0; i < n; i++) {
            teams[i] = i;
        }
        Arrays.sort(teams, Comparator.comparingInt(a -> matchesCount[a]));
        for (int i = 0; i < n; i++) {
            if (result[cur - 1][0] != teams[i] && result[cur - 1][1] != teams[i]) {
                int team1 = -1;
                int team2 = -1;
                for (int j = 0; j < n; j++) {
                    if (i != j
                            && !matches[teams[i]][teams[j]]
                            && result[cur - 1][0] != teams[j]
                            && result[cur - 1][1] != teams[j]) {
                        team1 = teams[i];
                        team2 = teams[j];
                        break;
                    }
                }
                if (team1 != -1) {
                    result[cur] = new int[] {team1, team2};
                    matches[team1][team2] = true;
                    matchesCount[team1]++;
                    matchesCount[team2]++;
                    boolean found = backtrack(n, matches, result, cur + 1, matchesCount);
                    if (found) {
                        return true;
                    } else {
                        matches[team1][team2] = false;
                        result[cur] = new int[] {0, 0};
                        matchesCount[team1]--;
                        matchesCount[team2]--;
                    }
                }
            }
        }
        return false;
    }
}
