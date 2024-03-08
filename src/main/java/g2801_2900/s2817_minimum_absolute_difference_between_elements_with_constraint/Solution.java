package g2801_2900.s2817_minimum_absolute_difference_between_elements_with_constraint;

// #Medium #Array #Binary_Search #Ordered_Set #2023_11_20_Time_104_ms_(96.69%)_Space_63.9_MB_(9.52%)

import java.util.List;
import java.util.TreeSet;

public class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        // if (x == 0) x = 1;
        TreeSet<Integer> xt = new TreeSet<>();
        int start = nums.size() - 1 - x;
        int j = nums.size() - 1;
        int zx = Integer.MAX_VALUE;
        for (int i = start; i >= 0; i--, j--) {
            int nowr = nums.get(j);
            xt.add(nowr);
            int now = nums.get(i);
            Integer xy = xt.floor(now);
            Integer dy = xt.ceiling(now);
            if (xy != null) {
                zx = Math.min(zx, Math.abs(xy - now));
            }
            if (dy != null) {
                zx = Math.min(zx, Math.abs(dy - now));
            }
        }
        return zx;
    }
}
