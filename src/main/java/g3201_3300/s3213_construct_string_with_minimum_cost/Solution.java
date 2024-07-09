package g3201_3300.s3213_construct_string_with_minimum_cost;

// #Hard #Array #String #Dynamic_Programming #Suffix_Array
// #2024_07_09_Time_182_ms_(100.00%)_Space_61.4_MB_(72.97%)

import java.util.Arrays;

public class Solution {
    private static int invalid = Integer.MAX_VALUE;

    private static class Node {
        int cost = -1;
        Node[] chd = new Node[26];
    }

    private Node rt;

    public int minimumCost(String target, String[] words, int[] costs) {
        rt = new Node();
        int m = words.length;
        int n = target.length();
        for (int i = 0; i < m; ++i) {
            if (words[i].length() <= n) {
                insert(words[i], costs[i]);
            }
        }
        int[] dp = new int[n + 1];
        Arrays.fill(dp, invalid);
        dp[0] = 0;
        for (int i = 0; i < n; ++i) {
            if (dp[i] == invalid) {
                continue;
            }
            int nowC = dp[i];
            Node now = rt;
            for (int j = i; now != null && j < n; ++j) {
                int ch = target.charAt(j) - 'a';
                now = now.chd[ch];
                if (now != null && now.cost != -1) {
                    dp[j + 1] = Math.min(dp[j + 1], nowC + now.cost);
                }
            }
        }

        return dp[n] == invalid ? -1 : dp[n];
    }

    private void insert(String wd, int cst) {
        int len = wd.length();
        Node now = rt;
        for (int i = 0; i < len; ++i) {
            int ch = wd.charAt(i) - 'a';
            if (now.chd[ch] == null) {
                now.chd[ch] = new Node();
            }
            now = now.chd[ch];
        }
        if (now.cost == -1 || now.cost > cst) {
            now.cost = cst;
        }
    }
}
