package g3601_3700.s3694_distinct_points_reachable_after_substring_removal;

// #Medium #String #Hash_Table #Prefix_Sum #Sliding_Window #Biweekly_Contest_166
// #2025_10_07_Time_38_ms_(97.74%)_Space_46.84_MB_(98.59%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distinctPoints(String s, int k) {
        Set<Long> seen = new HashSet<>();
        seen.add(0L);
        int x = 0;
        int y = 0;
        for (int i = k; i < s.length(); i++) {
            // add new step
            switch (s.charAt(i)) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x++;
                    break;
                case 'R':
                default:
                    x--;
                    break;
            }
            // remove old step
            switch (s.charAt(i - k)) {
                case 'U':
                    y--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                default:
                    x++;
                    break;
            }
            seen.add(1000000L * x + y);
        }
        return seen.size();
    }
}
