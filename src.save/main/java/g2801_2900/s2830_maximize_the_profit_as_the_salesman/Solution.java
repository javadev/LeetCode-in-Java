package g2801_2900.s2830_maximize_the_profit_as_the_salesman;

// #Medium #Array #Dynamic_Programming #Sorting #Binary_Search
// #2023_12_11_Time_36_ms_(80.00%)_Space_76.3_MB_(73.13%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int maximizeTheProfit(int n, List<List<Integer>> offers) {
        int[] dp = new int[n];
        HashMap<Integer, List<List<Integer>>> range = new HashMap<>();
        for (List<Integer> l : offers) {
            if (range.containsKey(l.get(0))) {
                range.get(l.get(0)).add(l);
            } else {
                List<List<Integer>> r = new ArrayList<>();
                r.add(l);
                range.put(l.get(0), r);
            }
        }
        int i = 0;
        while (i < n) {
            List<List<Integer>> temp = new ArrayList<>();
            if (range.containsKey(i)) {
                temp = range.get(i);
            }
            dp[i] = (i != 0) ? Math.max(dp[i], dp[i - 1]) : dp[i];
            for (List<Integer> l : temp) {
                dp[l.get(1)] =
                        (i != 0)
                                ? Math.max(dp[l.get(1)], dp[i - 1] + l.get(2))
                                : Math.max(dp[l.get(1)], l.get(2));
            }
            i++;
        }
        return dp[n - 1];
    }
}
