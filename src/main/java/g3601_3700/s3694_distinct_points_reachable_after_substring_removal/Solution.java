package g3601_3700.s3694_distinct_points_reachable_after_substring_removal;

// #Medium #Biweekly_Contest_166 #2025_09_28_Time_37_ms_(100.00%)_Space_46.42_MB_(100.00%)

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
