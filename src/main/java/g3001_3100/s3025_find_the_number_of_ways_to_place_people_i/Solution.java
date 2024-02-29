package g3001_3100.s3025_find_the_number_of_ways_to_place_people_i;

// #Medium #Array #Math #Sorting #Enumeration #Geometry
// #2024_02_29_Time_5_ms_(99.84%)_Space_44.7_MB_(30.13%)

import java.util.Arrays;

public class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int cnt = 0;
        for (int i = 0; i < points.length; i++) {
            int bot = Integer.MIN_VALUE;
            int top = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                int y1 = points[j][1];
                if (y1 <= top && y1 > bot) {
                    cnt++;
                    bot = y1;
                    if (y1 == top) {
                        top--;
                    }
                }
            }
        }
        return cnt;
    }
}
