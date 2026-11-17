package g3901_4000.s3995_minimum_cost_to_convert_string_iii;

// #Hard #Array #String #Dynamic_Programming #Senior_Staff #Biweekly_Contest_187
// #2026_11_17_Time_10_ms_(100.00%)_Space_47.23_MB_(68.97%)

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public int minCost(String source, String target, List<List<String>> rules, int[] costs) {
        int n = source.length();
        if (n != target.length()) {
            return -1;
        }
        if (source.equals(target)) {
            return 0;
        }
        int m = rules.size();
        int[] len = new int[m];
        String[] pat = new String[m];
        String[] rep = new String[m];
        int[] rulesCost = new int[m];
        for (int i = 0; i < m; i++) {
            String p = rules.get(i).get(0);
            String r = rules.get(i).get(1);
            pat[i] = p;
            rep[i] = r;
            len[i] = p.length();
            int wild = 0;
            for (char c : p.toCharArray()) {
                if (c == '*') {
                    wild++;
                }
            }
            rulesCost[i] = costs[i] + wild;
        }
        int in = Integer.MAX_VALUE / 2;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, in);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == in) {
                continue;
            }
            if (source.charAt(i) == target.charAt(i) && dp[i] < dp[i + 1]) {
                dp[i + 1] = dp[i];
            }
            for (int k = 0; k < m; k++) {
                int l = len[k];
                if (i + l > n) {
                    continue;
                }
                boolean match = true;
                for (int j = 0; j < l; j++) {
                    char pc = pat[k].charAt(j);
                    char sc = source.charAt(i + j);
                    if (pc != '*' && pc != sc) {
                        match = false;
                        break;
                    }
                }
                if (!match) {
                    continue;
                }
                if (!target.substring(i, i + l).equals(rep[k])) {
                    continue;
                }
                int nd = dp[i] + rulesCost[k];
                if (nd < dp[i + l]) {
                    dp[i + l] = nd;
                }
            }
        }
        return dp[n] >= in ? -1 : dp[n];
    }
}
