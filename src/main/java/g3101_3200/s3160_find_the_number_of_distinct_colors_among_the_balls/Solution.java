package g3101_3200.s3160_find_the_number_of_distinct_colors_among_the_balls;

// #Medium #Array #Hash_Table #Simulation #2024_05_30_Time_36_ms_(98.82%)_Space_79.6_MB_(93.03%)

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("java:S1172")
public class Solution {
    public int[] queryResults(int ignoredLimit, int[][] queries) {
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorToCnt = new HashMap<>();
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i += 1) {
            final int ball = queries[i][0];
            final int color = queries[i][1];
            if (ballToColor.containsKey(ball)) {
                int oldColor = ballToColor.get(ball);
                int oldColorCnt = colorToCnt.get(oldColor);
                if (oldColorCnt >= 2) {
                    colorToCnt.put(oldColor, oldColorCnt - 1);
                } else {
                    colorToCnt.remove(oldColor);
                }
            }
            ballToColor.put(ball, color);
            colorToCnt.put(color, colorToCnt.getOrDefault(color, 0) + 1);
            ret[i] = colorToCnt.size();
        }
        return ret;
    }
}
