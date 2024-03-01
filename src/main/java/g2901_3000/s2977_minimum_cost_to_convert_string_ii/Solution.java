package g2901_3000.s2977_minimum_cost_to_convert_string_ii;

// #Hard #Array #String #Dynamic_Programming #Graph #Trie #Shortest_Path
// #2024_01_18_Time_167_ms_(62.13%)_Space_45.8_MB_(48.88%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public long minimumCost(
            String source, String target, String[] original, String[] changed, int[] cost) {
        HashMap<String, Integer> index = new HashMap<>();
        for (String o : original) {
            if (!index.containsKey(o)) {
                index.put(o, index.size());
            }
        }
        for (String c : changed) {
            if (!index.containsKey(c)) {
                index.put(c, index.size());
            }
        }
        long[][] dis = new long[index.size()][index.size()];
        for (int i = 0; i < dis.length; i++) {
            Arrays.fill(dis[i], Long.MAX_VALUE);
            dis[i][i] = 0;
        }
        for (int i = 0; i < cost.length; i++) {
            dis[index.get(original[i])][index.get(changed[i])] =
                    Math.min(dis[index.get(original[i])][index.get(changed[i])], cost[i]);
        }
        for (int k = 0; k < dis.length; k++) {
            for (int i = 0; i < dis.length; i++) {
                if (dis[i][k] < Long.MAX_VALUE) {
                    for (int j = 0; j < dis.length; j++) {
                        if (dis[k][j] < Long.MAX_VALUE) {
                            dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
                        }
                    }
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (String o : original) {
            set.add(o.length());
        }
        long[] dp = new long[target.length() + 1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0L;
        for (int i = 0; i < target.length(); i++) {
            if (dp[i] == Long.MAX_VALUE) {
                continue;
            }
            if (target.charAt(i) == source.charAt(i)) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i]);
            }
            for (int t : set) {
                if (i + t >= dp.length) {
                    continue;
                }
                int c1 = index.getOrDefault(source.substring(i, i + t), -1);
                int c2 = index.getOrDefault(target.substring(i, i + t), -1);
                if (c1 >= 0 && c2 >= 0 && dis[c1][c2] < Long.MAX_VALUE) {
                    dp[i + t] = Math.min(dp[i + t], dp[i] + dis[c1][c2]);
                }
            }
        }
        return dp[dp.length - 1] == Long.MAX_VALUE ? -1L : dp[dp.length - 1];
    }
}
