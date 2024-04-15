package g2701_2800.s2712_minimum_cost_to_make_all_characters_equal;

// #Medium #String #Dynamic_Programming #Greedy
// #2023_09_15_Time_7_ms_(94.19%)_Space_44.2_MB_(74.81%)

public class Solution {
    public long minimumCost(String s) {
        long ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                ans += Math.min(i, s.length() - i);
            }
        }
        return ans;
    }
}
