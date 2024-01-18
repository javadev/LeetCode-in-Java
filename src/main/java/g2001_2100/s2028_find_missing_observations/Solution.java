package g2001_2100.s2028_find_missing_observations;

// #Medium #Array #Math #Simulation #2022_05_25_Time_10_ms_(31.40%)_Space_165.4_MB_(26.74%)

public class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int msum = 0;
        int[] res = new int[n];
        for (int roll : rolls) {
            msum += roll;
        }
        int totalmn = mean * (m + n) - msum;
        if (totalmn < n || totalmn > n * 6) {
            return new int[0];
        }
        int j = 0;
        while (totalmn > 0) {
            int dice = Math.min(6, totalmn - n + 1);
            res[j] = dice;
            totalmn = totalmn - dice;
            n--;
            j++;
        }
        return res;
    }
}
