package g3001_3100.s3096_minimum_levels_to_gain_more_points;

// #Medium #Array #Prefix_Sum #2024_04_19_Time_3_ms_(99.97%)_Space_59.6_MB_(49.99%)

public class Solution {
    public int minimumLevels(int[] possible) {
        int n = possible.length;
        int sum = 0;
        for (int p : possible) {
            sum += p;
        }
        if (sum == 0 && n == 2) {
            return -1;
        }
        if (sum == 0 && n > 2) {
            return 1;
        }
        int sumLeft = 0;
        for (int i = 0; i < n - 1; i++) {
            sumLeft += possible[i];
            int sumRight = sum - sumLeft;
            int danScore = sumLeft - ((i + 1) - sumLeft);
            int bobScore = sumRight - ((n - i - 1) - sumRight);
            if (danScore > bobScore) {
                return i + 1;
            }
        }
        return -1;
    }
}
