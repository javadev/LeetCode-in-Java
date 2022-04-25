package g1701_1800.s1725_number_of_rectangles_that_can_form_the_largest_square;

// #Easy #Array #2022_04_25_Time_9_ms_(9.22%)_Space_42.6_MB_(87.06%)

import java.util.TreeMap;

public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] rec : rectangles) {
            int min = Math.min(rec[0], rec[1]);
            map.put(min, map.getOrDefault(min, 0) + 1);
        }
        return map.lastEntry().getValue();
    }
}
