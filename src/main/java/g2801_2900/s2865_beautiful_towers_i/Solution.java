package g2801_2900.s2865_beautiful_towers_i;

// #Medium #Array #Stack #Monotonic_Stack #2023_12_20_Time_13_ms_(74.26%)_Space_43.4_MB_(45.54%)

import java.util.List;

public class Solution {
    private long fun(List<Integer> maxHeights, int pickId) {
        long ans = maxHeights.get(pickId);
        long min = maxHeights.get(pickId);
        for (int i = pickId - 1; i >= 0; i--) {
            min = Math.min(min, maxHeights.get(i));
            ans += min;
        }
        min = maxHeights.get(pickId);
        for (int i = pickId + 1; i < maxHeights.size(); i++) {
            min = Math.min(min, maxHeights.get(i));
            ans += min;
        }
        return ans;
    }

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0
                    || i == n - 1
                    || (maxHeights.get(i) >= maxHeights.get(i - 1)
                            && maxHeights.get(i) >= maxHeights.get(i + 1))) {
                ans = Math.max(ans, fun(maxHeights, i));
            }
        }
        return ans;
    }
}
