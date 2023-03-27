package g1701_1800.s1744_can_you_eat_your_favorite_candy_on_your_favorite_day;

// #Medium #Array #Prefix_Sum #2022_04_29_Time_5_ms_(100.00%)_Space_91.1_MB_(76.00%)

public class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        long[] candiesComm = new long[candiesCount.length + 1];
        for (int i = 1; i <= candiesCount.length; i++) {
            candiesComm[i] = candiesComm[i - 1] + candiesCount[i - 1];
        }
        for (int i = 0; i < queries.length; i++) {
            int type = queries[i][0];
            long day = queries[i][1];
            long cap = queries[i][2];
            result[i] = ((day + 1) * cap > candiesComm[type]) && day < candiesComm[type + 1];
        }
        return result;
    }
}
