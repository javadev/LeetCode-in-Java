package g3301_3400.s3386_button_with_longest_push_time;

// #Easy #Array #2024_12_18_Time_0_ms_(100.00%)_Space_45_MB_(38.39%)

public class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int ans = 0;
        int time = 0;
        int last = 0;
        for (int[] event : events) {
            int diff = event[1] - last;
            if (diff > time) {
                time = diff;
                ans = event[0];
            } else if (diff == time) {
                ans = Math.min(ans, event[0]);
            }
            last = event[1];
        }
        return ans;
    }
}
