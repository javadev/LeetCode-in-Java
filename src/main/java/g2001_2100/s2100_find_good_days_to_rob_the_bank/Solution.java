package g2001_2100.s2100_find_good_days_to_rob_the_bank;

// #Medium #Array #Dynamic_Programming #Prefix_Sum
// #2022_05_17_Time_13_ms_(46.46%)_Space_99.4_MB_(51.27%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        // dec: # of non-increasing elements before [i]
        // inc: # of non-decreasing elements after [i]
        int[] dec = new int[n];
        int[] inc = new int[n];
        for (int i = 1; i < n; i++) {
            if (security[i] <= security[i - 1]) {
                dec[i] = dec[i - 1] + 1;
            }
            // no need for else, because array elements are inited as 0
        }
        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                inc[i] = inc[i + 1] + 1;
            }
            // no need for else, because array elements are inited as 0
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dec[i] >= time && inc[i] >= time) {
                res.add(i);
            }
        }
        return res;
    }
}
