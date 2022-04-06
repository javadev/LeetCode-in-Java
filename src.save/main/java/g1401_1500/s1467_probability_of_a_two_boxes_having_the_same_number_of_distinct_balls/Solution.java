package g1401_1500.s1467_probability_of_a_two_boxes_having_the_same_number_of_distinct_balls;

// #Hard #Dynamic_Programming #Math #Backtracking #Combinatorics #Probability_and_Statistics
// #2022_03_29_Time_1_ms_(100.00%)_Space_40_MB_(77.08%)

public class Solution {
    public double getProbability(int[] balls) {
        int m = balls.length;
        int s = 0;
        for (int b : balls) {
            s += b;
        }
        double[][] c = new double[s + 1][s / 2 + 1];
        c[0][0] = 1;
        for (int i = 1; i < s + 1; i++) {
            c[i][0] = 1;
            for (int j = 1; j < s / 2 + 1; j++) {
                c[i][j] = c[i - 1][j] + c[i - 1][j - 1];
            }
        }
        double[][] dp = new double[2 * m + 1][s / 2 + 1];
        dp[m][0] = 1;
        int sum = 0;
        for (int b : balls) {
            sum += b;
            double[][] ndp = new double[2 * m + 1][s / 2 + 1];
            for (int i = 0; i <= b; i++) {
                for (int j = 0; j < 2 * m + 1; j++) {
                    for (int k = 0; k < s / 2 + 1; k++) {
                        if (dp[j][k] == 0) {
                            continue;
                        }
                        int nk = k + i;
                        int nr = sum - nk;
                        if (nk <= s / 2 && nr <= s / 2) {
                            int i1 = (i == b) ? j + 1 : j;
                            int nj = (i == 0) ? j - 1 : i1;
                            ndp[nj][nk] += dp[j][k] * c[b][i];
                        }
                    }
                }
            }
            dp = ndp;
        }
        return dp[m][s / 2] / c[s][s / 2];
    }
}
