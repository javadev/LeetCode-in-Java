package g1401_1500.s1467_probability_of_a_two_boxes_having_the_same_number_of_distinct_balls;

// #Hard #Dynamic_Programming #Math #Backtracking #Combinatorics #Probability_and_Statistics
// #2022_03_29_Time_1_ms_(100.00%)_Space_40_MB_(77.08%)

public class Solution {
    public double getProbability(int[] balls) {
        int m = balls.length;
        int S = 0;
        for (int b : balls) S += b;
        double[][] C = new double[S + 1][S / 2 + 1];
        C[0][0] = 1;
        for (int i = 1; i < S + 1; i++) {
            C[i][0] = 1;
            for (int j = 1; j < S / 2 + 1; j++) {
                C[i][j] = C[i - 1][j] + C[i - 1][j - 1];
            }
        }
        double[][] dp = new double[2 * m + 1][S / 2 + 1];
        dp[m][0] = 1;
        int sum = 0;
        for (int b : balls) {
            sum += b;
            double[][] ndp = new double[2 * m + 1][S / 2 + 1];
            for (int i = 0; i <= b; i++) {
                for (int j = 0; j < 2 * m + 1; j++) {
                    for (int k = 0; k < S / 2 + 1; k++) {
                        if (dp[j][k] == 0) {
                            continue;
                        }
                        int nk = k + i;
                        int nr = sum - nk;
                        if (nk <= S / 2 && nr <= S / 2) {
                            int nj = (i == 0) ? j - 1 : (i == b) ? j + 1 : j;
                            ndp[nj][nk] += dp[j][k] * C[b][i];
                        }
                    }
                }
            }
            dp = ndp;
        }
        return dp[m][S / 2] / C[S][S / 2];
    }
}
