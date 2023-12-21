package g1301_1400.s1375_number_of_times_binary_string_is_prefix_aligned;

// #Medium #Array #2022_03_22_Time_2_ms_(89.02%)_Space_64.5_MB_(21.14%)

public class Solution {
    public int numTimesAllBlue(int[] flips) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < flips.length; i++) {
            max = Math.max(max, flips[i]);
            if (max == i + 1) {
                ++ans;
            }
        }
        return ans;
    }
}
