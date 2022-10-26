package g2301_2400.s2379_minimum_recolors_to_get_k_consecutive_black_blocks;

// #Easy #String #Sliding_Window #2022_08_23_Time_1_ms_(80.00%)_Space_42.2_MB_(20.00%)

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int ans;
        int i;
        int cur = 0;
        for (i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                cur++;
            }
        }
        ans = cur;
        for (i = k; i < n; i++) {
            if (blocks.charAt(i) == 'W') {
                cur++;
            }
            if (blocks.charAt(i - k) == 'W') {
                cur--;
            }
            ans = Math.min(ans, cur);
        }
        return ans;
    }
}
