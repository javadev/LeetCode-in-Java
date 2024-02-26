package g1601_1700.s1615_maximal_network_rank;

// #Medium #Graph #Graph_Theory_I_Day_14_Graph_Theory
// #2022_04_13_Time_3_ms_(97.34%)_Space_42.8_MB_(92.41%)

public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] degrees = new int[n];
        boolean[] connected = new boolean[40_000];
        for (int[] r : roads) {
            degrees[r[0]]++;
            degrees[r[1]]++;
            connected[(r[0] + 101) * (r[1] + 101) - 1] = true;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (connected[(i + 101) * (j + 101) - 1]) {
                    max = Math.max(max, degrees[i] + degrees[j] - 1);
                } else {
                    max = Math.max(max, degrees[i] + degrees[j]);
                }
            }
        }
        return max;
    }
}
