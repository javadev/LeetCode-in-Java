package g1801_1900.s1833_maximum_ice_cream_bars;

// #Medium #Array #Sorting #Greedy #2022_05_07_Time_39_ms_(84.49%)_Space_56.7_MB_(78.12%)

import java.util.Arrays;

public class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0;
        int ans = 0;
        while (i < costs.length && costs[i] <= coins) {
            coins -= costs[i];
            i++;
            ans++;
        }
        return ans;
    }
}
